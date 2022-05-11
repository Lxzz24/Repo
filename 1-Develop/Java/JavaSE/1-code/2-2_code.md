#
# 2.5 分支结构

## （1）if-else

```java
/*
分支结构中的if-else（条件判断结构）

一、三种结构
第一种：
if(条件表达式){
	执行表达式
}

第二种：二选一
if(条件表达式){
	执行表达式1
}else{
	执行表达式2
}

第三种：多选一
if(条件表达式1){
	执行表达式1
}else if(条件表达式2){
	执行表达式2
}else if(条件表达式3){
	执行表达式2
}...
else{
	执行表达式n
}

*/
class IfTest{
	public static void main(String[] args){
		
		//举例1
		int heartBeats = 79;
		if (heartBeats < 60 || heartBeats > 100){
			System.out.println("需要做进一步检查");
		}
				
		System.out.println("检查结束");

		//举例2
		int age = 23;
		if(age < 18){
			System.out.println("你还可以看动画片");
		}else{
			System.out.println("你可以看成人电影了");
		}

		//举例3
		if(age < 0){
			System.out.println("您输入的数据非法");
		}else if (age < 18){
			System.out.println("青少年时期");
		}else if (age < 35){
			System.out.println("青壮年时期");
		}else if (age < 60){
			System.out.println("中年时期");
		}else if (age < 120){
			System.out.println("老年时期");
		}else{
			System.out.println("你是要成仙啊~~");
		}
	}
}
```

```java
/*
如何从键盘获取不同类型的变量：需要使用Scanner类
具体实现步骤：
1.导包： import java.util.Scanner;
2.Scanner的实例化:Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法(next() / nextXxx())，来获取指定的变量

注意：
需要根据相应的方法，来输入指定类型的值。
如果输入的数据类型与要求的类型不匹配时，会报异常：InputMismatchException，导致程序终止。
*/

import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的姓名：");
		String name = scan.next();
		System.out.println(name);

		System.out.println("请输入你的年龄：");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("你是否相中我了呢？（true/false）");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);

		//对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
		System.out.println("请输入你的性别：（男/女）");
		String gender = scan.next();//"男"
		char genderChar = gender.charAt(0);//获取索引为0位置上的字符
		System.out.println(genderChar);		
	}
}
```

## （2）switch-case

```java
/*
分支结构之二：switch-case
1.格式
switch(表达式){
case 常量1:
	执行语句1;
	//break;
case 常量2:
	执行语句2;
	//break;
	......
case 常量N:
	执行语句N;
	//break;
2. 说明：
① 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句。
  当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构末尾结束为止。
② break,可以使用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构
③ switch结构中的表达式只能是如下的6种数据类型之一：
  byte、short、char、int、枚举类型(JDK5.0)、String(JDK7.0)
④ case之后只能声明常量。不能声明范围
⑤ break关键字是可选的
⑥ default：相当于if-else结构中的else。
		   default结构是可选的
*/
class SwitchCaseTest{
	public static void main(String[] args){
		int number = 2;
		switch(number){
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
		}

		String season = "summer";
		switch (season) {
		case "spring":
			System.out.println("春暖花开");
			break;
		case "summer":
			System.out.println("夏日炎炎");
			break;
		case "autumn":
			System.out.println("秋高气爽");
			break;
		case "winter":
			System.out.println("冬雪皑皑");
			break;
		default:
			System.out.println("季节输入有误");
			break; 
		}
		
		//**************如下的两种情况都编译不通过*********************
		//情况一
		/*
		boolean isHandsome = true;
		switch(isHandsome){
		
		case true:
			System.out.println("我好帅啊~~~");
			break;
		case false:
			System.out.println("我好丑啊~~~");
			break;
		default:
			System.out.println("输入有误~~~");
		}
		*/

		//情况二
		/*
		int age = 10;
		switch(age){
		case age > 18:
			System.out.println("成年了");
			break;
		default:
			System.out.println("未成年");
		}
		*/
	}
}
```

# 2.6 循环结构

## （1）for循环

```java
/*
For循环结构的使用
一、循环结构的4个要素
① 初始化条件
② 循环条件
③ 循环体
④ 迭代条件

二、for循环的结构
for(①;②;④){
	③
}
执行过程① - ② - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - ... - ②
*/
class ForTest{
	public static void main(String[] args){
		
		for (int i = 1;i <= 5;i++){//i:
			System.out.println("Hello World!");
		}
        //i：在for循环内有效，出了for循环就失效了

		//练习：
		int num = 1;
		for (System.out.print('a');num <= 3;System.out.print('c'),num++){
			System.out.print('b');
		}
		//输出结果：abcbcbc
		System.out.println();

		//例题：遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
		int sum = 0;//记录所有偶数的和
		int count = 0;//记录所有偶数的个数
		for (int i = 1;i <= 100; i++){
			if (i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}			
		}
		System.out.println("总和为：" + sum + "，个数为" + count);
	}
}
```

## （2）while循环

