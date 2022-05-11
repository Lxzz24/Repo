#
# 1-标识符

```java
class IdentifierTest{

	public static void main(String[] args){
		//int myNumber = 1001;
		//System.out.println(myNumber);
		int mynumber = 1002;
		System.out.println(mynumber);
	}
}
class Hello1_${

}
//class 1Hello
//{
//}
class static1
{
}
class Static
{
}
class staticpublic
{
}
```

# 2-变量

## 2-1 变量的使用

```java
/*
变量的使用
1.Java定义变量的格式：数据类型 变量名 = 变量值；

2.说明：
	①变量必须先声明，后使用
	②变量都定义在其作用域内。在作用域内，它是有用的。换句话说，出了作用域，就失效了
	③同一个作用域内，不可以声明两个同名的变量

*/
class  VariableTest{
	public static void main(String[] args){
		//变量的定义
		int myAge = 12;
		//变量的使用
		System.out.println(myAge);
		
		//编译错误：使用myNumber之前并未定义过myNumber
		//System.out.println(myNumber);

		//变量的声明
		int myNumber;
		
		//编译错误：使用myNumber之前并未赋值过myNumber
		//System.out.println(myNumber);

		//变量的赋值
		myNumber = 1001;

		//编译不通过
		//System.out.println(myClass);

		//不可以在同一个作用域内定义同名的变量
		//int myAge = 22;
	}
	public void method(){
		int myClass = 1;
	}
}

//class VariableTest{} //逆向思维，反证法
```

## 2-2 数据类型

```java
/*
Java定义的数据类型

一、按照数据类型来分：
	
	基本数据类型
		整型：byte \ short \ int \ long
		浮点型：float \ double 
		字符型：char
		布尔型：boolean

	引用数据类型：
		类（class）
		接口（interface）
		数组（array）

二、按照变量在类中声明的位置：
		成员变量 vs 局部变量

*/
class VariableTest1{
	public static void main(String[] args) 
	{
		//1. 整型：byte（1字节=8bit）\ short（2字节）\ int（4字节）\ long（8字节）
		//① byte范围：-128 ~ 127
		byte b1 = 12;
		byte b2 =-128;
		//b2 = 128; //编译不通过
		System.out.println(b1);
		System.out.println(b2);

		//② 声明long型变量，必须以“l”/“L”结尾
		//③ 通常定义整型变量时，使用int型
		short s1 = 128;
		int i1 = 1234;
		long l1 = 3414234324L;
		System.out.println(l1);

		//2. 浮点型：float（4字节） \ double（8字节）
		//① 浮点型，表示带小数点的数值
		//② float表示数值的范围比long还大

		double d1 = 123.3;
		System.out.println(d1 + 1);
		//③ 定义float类型变量时，变量要以“f”/“F”结尾
		float f1 = 12.3F;
		System.out.println(f1);
		//④ 通常，定义浮点型变量时，使用double型
		
		//3. 字符型：char（1字符=2字节）
		//① 定义char型变量，通常使用一对'',内部只能写一个字符
		char c1 = 'a';
		//c1 = 'AB';//编译不通过
		System.out.println(c1);

		char c2 = '1';
		char c3 = '中';
		char c4 = 'あ';
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		//② 表示方式：1.声明一个字符 2.转义字符 3.直接使用 Unicode 值表示字符型常量
		char c5 = '\n';//换行符
		c5 = '\t';//制表符
		System.out.print("hello" + c5);
		System.out.println("world");
		
		char c6 = '\u0043';
		System.out.println(c6);

		//4. 布尔型：boolean
		//① 只能取两个值之一：true 、false
		//② 常常在条件判断、循环结构中使用
		boolean bb1 = true;
		System.out.println(bb1);
		
		boolean isMarried = true;
		if(isMarried){
			System.out.println("你就不能参加\"单身\"party了！\\n很遗憾");
		}else{
			System.out.println("你可以多谈谈女朋友！");
		}
	}
}
```

