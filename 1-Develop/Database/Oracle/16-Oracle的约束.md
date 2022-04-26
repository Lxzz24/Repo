# **16 - Oracle的约束**
[<<返回首页](database/Oracle.md)

## 主键约束（PRIMARY KEY)
**主键**是定位表中单个行的方式，可唯一确定表中的某一行，关系型数据库要求所有表都应该有主键，不过Oracle没有遵循此范例要求，Oracle中的表可以没有主键（这种情况不多见）。

> 1. 键列必须具有唯一性，且不能为空，其实主键约束相当于 `UNIQUE` + `NOT NULL`
> 2. **一个表只允许有一个主键**
> 3. 主键所在列必须具有索引（主键的唯一约束通过索引来实现），如果不存在，将会在索引添加的时候自动创建。

**添加主键**  
（约束的添加可在建表时创建，也可如下所示在建表后添加，一般推荐建表后添加，灵活度更高一些，建表时添加某些约束会有限制）  
`SQL> alter table emp add constraint emp_id_pk primary key(id);`  


## 唯一性约束（UNIQUE）
唯一性约束可作用在单列或多列上，对于这些列或列组合，唯一性约束保证每一行的唯一性。 

**UNIQUE 需要注意：**
> 1. 对于UNIQUE约束来讲，索引是必须的。如果不存在，就自动创建一个（UNIQUE的唯一性本质上是通过索引来保证的）
> 2. UNIQUE允许null值，UNIQUE约束的列可存在多个null。这是因为，Unique唯一性通过btree索引来实现，而btree索引中不包含null。当然，这也造成了在where语句中用null值进行过滤会造成全表扫描。

**添加唯一约束**  
    `SQL> alter table emp add constraint emp_code_uq unique(code);`


## 非空约束（NOT NULL)
非空约束作用的列也叫强制列。顾名思义，强制键列中必须有值，当然建表时候若使用default关键字指定了默认值，则可不输入。

**添加非空约束**  
`SQL> alter table emp modify ename not null;`


## 外键约束（FOREIGN KEY）
外键约束定义在具有父子关系的子表中，外键约束使得子表中的列对应父表的主键列，用以维护数据库的完整性。

不过出于性能和后期的业务系统的扩展的考虑，很多时候，外键约束仅出现在数据库的设计中，实际会放在业务程序中进行处理。

**外键约束注意以下几点：**
> 1. 外键约束的子表中的列和对应父表中的列数据类型必须相同，列名可以不同
> 2. 对应的父表列必须存在主键约束（PRIMARY KEY）或唯一约束（UNIQUE）
> 3. 外键约束列允许NULL值，对应的行就成了孤行了

其实很多时候不使用外键，很多人认为会让删除操作比较麻烦，比如要删除父表中的某条数据，但某个子表中又有对该条数据的引用，这时就会导致删除失败。我们有两种方式来优化这种场景：
- **第一种方式**，删除的时候，级联删除掉子表中的所有匹配行，在创建外键时，通过 on delete cascade 子句指定该外键列可级联删除：  
`SQL> alter table emp add constraint emp_deptno_fk foreign key(deptno) references dept (deptno) on delete cascade;`
- **第二种方式**，删除父表中的对应行，会将对应子表中的所有匹配行的外键约束列置为NULL，通过 on delete set null 子句实施：  
`SQL> alter table emp add constraint emp_deptno_fk foreign key(deptno) references dept(deptno) on delete set null;`

## 检查约束（CHECK)
检查约束可用来实施一些简单的规则，比如列值必须在某个范围内。检查的规则必须是一个结果为 true 或 false 的表达式
