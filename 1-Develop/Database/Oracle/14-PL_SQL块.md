# **14 - PL/SQL块**
[<<返回首页](database/Oracle.md)

`PL/SQL` 是一种块结构的语言，一个 `PL/SQL` 程序包含了一个或者多个逻辑块，逻辑块中可以声明变量，变量在使用之前必须先声明。除了正常的执行程序外， `PL/SQL` 还提供了专门的异常处理部分进行异常处理。

## PL / SQL 块的语法
每个逻辑块分为三个部分，语法是：
```
[DECLARE  --declaration statements] ①
BEGIN  --executable statements ②
[EXCEPTION  --exception statements] ③
END;
```  

### 语法解析：
① **声明部分**：声明部分包含了变量和常量的定义。这个部分由关键字 DECLARE 开始，
如果不声明变量或者常量，可以省略这部分。

② **执行部分**：执行部分是 PL/SQL 块的指令部分，由关键字 BEGIN 开始，关键字 END 结尾。所有的可执行 PL/SQL 语句都放在这一部分，该部分执行命令并操作变量。
其他的 PL/SQL 块可以作为子块嵌套在该部分。 PL/SQL 块的执行部分是必选的。注意 END 关键字后面用分号结尾。

③ **异常处理部分**：该部分是可选的，该部分用 EXCEPTION 关键字把可执行部分分成两个小部分，之前的程序是正常运行的程序，一旦出现异常就跳转到异常部分执行。
​
## 特性
PL/SQL 是一种编程语言，与 Java 和 C#一样，除了有自身独有的数据类型、变量声明和赋值以及流程控制语句外， PL/SQL 还有自身的语言特性：
- PL/SQL 对大小写不敏感，为了良好的程序风格，开发团队都会选择一个合适的编码标准。
  - 比如有的团队规定：关键字全部大些，其余的部分小写。
- PL/SQL 块中的每一条语句都必须以分号结束， SQL 语句可以是多行的，但分号表示该语句结束。一行中可以有多条 SQL 语句，他们之间以分号分隔，但是不推荐一行中写多条语句。
- PL/SQL 中的特殊符号说明：

<table>
    <tr>
        <td>类型</td> 
        <td>符号</td>
        <td>说明</td> 
   </tr>
   <tr>
        <td>赋值运算符</td> 
        <td>:=</td> 
        <td>Java 和 C#中都是等号， PL/SQL 的赋值是 :=</td>
   </tr>
   <tr>
        <td rowspan="5">特殊字符</td> 
        <td>||</td>
        <td>字符串连接操作符</td>
   </tr>
    <tr>
        <td >--</td>    
        <td >PL/SQL 中的单行注释</td>  
    </tr>
    <tr>
        <td >/*,*/</td>
        <td >PL/SQL 中的多行注释，多行注释不能嵌套</td>  
    </tr>
    <tr>
        <td ><<,>></td>
        <td >标签分隔符。只为了标识程序特殊位置</td>  
    </tr>
    <tr>
        <td >..</td>
        <td >范围操作符，比如： 1..5 标识从 1 到 5</td>  
    </tr>
    <tr>
        <td rowspan="2">算术运算符</td>
        <td >+, -, *, /</td>
        <td >基本算术运算符</td>  
    </tr>
    <tr>
        <td >**</td>
        <td >求幂操作，比如： 3 ** 2 = 9</td>  
    </tr>
    <tr>
        <td rowspan="2">关系运算符</td>
        <td >>, <, >=, <=, =</td>
        <td >基本关系运算符， =表示相等关系，不是赋值</td>  
    </tr>
    <tr>
        <td ><>, !=</td>
        <td >不等关系</td>  
    </tr>
    <tr>
        <td >逻辑运算符</td>
        <td >AND, OR, NOT</td>
        <td >逻辑运算符</td>  
    </tr>
</table>
 

​

## 变量声明
PL/SQL 支持 SQL 中的数据类型， PL/SQL 中正常支持 NUMBER, VARCHAR2, DATE 等 Oracle SQL 数据类型。

声明变量必须指明变量的数据类型，也可以声明变量时对变量初始化，变量声明必须在声明部分。

声明变量的语法是：

`变量名 数据类型[ :=初始值]`

### 语法解析：
数据类型如果需要长度，可以用括号指明长度，比如： `varchar2(20)`。
​

代码演示：
```
DECLARE
​   sname VARCHAR2(20) :='jerry'; ①
BEGIN
​   sname:=sname||' and tom'; ②
​   dbms_output.put_line(sname); ③        (set serveroutput on)
END;
```


## 声明常量
常量在声明时赋予初值，并且在运行时不允许重新赋值。使用 CONSTANT 关键字声明常量。


代码演示：
```
DECLARE
​   pi CONSTANT number :=3.14; --圆周率长值 ①
​   r number DEFAULT 3; --圆的半径默认值3 ②
​   area number; --面积。
BEGIN
​   area:=pi*r*r; --计算面积
​   dbms_output.put_line(area); --输出圆的面积
END;
```

## 标量数据类型
标量数据类型的变量只有一个值，且内部没有分量。

标量数据类型包括数字型，字符型，日期型和布尔型。这些类型有的是 Oracle SQL 中定义的数据类型，有的是 PL/SQL 自身附加的数据类型。字符型和数字型又有子类型，子类型只与限定的范围有关，比如 NUMBER 类型可以表示整数，也可以表示小数，而其子类型 POSITIVE 只表示正整数。