## 2-3 基本数据类型之间的运算规则

```java
/*
基本数据类型之间的运算规则

前提：这里讨论的只是7种基本数据类型变量间的运算。不包括boolean类型。

1.自动类型提升：
	结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
	byte、char、short --> int --> long --> float --> double

	特别的：当byte、char、short三种类型的变量做运算时，结果为int型

2.强制类型转换：见VariableTest3.java


说明：此时的容量大小指的是，表示数的范围的大和小。比如：float的容量要大于long的容量。
*/
class VariableTest2{
	public static void main(String[] args){
		byte b1 = 2;
		int i1 = 129;
		//编译不通过(不兼容的类型: 从int转换到byte可能会有损失)
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);

		float f = b1 + i1;
		System.out.println(f);

		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);
		//**********************************特别的********************************************
		char c1 = 'a';//97
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);

		short s2 = 10;
		//char c2 = c1 + s2;//编译不通过（不兼容的类型: 从int转换到char可能会有损失）

		byte b2 = 10;
		//char c3 = c1 + b2;//编译不通过（不兼容的类型: 从int转换到char可能会有损失）

		//short s3 = b2 + s2;//编译不通过（不兼容的类型: 从int转换到short可能会有损失）
		
		//short s4 = b1 + b2;//编译不通过（不兼容的类型: 从int转换到short可能会有损失）

	}
}
```

## 2-4 强制类型转换

```java
/*
强制类型转换：自动类型提升运算的逆运算。
1.需要使用强转符：（）
2.注意点：强制类型转换，可能导致精度损失。

*/
class VariableTest3{
	public static void main(String[] args){
		
		double d1 = 12.9;
		//精度损失举例1
		int i1 = (int)d1;//截断操作
		System.out.println(i1);//12
		
		//没有精度损失
		long l1 = 123;
		short s2 = (short)l1;
		System.out.println(s2);//123

		//精度损失举例2
		int i2 = 128;
		byte b = (byte)i2;
		System.out.println(b);//-128
	}
}
```

### F-举例

```java
class VariableTest4{
	public static void main(String[] args){
		//1.编码情况：
		long l = 123213;//较小的
		System.out.println(l);
		//编译失败：过大的整数
		//long l1 = 26546421348548;
		long l2 = 26546421348548L;
		
		System.out.println(l1);
		//*******************************************************
		//编译失败
		//float f1 = 12.3;//未加f，默认是double类型
		float f2 = 12.3f;
		float f3 = (float)12.3;
		
		//2.编码情况2：
		//整型常量，默认类型为int型
		//浮点型常量，默认类型为double型
		
		byte b = 12;
		//byte b1 = b + 1;//编译失败

		//float f1 = b + 12.3;//编译失败
	}
}
```

## 2-5 String类型

```java
/*
String类型变量的使用
1. String属于引用数据类型，翻译为：字符串
2. 声明String类型变量时，使用一对""
3. String可以和8种基本数据类型变量做运算，且运算只能是连接运算。
4. 运算的结果仍是String类型

*/
class StringTest{
	public static void main(String[] args){
		
		String s1 = "Hello World!";

		System.out.println(s1);

		String s2 = "a";
		String s3 = "";

		//char c = '';//编译不通过

		//*********************************
		int number = 1001;
		String numberStr = "学号：";
		String info = numberStr + number;//+:连接运算
		boolean b1 = true;
		String info1 = info + b1;//+:连接运算
		System.out.println(info1);

		//*********************************
		//练习1
		char c = 'a';//97  A:65
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);//107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//hello10a

		//练习2
		//*	*
		System.out.println("*	*");
		System.out.println('*'+'\t'+'*');//错误：93，全是char型，加法运算
		System.out.println('*'+"\t"+'*');//"\t"表示连接
		System.out.println('*'+'\t'+"*");//错误：51*
		System.out.println('*'+('\t'+"*"));
		
		//*********************************
		//String str1 = 123;//编译不通过
		String str1 = 123 + "";
		System.out.println(str1);//"123"

		//int num1 = str1;
		//int num1 = (int)str1;//编译不通过

		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
	}
}
```

