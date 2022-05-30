# 
# JDK (Java Development Kit) 

Java 开发工具包开发工具包（JRE + 开发工具）（有编译）

# JRE (Java Runtime Environment) 

Java 运行环境（没编译） 

![image.png](https://cdn.gxmnzl.xyz/img/SE0101.png)

!> $JDK = JRE + 开发工具集（例如 Javac 编译工具等）$  
$JRE = JVM + Java SE 标准类库$

![image.png](https://cdn.gxmnzl.xyz/img/SE0102.png)

> [!WARNING] 
> $ JDK > JRE > JVM $


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


# 下载 JDK

下载地址：[Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) 

找到 Java SE xx 的下载链接 JDK Download，下载安装即可。

# 设置环境变量

!> 配置环境变量的目的是为了 Windows 操作系统执行命令时，在控制台的任何文件路径下，都可以调用 JDK 指定目录下的所有指令。 		

安装完JDK后，需要设置一个 JAVA_HOME 的环境变量，它指向 JDK 的安装目录。

在 Windows 下，它是安装目录，类似：

`C:\Program Files\Java\jdk-18`

在 Mac 下，它在 ~/.bash_profile 或 ~/.zprofile 里，它是：

`export JAVA_HOME='/usr/libexec/java_home -v 18'`

然后，把 JAVA_HOME 的 bin 目录附加到系统环境变量 PATH 上。在 Windows 下，它长这样：

`Path=%JAVA_HOME%\bin;<现有的其他路径>`

在 Mac 下，它在 ~/.bash_profile 或 ~/.zprofile 里，长这样：

`export PATH=$JAVA_HOME/bin:$PATH`

把 JAVA_HOME 的 bin 目录添加到 PATH 中是为了在任意文件夹下都可以运行 Java 。打开命令提示符窗口，输入命令 `java -version`，如果一切正常，你会看到如下输出：

![](https://cdn.gxmnzl.xyz//img/20220529151358.png)

如果你看到的版本号不是 18，而是 15、1.8 之类，说明系统存在多个 JDK，且默认 JDK 不是 JDK 18，需要把JDK 18 提到 PATH 前面。

如果你得到一个错误输出：

![](https://cdn.gxmnzl.xyz//img/20220529151451.png)

这是因为系统无法找到 Java 虚拟机的程序 java.exe，需要检查 JAVA_HOME 和 PATH 的配置。

可以参考如何设置或更改 PATH 系统变量。
