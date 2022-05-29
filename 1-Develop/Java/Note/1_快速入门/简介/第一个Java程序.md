# 
# 如何执行 Java 程序

![](https://cdn.gxmnzl.xyz//img/20220529161216.png)

1. 将 `Java` 代码编写编写到扩展名为 `.java` 的文件中。
2. 通过 `javac` 命令对该 `java` 文件进行编译编译。
3. 通过 `java` 命令对生成的 `class` 文件进行运行运行。 
   - Windows 不区分大小写，所以 cmd 写成大/小写都行；
   - 不用配置 class path 环境变量； 
   - Java 区分大小写；
   - `println`是输出一行的意思；

# Hello World

```Java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```



---

# 注释（Comment）

1. 单行 `//`
   
2. 多行 

```java
/*
* xxxxxxxx
*/
```

3. 文本

```java
/**
@author 指定指定java程序的作者程序的作者
@version 指定源文件的版本
*/
```
> [!TIP]
> 注释内容可以被 JDK 提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档。

解析:  
`javadoc -d mydoc -author -version -encoding utf8 Hello.java`

---
# Java API 文档

?> API （Application Programming Interface,应用程序编程接口）是 Java 提供的基本编程接口。

Java 语言提供了大量的基础类，因此 Oracle 也为这些基础类提供了相应的 API 文档，
用于告诉开发者如何使用这些类，以及这些类里包含的方法。 

[下载API](http://www.oracle.com/technetwork/java/javase/downloads/index.html)


# 对第一个 Java 程序进行总结：

1. Java程序-编译-运行的过程
   - 编写：我们将编写的 Java 代码保存在以 ".java" 结尾的源文件中
   - 编译：使用 javac.exe 命令编译我们的 Java 源文件。
     - 格式：`javac 源文件名.java`
   - 运行：使用 java.exe 命令解释运行我们的字节码文件。 
      - `格式：java 类名`
2. 在一个 Java 源文件中可以声明多个 class ，但是**最多只能有一个类声明为 public 的**。
   - 而且要求声明为 public 的类的类名必须与源文件名相同。
3. 程序的入口是 `main()` 方法。格式是固定的。
4. 输出语句：
   - `System.out.println();`先输出数据，然后换行
   - `System.out.print();`只输出数据
5. 每一行执行语句都以 `;` 结束。
6. 编译的过程：
	- 编译以后，会生成一个或多个字节码文件。
	- 字节码文件的文件名与 Java 源文件中的类名相同。