## 2-6 进制

```java
/*
对于整数，有四种表示方式： 
	> 二进制(binary)：0,1 ，满2进1.以0b或0B开头。 
	> 十进制(decimal)：0-9 ，满10进1。 
	> 八进制(octal)：0-7 ，满8进1. 以数字0开头表示。 
	> 十六进制(hex)：0-9及A-F，满16进1. 以0x或0X开头表示。
	  			     此处的A-F不区分大小写。如：0x21AF +1= 0X21B0

	原码：直接将一个数值换成二进制数。最高位是符号位;
	负数的反码：是对原码按位取反，只是最高位（符号位）确定为1;
	负数的补码：其反码加1。
计算机底层都以补码的方式来存储数据！

*/
class BinaryTest{
	public static void main(String[] args){
		
		int num1 = 0b110;
		int num2 = 110;
		int num3 = 0127;
		int num4 = 0x110A;		
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
	}
}
```

## F-复习

```java
class ReviewTest{
	public static void main(String[] args){
		
		char c1 = 'a';
		char c2 = 97;//开发中非常少见
				
		System.out.println(c2);

		char c3 = 5;
		char c4 = '5';

		int i1 = (int)c4;
		System.out.println(i1);//53
		System.out.println(c3);
	}
}
```

# 3-运算符

## 3-1 算术运算符

```java
/*
运算符之一：算数运算符
+ -								//正、负
+ - * / %						//加减乘除
(前)++ (前)-- (后)++ (后)--		//自增、自减
+								//字符串连接

*/
class AriTest {
	public static void main(String[] args) {

		// 除号：/
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//2
		int result2 = num1 / num2 * num2;
		System.out.println(result2);//10
		
		double result3 = num1 / num2;
		System.out.println(result3);//2.0
		
		double result4 = num1 / num2 + 0.0;
		double result5 = num1 / (num2 + 0.0);
		double result6 = (double)num1 / num2 + 0.0;
		System.out.println(result5);//2.4
		System.out.println(result6);

		// %: 取余（模）运算
		// 结果的符号与被模数的符号相同
		// 开发中，经常使用%来判断能否被除尽的情况
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 =" + m1 % n1);//2

		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 =" + m2 % n2);//-2

		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 =" + m3 % n3);//2

		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 =" + m4 % n4);//-2

		//(前)++ : 先自增1，后再运算
		//(后)++ : 先运算，后自增1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);

		int a3 = 10;
		++a3;//a3++;
		int b3 = a3;
		System.out.println("a3 = " + a3 + ",b3 = " + b3);

		//注意点：
		short s1 = 10;
		//s1 = s1 +1; //编译失败
		//s1 = (short)(s1 + 1);//正确的
		s1++;//自增1不会改变本身变量的数据类型
		System.out.println(s1);

		//问题:
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);//-128 溢出

		//(前)-- 先自减1，后再运算
		//(后)-- 先运算，后自减1
		int a4 = 10;
		//int b4 = --a4;	//a4 = 9,b4 = 9
		int b4 = a4--;		//a4 = 9,b4 = 10
		System.out.println("a4 = " + a4 + ",b4 = " + b4);


	}
}
```

### F-1

```java
public class SignTest{
	public static void main(String[] args){
		int i1 = 10;
		int i2 = 20;
		
		int i = i1++;
		System.out.print("i="+i);
		System.out.println("i1="+i1);
		
		i = ++i1;
		System.out.print("i="+i);
		System.out.println("i1="+i1);
		
		i = i2--;
		System.out.print("i="+i);
		System.out.println("i2="+i2);
		
		i = --i2;
		System.out.print("i="+i);
		System.out.println("i2="+i2);
	} 
}
```

### F-2