```java
/*
While循环结构的使用
一、循环结构的4个要素
① 初始化条件
② 循环条件
③ 循环体
④ 迭代条件

二、while循环的结构
①
whlie(②){
	③
	④
}
执行过程① - ② - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1. 写while循环千万小心不要丢了迭代条件，一旦丢了，就可能导致死循环！
2. 我们写程序，要避免出现死循环。
3. for循环和while循环是可以相互转换的！
   区别：for循环和while循环的初始化条件部分的作用范围不同。
*/
class WhileTest{
	public static void main(String[] args){
		//遍历100以内的所有偶数
		int i = 1;
		while (i <= 100){
			if (i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}

		System.out.println("");		
	}
}
```

## （3）do-while循环

```java
/*
do-While循环结构的使用
一、循环结构的4个要素
① 初始化条件
② 循环条件
③ 循环体
④ 迭代条件

二、while循环的结构
①
do{
	③;
	④;
}while (②);

执行过程① - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - ② - ... - ②

说明：
1. do-while循环至少会执行一次循环体
2. 开发中，使用for和while更多一些。较少使用do-while。

*/
class DoWhileTest{
	public static void main(String[] args){
		//遍历100以内的所有奇数，并计算所有奇数的和及奇数的个数
		int num = 1;
		int sum = 0;
		int count = 0;
		do{
			if (num % 2 == 1){
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}while (num <= 100);
		System.out.println("个数为" + count);
		System.out.println("总和为" + sum);

		//**************do-while至少执行一次循环体**************
		int num1 = 10;
		while (num1 > 10)
		{
			System.out.println("hello：while");
			num1--;
		}
		
		int num2 = 10;		
		do{
			System.out.println("hello：do-while");
			num2--;
		}while (num2 > 10);		
	}
}
```

## （4）嵌套循环

```java
/*
嵌套循环的使用
1. 嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
2. 
外层循环：循环结构B
内层循环：循环结构A
3.说明： 
① 内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
② 假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m * n次
4. 技巧
   外层循环控制行数，内层循环控制列数

*/
class ForForTest{
	public static void main(String[] args){
		
		//******
		System.out.println("******");
		for (int i = 1;i <= 6;i++){
			System.out.print("*");
		}
		System.out.println();
		/*
		******
		******
		******
		******
		*/
		for (int j = 1;j <= 4;j++){
			for(int i = 1;i <= 6;i++){
				System.out.print("*");
			}
			System.out.println();
		}

		/*			i(行号)		j(*的个数)
		*			1			1
		**			2			2
		***			3			3
		****		4			4
		*****		5			5
		*/
		for (int i = 1;i <= 5;i++){
			for(int j = 1;j <= i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*				i(行号)		j(*的个数)
		****			1			4
		***				2			3
		**				3			2
		*				4			1
		*/
		
		for (int i = 1;i <= 4;i++){
			for (int j = 1;j <= 5 - i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		*/
		//略

		/*				i(行数)	j(-)	k(*-)
		----*----		1		4		1
		---*-*---		2		3		2
		--*-*-*--		3		2		3
		-*-*-*-*-		4		1		4
		*-*-*-*-*		5		0		5
			
		-*-*-*-*		1		1		4
		--*-*-*			2		2		3
		---*-*			3		3		2
		----*			4		4		1
		*/

		//上半部分
		for (int i = 1;i <= 5;i++){
			for (int j = 1;j <= 5 - i;j++){
				System.out.print(" ");
			}
			for (int k = 1;k <= i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		//下半部分
		for (int i = 1;i <= 4;i++){
			for (int j = 1;j <= i;j++){
				System.out.print(" ");
			}
			for (int k = 1;k <= 5 - i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}

		/*				i(行数)	j(*)	k(--)	l(*)
		**********		1		5		0		5
		****--****		2		4		1		4
		***----***		3		3		2		3
		**------**		4		2		3		2
		*--------*		5		1		4		1
			
		**------**		1		2		3		2
		***----***		2		3		2		3
		****--****		3		4		1		4
		**********		4		5		0		5
		*/
		//上半部分
		for (int i = 1;i <= 5;i++){
			for (int j = 1;j <= 6-i;j++){
				System.out.print("*");
			}
			for (int k = 1;k <= i-1;k++){
				System.out.print("  ");
			}
			for (int l = 1;l <= 6-i;l++){
				System.out.print("*");
			}
			System.out.println();
		}
		//下半部分
		for (int i = 1;i <= 4;i++){
			for (int j = 1;j <= i+1;j++){
				System.out.print("*");
			}
			for (int k = 1;k <= 4-i;k++){
				System.out.print("  ");
			}
			for (int l = 1;l <= i+1;l++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
```

# 2.7 关键字：break和continue

```java
/*
break和continue关键字的使用
			使用范围			循环中使用的作用(不同点)		相同点
break：		switch-case			结束当前循环					
			循环结构中											关键字后面不能声明执行语句
continue：	循环结构中			结束当次循环
*/
class BreakContinueTest{
	public static void main(String[] args){
		for (int i = 1;i <= 10;i++){
			if (i % 4 == 0){
				//break;//123
				continue;//123567910
				//System.out.print("今晚猎个痛快！！！");
			}
			System.out.print(i);
		}
		System.out.println("\n");
		//***********************************
		label:for (int i = 1;i <= 4;i++){
			for (int j = 1;j <= 10;j++){
				if (j % 4 == 0){
					//break;//默认跳出包裹此关键字最近的一层循环
					//continue;

					//break label;//结束指定标识的一层循环结构
					continue label;//结束指定标识的一层循环结构的当次循环
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
```
