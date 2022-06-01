## Hello World

我们来编写第一个 Java 程序。

打开文本编辑器，输入以下代码：

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

在一个Java程序中，你总能找到一个类似：

```java
public class Hello {
    ...
}
```

的定义，这个定义被称为 class（类），这里的类名是 `Hello`，大小写敏感，`class` 用来定义一个类，`public` 表示这个类是公开的，`public`、`class` 都是 Java 的关键字，必须小写，`Hello` 是类的名字，按照习惯，首字母 `H` 要大写。而花括号 `{}` 中间则是类的定义。

注意到类的定义中，我们定义了一个名为 `main` 的方法：

```java
public static void main(String[] args) {
    ...
}
```

方法是可执行的代码块，一个方法除了方法名 `main`，还有用 `()` 括起来的方法参数，这里的 `main` 方法有一个参数，参数类型是 `String[]`，参数名是 `args`，`public`、`static`用来修饰方法，这里表示它是一个公开的静态方法，`void` 是方法的返回类型，而花括号 `{}` 中间的就是方法的代码。

方法的代码每一行用 `;` 结束，这里只有一行代码，就是：

```java
System.out.println("Hello, world!");
```

它用来打印一个字符串到屏幕上。

Java 规定，某个类定义的 `public static void main(String[] args)` 是 Java 程序的固定入口方法，因此，*Java 程序总是从 `main` 方法开始执行*。

注意到 Java 源码的缩进不是必须的，但是用缩进后，格式好看，很容易看出代码块的开始和结束，缩进一般是 4 个空格或者一个 tab。

最后，当我们把代码保存为文件时，文件名必须是 `Hello.java`，而且文件名也要注意大小写，因为要和我们定义的类名 `Hello` 完全保持一致。


## 如何执行 Java 程序

Java 源码本质上是一个文本文件，我们需要先用 `javac` 把 `Hello.java` 编译成字节码文件 `Hello.class`，然后，用 `java` 命令执行这个字节码文件：

![](https://cdn.gxmnzl.xyz//img/20220529161216.png)

因此，可执行文件 `javac` 是编译器，而可执行文件 `java` 就是虚拟机。

*第一步*，在保存 `Hello.java` 的目录下执行命令 `javac Hello.java`：

```
$ javac Hello.java
```

如果源代码无误，上述命令不会有任何输出，而当前目录下会产生一个 `Hello.class` 文件：

```
$ ls
Hello.class	Hello.java
```

*第二步*，执行 `Hello.class`，使用命令 `java Hello`：

```
$ java Hello
Hello, world!
```

> [!ATTENTION]
> 给虚拟机传递的参数 `Hello` 是我们定义的类名，虚拟机自动查找对应的 `class` 文件并执行。


## 对第一个 Java 程序进行总结：

1. Java程序-编译-运行的过程
   - 编写：我们将编写的 Java 代码保存在以 `.java` 结尾的源文件中
   - 编译：使用 `javac` 命令编译我们的 Java 源文件。
     - 格式： `javac 源文件名.java`
   - 运行：使用 `java` 命令解释运行我们的字节码文件。 
     - 格式： `java 类名`
2. 在一个 Java 源文件中可以声明多个 `class` ，但是*最多只能有一个类声明为 `public` 的*。
   - 而且要求声明为 `public` 的类的类名必须与源文件名相同。
3. 程序的入口是 `main()` 方法。格式是固定的。
4. 输出语句：
   - `System.out.println();`先输出数据，然后换行
   - `System.out.print();`只输出数据
5. 每一行执行语句都以 `;` 结束。
6. 编译的过程：
	- 编译以后，会生成一个或多个字节码文件。
	- 字节码文件的文件名与 Java 源文件中的类名相同。




---
## * Java API 文档

?> API （Application Programming Interface，应用程序编程接口）是 Java 提供的基本编程接口。

Java 语言提供了大量的基础类，因此 Oracle 也为这些基础类提供了相应的 API 文档，
用于告诉开发者如何使用这些类，以及这些类里包含的方法。 

[下载API](http://www.oracle.com/technetwork/java/javase/downloads/index.html)