```java
/*
练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：
例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

*/
class AriExer{
	public static void main(String[] args) {
		int num = 187;
		int bai = num / 100;
		int shi = num % 100 / 10;//int shi = num / 10 % 10;
		int ge = num % 10;

		System.out.println("百位为："+ bai);
		System.out.println("十位为："+ shi);
		System.out.println("个位为："+ ge);
	}
}
```

## 3-2 赋值运算符

```java
/*
运算符之二：赋值运算符
=  +=  -=  *=  /=  %=
*/
class  SetValueTest{
	public static void main(String[] args) {
		//赋值符号：=
		int i1 = 10;
		int j2 = 10;

		int i2,j2;
		//连续赋值
		i2 = j2 = 10;

		int i3 = 10, j3= 20;

		//********************************************
		int num1 = 10;
		num1 += 2;//num1 = num1 + 2;
		System.out.println(num1);//12

		int num2 = 12;
		num2 %= 5;// num2 = num2 % 5;
		System.out.println(num2);//2

		short s1 = 10;
		//s1 = s1 + 2;//编译失败
		s1 += 2；//不会改变变量本身的数据类型
		System.out.println(s1);

		//开发中，如果希望变量实现+2的操作，有几种方法？（前提：int num = 10;）
		//方式一：num = num + 2;
		//方式二：num += 2;(推荐)
		
		//开发中，如果希望变量实现+1的操作，有几种方法？（前提：int num = 10;）
		//方式一：num = num + 1;
		//方式二：num += 1;
		//方式三：num++;(推荐)

		//练习1
		int i = 1;
		i *= 0.1;
		System.out.println(i);//0
		i++;
		System.out.println(i);//1

		//练习2
		int m = 2;
		int n = 3;
		n *= m++; //n = n * m++;
		System.out.println("m=" + m);//3
		System.out.println("n=" + n);//6

		//练习3
		int n1 = 10;
		n1 += (n1++) + (++n1);//n1 = n1 + (n1++) + (++n1);//10+10+12
		System.out.println(n1);//32

	}
}
```

## 3-3 比较运算符

```java
/*
运算符之三：比较运算符
==  !=  >  <  >=  <=  instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 == 和 =

*/
class CompareTest{
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		System.out.println(i == j);//false
		System.out.println(i = j);//20

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b2 == b1);//false
		System.out.println(b2 = b1);//true
	}
}
```

## 3-4 逻辑运算符

```java
/*
运算符之四：逻辑运算符
&  &&  |  ||  !  ^
*/
class LogicTest{
	public static void main(String[] args) {
		
		//区分：& 与 &&
		//相同点1：& 与 && 的运算结果相同
		//相同点2：当符号左边是true时，二者都会执行符号右边的运算
		//不同点：当符号左边时false时，&继续执行符号右边的运算。&&不再执行符号右边的运算
		//开发中，推荐使用 && 。
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println("num1 = " + num1);

		boolean b2 = true;
		b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println("num2 = " + num2);
		
		//区分：| 与 ||
		//相同点1：| 与 || 的运算结果相同
		//相同点2：当符号左边是false时，二者都会执行符号右边的运算
		//不同点：当符号左边时true时，| 继续执行符号右边的运算。|| 不再执行符号右边的运算。
		//开发中，推荐使用 || 。
		boolean b3 = false;
		b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println("num3 = " + num3);

		boolean b4 = false;
		b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println("num4 = " + num4);

		//练习1：
		int x1 = 1, y1 = 1;
		if(x1++==2 & ++y1==2){  //(false & true)
			x1 =7;
		}
		System.out.println("x1="+x1+",y1="+y1);//2  2
		
		//练习2：
		int x2 = 1, y2 = 1;
		if(x2++==2 && ++y2==2){  //(false && )
			x2 = 7;
		}
		System.out.println("x2="+x2+",y2="+y2);//2  1
		
		//练习3：
		int x3 = 1, y3 = 1;
		if(x3++==1 | ++y3==1){  //(false | true)
			x3 =7;
		}
		System.out.println("x3="+x3+",y3="+y3);//7  2
		
		//练习4：
		int x4 = 1, y4 = 1;
		if(x4++==1 || ++y4==1){  //(true || )
			x4 =7;
		}
		System.out.println("x4="+x4+",y4="+y4);//7  1
	}
}
//面试题：
class Test {
	public static void main (String [] args) {
		boolean x = true;
		boolean y = false;
		short z = 42;
		//if(y == true)
		if((z++==42) && (y=true)) z++;
		System. out.println("z1 = "+z);

		if((x=false) || (++z==45)) z++;
		System. out.println("z2 = "+z);
	}
}
```

