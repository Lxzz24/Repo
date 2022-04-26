# **15 - PL/SQL的异常处理**
[<<返回首页](database/Oracle.md)

在程序运行时出现的错误，称为**异常**。

发生异常后，语句将停止执行， `PL/SQL` 引擎立即将控制权转到 `PL/SQL` 块的异常处理部分。异常处理机制简化了代码中的错误检测。 `PL/SQL` 中任何异常出现时，每一个异常都对应一个异常码和异常信息。
​

## 预定义异常
为了 Oracle 开发和维护的方便，在 Oracle 异常中，为常见的异常码定义了对应的异常
名称，称为预定义异常，常见的预定义异常有：  

| 异常名称  |    异常码    |    描述  |
| :--  |    :--    |    :--  |
| DUP_VAL_ON_INDEX | ORA-00001      | 试图向唯一索引列插入重复值  |
| INVALID_CURSOR   | ORA-01001      | 试图进行非法游标操作。  |
| INVALID_NUMBER   | ORA-01722      | 试图将字符串转换为数字  |
| NO_DATA_FOUND    | ORA-01403      | SELECT INTO 语句中没有返回任何记录。  |
| TOO_MANY_ROWS    | ORA-01422      | SELECT INTO 语句中返回多于 1 条记录。  |
| ZERO_DIVIDE      | ORA-01476      | 试图用 0 作为除数。  |
| CURSOR_ALREADY_  | OPEN ORA-06511 | 试图打开一个已经打开的游标  |  

## 异常处理

`PL/SQL` 中用 `EXCEPTION` 关键字开始异常处理。具体语法是：


```
BEGIN
    //可执行部分
EXCEPTION   //异常处理开始
WHEN 异常名 1 THEN
    //对应异常处理
WHEN 异常名 2 THEN
    //对应异常处理
……
WHEN OTHERS THEN
    //其他异常处理
END;
```  

### 语法解析：
异常发生时，进入异常处理部分，具体的异常与若干个 `WHEN` 子句中指明的异常名匹配，匹配成功就进入对应的异常处理部分，如果对应不成功，则进入 `OTHERS` 进行处理。

**案例**：异常处理

```
DECLARE
​   newSal emp.sal % TYPE;
BEGIN
​   SELECT sal INTO newSal FROM emp;
EXCEPTION
WHEN TOO_MANY_ROWS THEN
```
