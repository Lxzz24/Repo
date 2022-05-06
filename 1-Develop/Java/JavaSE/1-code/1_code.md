# 

# 1-HelloWorld

```java
class HelloChina{
	public static void main(String[] args){
		System.out.println("Hello,World!");
	}
}
```

# 2-注释

```java
/*
1.Java规范的三种注释方式：
单行注释
多行注释
文档注释（java特有）
	
2.单行注释和多行注释的作用：
①对所写的程序进行解释说明，增强可读性。方便自己，方便别人
②调试所写的代码

3.特点：单行/多行注释，注释的内容不参与编译。
		换句话说，编译后生成的class结尾的字节码文件中不包含注释掉的信息。

4.文档注释的使用：
	注释内容可以被JDK提供的工具 javadoc 所解析，生成一套以网页文件形式体现的
	该程序的说明文档。

5.多行注释不可以嵌套使用

*/

/**
文档注释
@author lxzz
@version  v1.0
这是我的第一个Java程序！
*/


public class  HelloJava{
	/*
	多行注释：
	如下的main方法是程序的入口！
	main的格式是固定的！
	*/
	/**
	如下的方法是main()，作用：程序的入口。
	*/
	public static void main(String[] args){
		//单行注释：如下的语句表示输出到控制台
		System.out.println("Hello World!");
	}
}
```

# 3-总结第一个程序

```java
/**
对第一个Java程序进行总结
1，Java程序-编译-运行的过程
编写：我们将编写的Java代码保存在以".java"结尾的源文件中
编译：使用javac.exe命令编译我们的Java源文件。格式：javac 源文件名.java
运行：使用java.exe命令解释运行我们的字节码文件。 格式：java 类名

2.
在一个Java源文件中可以声明多个class，但是最多只能有一个类声明为public的。
而且要求声明为public的类的类名必须与源文件名相同。

3.程序的入口是main()方法。格式是固定的。

4.输出语句：
System.out.println();先输出数据，然后换行
System.out.print();只输出数据

5.每一行执行语句都以";"结束。

6.编译的过程：编译以后，会生成一个或多个字节码文件。
字节码文件的文件名与Java源文件中的类名相同。

*/

public class Hello{
	public static void main(String[] args){
		//public static void main(String a[]){ //arguments：参数
		System.out.print("Hello World!");
		//System.out.println();//换行
		System.out.println("Hello World!");		
	}
}

class Person{

}
class Animal{

}
```
# 4-练习
```java
public class ChairMan{
	public static void main(String[] args){
		System.out.println("姓名：xxx/n");
		//System.out.println();
		System.out.println("性别：xxx");
		System.out.println("住址：xxx");
	}
}
```
