## Java 程序基本结构

我们先剖析一个完整的 Java 程序，它的基本结构是什么：

```java
/**
 * 可以用来自动创建文档的注释
 */
public class Hello {
    public static void main(String[] args) {
        // 向屏幕输出文本:
        System.out.println("Hello, world!");
        /* 多行注释开始
        注释内容
        注释结束 */
    }
} // class定义结束
```


## 关键字（keyword）

#### 定义：

被 Java 语言赋予了特殊含义，用做专门用途的字符串

#### 特点：

关键字中所有字母都为小写

[官方地址](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

![image.png](https://cdn.gxmnzl.xyz/img/SE0211.png)

![image.png](https://cdn.gxmnzl.xyz/img/SE0212.png)


因为 Java 是面向对象的语言，一个程序的基本单位就是 `class`，`class` 是 ***关键字***，这里定义的 `class` 名字就是 `Hello`：

```java
public class Hello { // 类名是Hello
    // ...
} // class定义结束
```

## 标识符（Identifier）

Java 对各种变量、方法和类等要素命名时使用的字符序列

***凡是自己可以起名字的地方都叫标识符***

#### *1.* 标识符的命名规则： 

> [!WARNING]
> 如果不遵守如下规则，编译不通过！**需要严格遵守！**
> 1. 由26个英文字母大小写，`0-9` ，`_` 或 `$` 组成
> 2. 数字不可以开头
>     - 习惯以大写字母开头
> 3. 不可以使用关键字和保留字，但能包含关键字和保留字
> 4. Java 中严格区分大小写，长度无限制
> 5. 标识符不能包含空格


好的类命名：
- Hello
- NoteBook
- VRPlayer


不好的类命名：

- hello
- Good123
- Note_Book
- _World


注意到 `public` 是 **访问修饰符** ，表示该 `class` 是公开的。

不写 `public`，也能正确编译，但是这个类将无法从命令行执行。

在 `class` 内部，可以定义若干 **方法** （method）：

```java
public class Hello {
    public static void main(String[] args) { // 方法名是main
        // 方法代码...
    } // 方法定义结束
}
```

方法定义了一组执行语句，方法内部的代码将会被依次顺序执行。

这里的方法名是 `main`，返回值是 `void`，表示没有任何返回值。

我们注意到 `public` 除了可以修饰 `class` 外，也可以修饰方法。而关键字 `static` 是另一个修饰符，它表示静态方法，后面我们会讲解方法的类型，目前，我们只需要知道，Java 入口程序规定的方法必须是静态方法，方法名必须为 `main`，括号内的参数必须是 `String` 数组。

方法名也有命名规则，命名和 `class` 一样，但是首字母小写：

好的方法命名：

- main
- goodMorning
- playVR


不好的方法命名：

- Main
- good123
- good_morning
- _playVR


在方法内部，语句才是真正的执行代码。Java 的每一行语句必须以分号结束：

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!"); // 语句
    }
}
```


#### *2.* Java 中的名称命名规范： 

> [!TIP]
> 如果不遵守如下规则，编译可以通过！**但建议遵守！**
> - ***包名*** ：多单词组成时所有字母都小写：`xxxyyyzzz`
> - ***类名、接口名*** ：多单词组成时，所有单词的首字母大写：`XxxYyyZzz `
> - ***变量名、方法名*** ：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：`xxxYyyZzz`
> - ***常量名*** ：所有字母都大写。多单词时每个单词用下划线连接：`XXX_YYY_ZZZ`	


> [!ATTENTION]
> 1. 在起名字时，为了提高阅读性，要尽量有意义， ***见名知意*** 。
> 2. Java 采用 unicode 字符集，因此标识符也可以使用汉字声明，但是*不建议使用*。 


## 注释（Comment）

在 Java 程序中，注释是一种给人阅读的文本，不是程序的一部分，所以编译器会自动忽略注释。

Java 有 3 种注释

#### *1.* 单行注释

以双斜线开头，直到这一行的结尾结束：

`// 这是注释...`

#### *2.* 多行注释

以 `/*` 星号开头，以 `*/` 结束，可以有多行：

```java
/*
这是注释
xxxxxxxx
这也是注释
*/
```

#### *3.* 文档注释

还有一种特殊的多行注释，以 `/**` 开头，以 `*/` 结束，如果有多行，每行通常以星号开头：

```java
/**
@author 指定指定java程序的作者程序的作者
@version 指定源文件的版本
*/
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

> [!TIP]
> 注释内容可以被 JDK 提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档。

解析:

```
javadoc -d mydoc -author -version -encoding utf8 Hello.java
```

Java 程序对格式没有明确的要求，多几个空格或者回车不影响程序的正确性，但是我们要养成良好的编程习惯，注意遵守 Java 社区约定的编码格式。