| 类型 | 说明 |
| :--: | --- |
| VARCHAR2(长度) | 可变长度字符串， Oracle SQL 定义的数据类型，在 PL/SQL 中使用时最常 32767 字节。在 PL/SQL 中使用没有默认长度，因此必须指定。 |
| NUMBER(精度，小数) | Oracle SQL 定义的数据类型。 |
| DATE | Oracle SQL 定义的日期类型。 |
| TIMESTAMP | Oracle SQL 定义的日期类型。 |
| CHAR(长度) | Oracle SQL 定义的日期类型，固定长度字符，最长 32767 字节，默认长度是 1，如果内容不够用空格代替。 |
| LONG | Oracle SQL 定义的数据类型，变长字符串基本类型，最长 32760 字节。在 Oracle SQL 中最长 2147483647 字节。 |
| BOOLEAN | PL/SQL 附加的数据类型，逻辑值为 TRUE、 FALSE、 NULL |
| BINARY_INTEGER | PL/SQL 附加的数据类型，介于-231 和 231 之间的整数。 |
| PLS_INTEGER | PL/SQL 附加的数据类型，介于 -231 和 231 之间的整数。类似于BINARY_INTEGER，只是 PLS_INTEGER 值上的运行速度更快。 |
| NATURAL | PL/SQL 附加的数据类型， BINARY_INTEGER 子类型，表示从 0 开始的自然数。 |
| NATURALN | 与 NATURAL 一样，只是要求 NATURALN 类型变量值不能为 NULL。 |
| POSITIVE | PL/SQL 附加的数据类型， BINARY_INTEGER 子类型，正整数。 |
| POSITIVEN | 与 POSITIVE 一样，只是要求 POSITIVE 的变量值不能为 NULL。 |
| REAL | Oracle SQL 定义的数据类型， 18 位精度的浮点数 |
| INT,INTEGER,SMALLINT | Oracle SQL 定义的数据类型， NUMBERDE 的子类型， 38 位精度整数。 |
| SIGNTYPE | PL/SQL 附加的数据类型， BINARY_INTEGER 子类型。值有： 1、 -1、 0。 |
| STRING | 与 VARCHAR2 相同 |  

## 属性数据类型
当声明一个变量的值是数据库中的一行或者是数据库中某列时，可以直接使用属性类型来声明。 Oracle 中存在两种属性类型： `%TYPE` 和 `%ROWTYPE`。

### `%ROWTYPE`
引用数据库表中的一行作为数据类型，即 RECORD 类型（记录类型），是 PL/SQL 附加的数据类型。表示一条记录，就相当于 C#中的一个对象。可以使用“ .”来访问记录中的属性。

代码演示：
```
DECLARE
​   myemp EMP%ROWTYPE; ①
BEGIN
​   SELECT * INTO myemp FROM emp WHERE empno=7934; ②
​   dbms_output.put_line(myemp.ename); ③
END;
```   
​

代码解析：  
① 声明一个 myemp 对象，该对象表示 EMP 表中的一行。  
② 从 EMP 表中查询一条记录放入 myemp 对象中。  
③ 访问该对象的属性可以使用“ .”。  
​
### `%TYPE`
引用某个变量或者数据库的列的类型作为某变量的数据类型。

代码演示：


```
DECLARE​
    sal emp.sal%TYPE; ①
    mysal number(4):=3000;
    ​totalsal mysal%TYPE; ②
BEGIN
    SELECT SAL INTO sal FROM emp WHERE empno=7934;
    totalsal:=sal+mysal;
    dbms_output.put_line(totalsal);
END;
```  
​ 

    
代码解析：  
① 定义变量 sal 为 emp 表中 sal 列的类型。  
② 定义 totalsal 是变量 mysal 的类型。  

`%TYPE` 可以引用表中的某列作的类型为变量的数据类型，也可以引用某变量的类型作为新变量的数据类型。
​

```
IF 条件 THEN
    --条件结构体
END IF;
```

```
IF 条件 THEN
    --条件成立结构体
ELSE
    --条件不成立结构体
END IF;
```

```
IF 条件 1 THEN
    --条件 1 成立结构体
ELSIF 条件 2 THEN
    --条件 2 成立结构体
ELSE
    --以上条件都不成立结构体
END IF;
```


范例:
​
```
DECLARE
    newSal emp.sal % TYPE;
BEGIN
    SELECT sal INTO newSal FROM emp
    WHERE ename='JAMES';
    ​IF newSal>900 THEN ①
        UPDATE emp
        SET comm=800
        WHERE ename='JAMES';
    ​END IF;
    COMMIT ; ②
END;
```
​

```
DECLARE
    v_grade CHAR(1):=UPPER('&grade');
    p_grade VARCHAR(20) ;
BEGIN
    if v_grade='A' then
        dbms_output.put_line('优秀');
    elseif v_grade='B' then
        dbms_output.put_line('良好');
    elseif v_grade='C' then
        dbms_output.put_line('中等');
    else
        dbms_output.put_line('差');
    end if;
END;
```

​
```
WHILE 条件 LOOP
    --循环体
END LOOP;
```

```
DECLARE
    counter number(3):=0;
    sumResult number:=0;
BEGIN
    WHILE counter<100 LOOP
        ​sumResult := sumResult+counter;
    ​END LOOP;
    dbms_output.put_line('result is :'||sumResult);
END;
```


```
    FOR 循环变量 IN [REVERSE] 循环下限..循环上限 LOOP LOOP
        --循环体
    END LOOP；
```


```
DECLARE  
    ​counter number(3):=0;  
    sumResult number:=0;  
BEGIN  
    ​FOR counter IN 1..100 LOOP  
        ​sumResult := sumResult+counter;  
    END LOOP;  
    ​dbms_output.put_line('result is :'||sumResult);  
END; 
``` 