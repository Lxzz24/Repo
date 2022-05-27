# **Java语言的环境搭建**

# JDK (Java Development Kit) 
Java 开发工具包开发工具包（JRE+开发工具）（有编译）

# JRE (Java Runtime Environment) 
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
> - `bin` : 命令，javac.exe（编译），java.exe（解释运行），javadoc.exe（生成一个以网页形式存在的文档），jar.exe
> - `db` : 数据库
> - `include` : C 语言编写的头文件
> - `jre` : 运行环境
> - `lib` : 函数，jar 包
> - `src.zip` : Java 开源代码 
> - `logs` : 日志文件
> - `config` : 配置文件

配置环境变量的目的是为了 Windows 操作系统执行命令时，在控制台的任何文件路径下，
都可以调用 jdk 指定目录下的所有指令。 		
