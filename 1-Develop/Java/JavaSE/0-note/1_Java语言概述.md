# 
# **1.1 软件开发介绍**

$ 软件 = 系统软件（操作系统）+ 应用软件 $

?> 软件：一系列按照特定顺寻组织的计算机数据和指令的集合。

人机交互方式：图形化界面（GUI）、命令行方式（CLI）

GUI：施乐 → 苹果 → 微软

$ 应用程序 = 算法 + 数据结构 $

> [!NOTE]
> 常用的DOS命令命令
> - **dir**（directory）: 列出当前目录下的文件以及文件夹
> - **md**（make directory）: 创建目录
> - **rd**（remove directory） : 删除目录（非空无法删除，先使用 del，再 rd）
> - **cd + 路径** : 进入指定目录
> - **cd..** : 退回到上一级目录
> - **cd\\** : 退回到根目录
> - **del** : 删除文件（及目录下的文件）
> - **exit** : 退出 dos 命令行

---
# **1.2 计算机编程语言介绍**

> C, C++, Java, PHP, Kotlin（安卓）, Python（人工智能）, Scala（大数据）等

$ 机器语言（二进制代码） → 汇编语言 → 高级语言（面向过程 → 面向对象）$

---
# **1.3 Java语言概述**

> SUN（Stanford University Network，1995）
> 后台开发：Java、PHP、Python、Go、Node.js
> - 2004，JDK 1.5（5.0）里程碑版本
> - 2005，J2SE → JavaSE，J2EE → JavaEE → J2ME → JavaME
> - 2009，Oracle 收购SUN
> - 2014，JDK 8.0

JavaSE（Java Standard Edition）标准版——桌面级应用（应用程序）

JavaEE（Java Enterprise Edition）企业版
> 应用方向：企业级应用 + Android平台应用 + 大数据平台开发

---
# **1.4 Java程序运行机制及运行过程**

## 特点：
   - 面向对象
     - **类、对象；封装、继承、多态**
   - 健壮性
   - 跨平台性（可以在不同的系统平台上运行: JVM 负责 Java 程序在该系统的运行）

## Java的两种核心机制：

- **JVM** 
   - Java 虚拟机（Java Virtal Machine）
	- 它只认识 `xxx.class` 这种类型的文件，它能够将 class 文件中的字节码指令进行识别并调用操作系统向上的 API 完成动作
- **垃圾收集机制**（Garbage Collection）
   - 回收不再使用的内存空间会出现内存泄漏和内存溢出

---
# **1.5 Java语言的环境搭建**

## JDK (Java Development Kit) 
Java 开发工具包开发工具包（JRE+开发工具）（有编译）

## JRE (Java Runtime Environment) 
Java 运行环境（没编译） 

![image.png](https://cdn.gxmnzl.xyz/img/SE0101.png)

!> **JDK = JRE + 开发工具集（例如 Javac 编译工具等）**  
**JRE = JVM + Java SE 标准类库**

![image.png](https://cdn.gxmnzl.xyz/img/SE0102.png)

> [!WARNING] 
> $ JDK > JRE > JVM $

下载地址：[Oracle](http://www.oracle.com) 

> [!TIP]
> JDK目录：
> - **bin** : 命令，javac.exe（编译），java.exe（解释运行），javadoc.exe（生成一个以网页形式存在的文档），jar.exe
> - **db** : 数据库
> - **include** : C 语言编写的头文件
> - **jre** : 运行环境
> - **lib** : 函数，jar 包
> - **src.zip** : Java 开源代码 
> - **logs** : 日志文件
> - **config** : 配置文件

配置环境变量的目的是为了 Windows 操作系统执行命令时，在控制台的任何文件路径下，
都可以调用 jdk 指定目录下的所有指令。 		

---
# **1.6 Hello World**


1. 将 `Java` 代码编写编写到扩展名为 `.java` 的文件中。
2. 通过 `javac` 命令对该 `java` 文件进行编译编译。
3. 通过 `java` 命令对生成的 `class` 文件进行运行运行。 
   - Windows 不区分大小写，所以 cmd 写成大/小写都行；
   - 不用配置 class path 环境变量； 
   - Java 区分大小写；
   - `println`是输出一行的意思；

---
# **1.7 EditPlus**
---
# **1.8 注释（Comment）**

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
# **1.9 Java API文档** 

?> API （Application Programming Interface,应用程序编程接口）是 Java 提供的基本编程接口。

Java 语言提供了大量的基础类，因此 Oracle 也为这些基础类提供了相应的 API 文档，
用于告诉开发者如何使用这些类，以及这些类里包含的方法。 

[下载API](http://www.oracle.com/technetwork/java/javase/downloads/index.html)


## 对第一个Java程序进行总结：

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

---
# **1.10 良好的编码习惯**
注释、缩进、空白、行尾风格

---
# **1.11 常用的Java开发工具**

## 文本编辑工具：

记事本，UltraEdit，EditPlus，TextPad，NotePad

## Java集成开发环境（IDE）：

~~JBuilder~~，~~NetBeans~~，Eclipse（IBM 开发的），MyEclipse（收费、集成插件），**IntelliJ IDEA**

---
[练习题](https://blog.csdn.net/zhizhengguan/article/details/104071505)
