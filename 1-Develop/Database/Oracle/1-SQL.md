# **1 - SQL**
[<<返回首页](database/Oracle.md)
## 1. 常用关系型数据库
**MySQL**, SQL Server, **Oracle**, Sybase, DB2


## 2. E-R图
实体-联系图(Entity Relationship Diagram):提供了表示实体类型、属性和联系的方法, 存在3种一般性约束：

* 一对一约束（联系）
* 一对多约束（联系）
* 多对多约束（联系）


## 3. 数据库设计（**三大范式**）

### 第一范式：
**当关系模式R的所有属性都不能在分解为更基本的数据单位时，称R是满足第一范式的，简记为1NF。**  
（满足第一范式是关系模式规范化的最低要求）每一列属性都是不可再分的属性值，确保每一列的原子性。
对一个对象进行描述的时候，每一个属性必须是最小的、不可再分解的原子。

### 第二范式：
**如果关系模式R满足第一范式，并且R得所有非主属性都完全依赖于R的每一个候选关键属性，称R满足第二范式，简记为2NF。**  
每一行的数据只能与其中一列相关，即一行数据只做一件事。只要数据列中出现数据重复，就要把表拆分开来。

### 第三范式：
**设R是一个满足第一范式条件的关系模式，X是R的任意属性集，如果X非传递依赖于R的任意一个候选关键字，称R满足第三范式，简记为3NF。**  
数据不能存在传递关系，即每个属性都跟主键有直接关系而不是间接关系。
​

### 结构化查询语言(Structured Query Language)  
简称SQL，结构化查询语言是一种数据库查询和程序设计语言，用于存取数据以及查询、更新和管理关系数据库系统；sql 语句就是对数据库进行操作的一种语言。  

| 名称 | 常用命令 |
| :--: | --- |
| **数据定义语言（DDL）** | 包括 CREATE（创建）命令、 ALTER（修改）命令、 DROP（删除）命令等。 |
| **数据操纵语言（DML）** | 包括 INSERT（插入）命令、 UPDATE（更新）命令、 DELETE（删除）命令、 SELECT … FOR UPDATE（查询）等。 |
| **数据查询语言（DQL）** | 包括基本查询语句、 Order By 子句、 Group By 子句等。 |
| **事务控制语言（TCL）** | 包括 COMMIT（提交）命令、 SAVEPOINT（保存点）命令、ROLLBACK（回滚）命令。 |
| **数据控制语言（DCL）** | GRANT（授权）命令、 REVOKE（撤销）命令。 |

#### **DML**（改变表数据） 
1. 添加数据：  
`insert into 表名(列名…) values(值…);`
​

2. 复制数据：  
`insert into 表名`
`select 列名1,列名2... from 表名;`
> 复制数据的时候，两张表的字段数量和类型必须要相同
​

3. 修改数据：  
`update 表名`
`set 列1=值1, 列2=值2, …`
`where 条件；`
​

4. 删除数据：  
`delete from 表名 where 条件;`(删除指定的数据)  
`delete from 表名;`(删除表中的所有数据,但是不摧毁表结构)
​

#### **DDL**（改变表结构）

1. 创建表：  
`create table tb_user (name varchar(50), age int, sex char(4));`
​

2. 查询表：  
`select * from tb_user;`


3. 给表增加多两列：  address、phone   
`alter table tb_user add(address varchar(100), phone varchar(50));`
​

4. 删掉多余的列：  
`alter table tb_user drop(phone);`


5. 修改列的长度：  
`alter table tb_user modify(address varchar(80));`
​

6. 修改表名：  
`rename tb_user to tb_person;`
​
7. 删除有两种方式：drop 和 truncate   

    * **drop**：删除表，把整个表都给干掉，找不回来 （慎用）  
    `drop table tb_person; `  
    `select * from tb_person;`  

    * **truncate**：截断表，只会把表中的数据清空，表还会在   
    `truncate table tb_user; `  
    `select * from tb_user;`  
