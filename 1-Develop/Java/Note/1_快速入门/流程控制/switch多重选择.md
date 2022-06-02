## switch-case

```java
  switch(表达式){
    case 常量1:
      语句1;
      // break;
    case 常量2:
      语句2;
      // break; 
    ... ...
    case 常量N:
      语句N;
      // break;
    default:
      语句;
      // break;
  }
```

![image.png](https://cdn.gxmnzl.xyz/img/SE0224.png)


### 使用说明：

1. 根据 switch 表达式中的值，依次匹配各个 case 中的常量。  
   一旦匹配成功，则进入相应 case 结构中，调用其执行语句。  
   当调用完执行语句以后，则仍然继续向下执行其他 case 结构中的执行语句，  
   直到遇到 break 关键字或此 switch-case 结构末尾结束为止。  
2.  break ，可以使用在 switch-case 结构中，表示一旦执行到此关键字，就跳出 switch-case 结构。
3.  switch 结构中的表达式只能是如下的 6 种数据类型之一：byte、short、char、int、枚举类型(JDK5.0)、String(JDK7.0)。
4.  case 之后只能声明常量，不能声明范围。
5.  break 关键字是可选的。
6.  default ：相当于 if-else 结构中的 else。default 结构是可选的。

> [!TIP]
> - 如果 switch-case 结构中的多个 case 的执行语句相同，则可以考虑进行合并。
> - break 在 switch-case 中是可选的