## 3-5 位运算符

```java
/*
运算符之五：位运算符（了解）

结论：
1.位运算符操作的都是整型的数据
2.<<：在一定范围内，每向左移一位，相当于 * 2
  >>：在一定范围内，每向右移一位，相当于 / 2

面试题：最高效地计算 2 * 8？    2 << 3 或 8 << 1

*/
class BitTest{
	public static void main(String[] args) {
		int i = 21;

		System.out.println("i << 2 :" + (i << 2));//84
		System.out.println("i << 3 :" + (i << 3));//168
		System.out.println("i << 26 :" + (i << 26));//1409286144
		System.out.println("i << 27 :" + (i << 27));//-1476395008

		System.out.println("i >> 2 :" + (i >> 2));//5

		int m = 12;
		int n = 5;
		System.out.println("m & n :" + (m & n));//4
		System.out.println("m | n :" + (m | n));//13
		System.out.println("m ^ n :" + (m ^ n));//9

		int l = 6;
		System.out.println("~ l :" + (~ l));//-7
		System.out.println("~(~l) :" + (~(~l)));//6

		//练习:交换两个变量的值
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ", num2 =" + num2);

		//方式一：定义临时变量
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		//方式二：好处：不用定义临时变量
		//弊端：①相加操作可能超出存储范围 ②有局限性：只能适用于数值类型
		//num1 = num1 + num2;
		//num2 = num1 - num2;
		//num1 = num1 - num2;

		//方式三：使用位运算符
		//有局限性：只能适用于数值类型
		//num1 = num1 ^ num2;
		//num2 = num1 ^ num2;
		//num1 = num1 ^ num2;

		System.out.println("num1 = " + num1 + ", num2 =" + num2);
	}
}
```

## 3-6 三元运算符

```java
/*
运算符之六：三元运算符(三目)
1.结构：(条件表达式)? 表达式1 : 表达式2
2.说明：
① 条件表达式的结果为boolean类型
② 根据条件表达式真或假，决定执行表达式1，还是表达式2.
  如果表达式为true，则执行表达式1；
  如果表达式为false，则执行表达式2；
③ 表达式1 和表达式2 要求是一致的。
④ 三元运算符可以嵌套使用

3.凡是可以使用三元运算符的地方，都可以改写为if-else;
  反之，不成立。

4.如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先选择三元运算符。原因：简洁、执行效率高。
*/
class  SanYuanTest{
	public static void main(String[] args){
		
		//获取两个整数的较大值
		int m = 12;
		int n = 5;

		int max = (m > n)? m : n;
		System.out.println(max);

		double num = (m > n)? 2 : 1.0;
		//(m > n)? 2 : "n大";//编译错误

		//********************************************************
		n = 12;
		String maxStr = (m > n)? "m大" : ((m == n)? "m和n相等" : "n大");
		System.out.println(maxStr);

		//**********************************************
		//获取三个数的最大值
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		int max1 = (n1 > n2)? n1 : n2;
		int max2 = (max1 > n3)? max1 : n3;
		System.out.println("三个数中的最大值为：" + max2);

		//不建议
		//int max3 = (((n1 > n2)? n1 : n2) > n3)? ((n1 > n2)? n1 : n2) : n3;
		System.out.println("三个数中的最大值为：" + max3);

		//改写成if-else：
		if(m > n){
			System.out.println(m);
		}else{
			System.out.println(n);
		}
	}
}
```
​

