在 Java 开发中，许多童鞋经常被各种版本的 JDK 搞得晕头转向，本节我们就来详细讲解 Java 程序编译后的 class 文件版本问题。

我们通常说的 Java 8，Java 11，Java 17，是指 JDK 的版本，也就是 JVM 的版本，更确切地说，就是 java.exe 这个程序的版本：

$ java -version
java version "17" 2021-09-14 LTS
而每个版本的 JVM，它能执行的 class 文件版本也不同。例如，Java 11 对应的 class 文件版本是 55，而 Java 17 对应的 class 文件版本是 61。

如果用 Java 11 编译一个 Java 程序，输出的 class 文件版本默认就是 55，这个 class 既可以在 Java 11 上运行，也可以在 Java 17 上运行，因为 Java 17 支持的 class 文件版本是 61，表示 “最多支持到版本 61”。

如果用 Java 17 编译一个 Java 程序，输出的 class 文件版本默认就是 61，它可以在 Java 17、Java 18 上运行，但不可能在 Java 11 上运行，因为 Java 11 支持的 class 版本最多到 55。如果使用低于 Java 17 的 JVM 运行，会得到一个 UnsupportedClassVersionError，错误信息类似：

java.lang.UnsupportedClassVersionError: Xxx has been compiled by a more recent version of the Java Runtime...
只要看到 UnsupportedClassVersionError 就表示当前要加载的 class 文件版本超过了 JVM 的能力，必须使用更高版本的 JVM 才能运行。

打个比方，用 Word 2013 保存一个 Word 文件，这个文件也可以在 Word 2016 上打开。但反过来，用 Word 2016 保存一个 Word 文件，就无法使用 Word 2013 打开。

但是，且慢，用 Word 2016 也可以保存一个格式为 Word 2013 的文件，这样保存的 Word 文件就可以用低版本的 Word 2013 打开，但前提是保存时必须明确指定文件格式兼容 Word 2013。

类似的，对应到 JVM 的 class 文件，我们也可以用 Java 17 编译一个 Java 程序，指定输出的 class 版本要兼容 Java 11（即 class 版本 55），这样编译生成的 class 文件就可以在 Java >=11 的环境中运行。

指定编译输出有两种方式，一种是在 javac 命令行中用参数 --release 设置：

$ javac --release 11 Main.java
参数 --release 11 表示源码兼容 Java 11，编译的 class 输出版本为 Java 11 兼容，即 class 版本 55。

第二种方式是用参数 --source 指定源码版本，用参数 --target 指定输出 class 版本：

$ javac --source 9 --target 11 Main.java
上述命令如果使用 Java 17 的 JDK 编译，它会把源码视为 Java 9 兼容版本，并输出 class 为 Java 11 兼容版本。注意 --release 参数和 --source --target 参数只能二选一，不能同时设置。

然而，指定版本如果低于当前的 JDK 版本，会有一些潜在的问题。例如，我们用 Java 17 编译 Hello.java，参数设置 --source 9 和 --target 11：

public class Hello {
    public static void hello(String name) {
        System.out.println("hello".indent(4));
    }
}
用低于 Java 11 的 JVM 运行 Hello 会得到一个 LinkageError，因为无法加载 Hello.class 文件，而用 Java 11 运行 Hello 会得到一个 NoSuchMethodError，因为 String.indent() 方法是从 Java 12 才添加进来的，Java 11 的 String 版本根本没有 indent() 方法。

 注：如果使用 --release 11 则会在编译时检查该方法是否在 Java 11 中存在。
因此，如果运行时的 JVM 版本是 Java 11，则编译时也最好使用 Java 11，而不是用高版本的 JDK 编译输出低版本的 class。

如果使用 javac 编译时不指定任何版本参数，那么相当于使用 --release 当前版本编译，即源码版本和输出版本均为当前版本。

在开发阶段，多个版本的 JDK 可以同时安装，当前使用的 JDK 版本可由 JAVA_HOME 环境变量切换。

源码版本
在编写源代码的时候，我们通常会预设一个源码的版本。在编译的时候，如果用 --source 或 --release 指定源码版本，则使用指定的源码版本检查语法。

例如，使用了 lambda 表达式的源码版本至少要为 8 才能编译，使用了 var 关键字的源码版本至少要为 10 才能编译，使用 switch 表达式的源码版本至少要为 12 才能编译，且 12 和 13 版本需要启用 --enable-preview 参数。

小结
高版本的 JDK 可编译输出低版本兼容的 class 文件，但需注意，低版本的 JDK 可能不存在高版本 JDK 添加的类和方法，导致运行时报错。

运行时使用哪个 JDK 版本，编译时就尽量使用同一版本编译源码。



