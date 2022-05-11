# 
# 4.1 面向过程(POP)与面向对象(OOP)
```java
/*
 * 一、Java 面向对象学习的三条主线：（第4-6章）
 * 1.Java类及类的成员：属性、方法、构造器；代码块、内部类
 * 2.面向对象的三大特征：封装性、继承性、多态性
 * 3.其它关键字：this\super\static\final\abstract\interface\package\import
 * 
 * "大处着眼，小处着手"
 * 
 * 二、“人把大象装进冰箱”
 * 1.面向过程，强调的是功能行为，以函数为最小单位，考虑怎么做。
 * ① 打开冰箱
 * ② 把大象装进冰箱
 * ③ 把冰箱门关闭
 * 
 * 2.面向对象，将功能封装进对象，强调具备了功能的对象，以类/对象为最小单位，考虑谁来做。
 * 
 * 人{
 * 		打开(冰箱){
 * 			冰箱.开门();
 * 		}
 * 		抬起(大象){
 * 			大象.进入(冰箱);
 * 		}
 * 		关闭(冰箱){
 * 			冰箱.关门();
 * 		}
 * }
 * 
 * 冰箱{
 * 		开门(){}
 * 		关门(){}
 * }
 * 
 * 大象{
 * 		进入(冰箱){}
 * }
 * 
 * 三、面向对象的两个要素：
 * 类：是对一类事物的描述，是抽象的、概念上的定义。
 * 对象：是实际存在的该类事物的每个个体，因而也称为实例(instance)。 
 * 1. 面向对象程序设计的重点是类的设计
 * 2. 类的设计，其实就是类的成员的设计
 * 
 */
public class OOPTest {

}

```
# 4.2 Java基本元素：类和对象
# 4.3 对象的创建和使用
```java
/*
 * 一、设计类，其实就是设计类的成员
 * 
 * 	属性 = 成员变量 = Field = 域、字段
 * 	方法 = 成员方法 = 函数 = Method
 * 
 * 	创建类的对象 = 类的实例化 = 实例化类
 * 
 * 二、类和对象的使用（面向对象思想落地的实现
 * 	1.创建类，设计类的成员
 * 	2.创建类的对象 
 * 	3.通过“对象.属性”或“对象.方法”调用对象的结构
 * 
 * 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static类）
 * 	意味着，如果我们修改一个对象的属性a，则不影响另外一个对象属性a的值。
 * 
 * 四、对象的内存解析
 * 
 */
//测试类
public class PersonTest {
	public static void main(String[] args) {
		//2. 创建Person类的对象
		Person p1 = new Person();
		//Scanner scan = new Scanner(System.in);
		
		//调用对象的结构：属性、方法
		//调用属性：“对象.属性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		
		//******************************************
		Person p2 = new Person();
		System.out.println(p2.name);//null
		System.out.println(p2.isMale);//false
		
		//******************************************
		//将p1变量保存的对象地址值赋给p3，导致p1和p3指向了堆空间的同一个对象实体。
		Person p3 = p1;
		System.out.println(p3.name);//Tom

		p3.age = 10;
		System.out.println(p1.age);
	}
}

//1. 创建类，设计类的成员
class Person{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	
	//方法
	public void eat(){
		System.out.println("人可以吃饭");
	}
	public void sleep(){
		System.out.println("人可以睡觉");
	}
	public void talk(String language){
		System.out.println("人可以说话，使用的是：" + language);
	}
}

```
# 4.4 类的成员之一：属性
```java
/*
 * 类中属性的使用
 * 
 * 属性（成员变量） 	vs 	局部变量
 * 1. 相同点
 * 		1.1 定义变量的格式： 数据类型 变量名 = 变量值
 * 		1.2 先声明，后使用
 * 		1.3 变量都有其对应的作用域
 * 
 * 2. 不同点：
 * 		2，1 在类中声明的位置不同
 * 		属性：直接定义在类的一对{}内
 * 		局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
 * 
 * 		2.2 关于权限修饰符的不同
 * 		属性：可以在声明属性时，指明其权限，使用权限修饰符。
 * 			常用的权限修饰符，private、public、缺省、protected -->封装性
 * 			目前，大家声明属性时，都使用缺省就好
 * 		局部变量：不可以使用权限修饰符。
 * 
 * 		2.3 默认初始化值的情况
 * 		属性：类的属性，根据其类型，都有默认的初始化值
 * 			整型（byte、short、int、long），0
 * 			浮点型（float、double）：0.0
 * 			字符型（char）：0（或'\u0000'）
 * 			布尔型（boolean）：false
 * 			引用数据类型（类、数组、接口）：null
 * 
 * 		局部变量：没有默认初始化值.
 * 			意味着，我们在调用局部变量之前，一定要显式赋值。
 * 			特别的，形参在调用时，我们赋值即可
 * 
 * 		2.4 在内存中加载的位置
 * 		属性：加载到堆空间（非static）
 * 		局部变量：加载到栈空间
 * 
 */
public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
		
		u1.talk("中文");
		u1.eat();
	}
}

class User{
	//属性
	String name;
	int age;
	boolean isMale;
	
	public void talk(String language){//language：形参，也是局部变量
		System.out.println("我们使用" + language + "进行交流");
	}
	
	public void eat(){
		String food = "烙饼";//局部变量
		System.out.println("北方人喜欢吃" + food);
	}	
}
```
# 4.5 类的成员之二：方法
```java
/*
 * 类中方法的声明和使用
 * 
 * 方法： 描述类应该具有的功能
 * 比如： Math类：sqrt()\random()\...
 * 		Scanner类：nextXxx();
 * 		Arrays类：sort()\binarySearch()\toString()\equals()\...
 * 
 * 1. 举例：
 * public void eat(){}
 * public void sleep(int hour){}
 * public String getName(){}
 * public String getNation(String nation){}
 * 
 * 2. 方法的声明：	权限修饰符 返回值类型 方法名（形参列表）｛ 
 * 						方法体
 * 						//return 返回值; 
 * 				｝
 * 		static、final、abstract 来修饰的方法，后面再讲。
 * 
 * 3. 说明：
 * 		3.1 关于权限修饰符，默认方法的权限修饰符先都使用public
 * 			Java中规定的权限修饰符：private、public、缺省、protected --> 封装性再细说
 * 		3.2 返回值类型： 有返回值 	 vs	无返回值
 * 			3.2.1  如果方法有返回值，则必须再方法声明时，指定返回值的类型。同时，方法中，需要使用
 * 				  return关键字来返回指定类型的变量或者常量
 * 				     如果方法没有返回值，则方法声明时，使用void来表示。通常，没有返回值的方法中，就不需要
 * 				     使用return。但是，如果使用的话，智能“return；”表示结束此方法的意思。
 * 			3.2.2  我们定义方法该不该有返回值？
 * 				  ① 题目要求	② 凭经验，具体问题具体分析
 *  	3.3 方法名：属于标识符，遵循标识符的规则和规范：“见名知意”
 *  	3.4 形参列表： 方法可以声明0个、1个、或多个形参。
 *  		3.4.1 格式：数据类型1 形参1，数据类型2 形参2，...
 *  		3.4.2 我们定义方法时，该不该定义形参？
 *  			  ① 题目要求	② 凭经验，具体问题具体分析
 * 		3.5 方法体：方法功能的体现。
 * 
 * 
 * 
 * 4. return关键字的使用：
 * 		1. 使用范围：使用再方法体中
 * 		2. 作用： ① 结束方法		② 针对于有返回值类型的方法，使用"return 数据"方法返回所要的数据。
 * 		3. 注意点：return 关键字后面不可以声明执行语句。
 * 
 * 5. 方法的使用中，可以调用当前类的属性或方法.
 * 			特殊的，方法A中又调用了方法A：递归方法（例如快速排序）
 * 		方法中，不可以定义方法.
 */
public class CustomerTest {
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.eat();
		
		//测试形参是否需要设置的问题
//		int[] arr = new int[]{3,4,5,2,5,63,2,5};
//		cust1.sort(arr);
		
		cust1.sleep(8);
	}
}
//客户类
class Customer{
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客户吃饭");
		return;
		//return后不可以声明表达式
//		System.out.println("hello");
	}
	
	public void sleep(int hour){
		System.out.println("休息了" + hour + "个小时");
		eat();
//		sleep(10);//StackOverflowError,内存溢出
	}
	
	public String getName(){
		if(age > 18){
			return name;
		}else{
			return "Tom";
		}
	}
	
	public String getNation(String nation){
		String info = "我的国籍是：" + nation;
		return info;
	}
	
	public void sort(int[] arr){
		
	}
//	public void sort(){
//		int[] arr = new int[]{3,4,5,2,5,63,2,5};
		//...
//	}
	
//	public void info(){
//		
//		public void swim(){
//			
//		}
//	}
	
	
}
```
# *对象补充
```java
/*
 * 一、理解“万事万物皆对象”
 * 1.在Java语言范畴中，我们都将功能、结构封装到类中，通过类的实例化，来调用具体的功能结构
 * 		>Scanner,String等
 * 		>文件：File
 * 		>网络资源：URL
 * 2.涉及到Java语言与前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象。
 * 
 * 二、内存解析的说明
 * 1.引用类型的变量，只可能存储两类值：null 或 地址值（含变量的类型）
 * 
 * 三、匿名对象的使用
 * 1.理解：我们创建的对象，没有显式的赋给一个变量名，即为匿名对象
 * 2.特征：匿名对象只能调用一次
 * 3.使用：如下
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
//		p = null;
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
		
		//匿名对象
		new Phone().sendEmail();
		new Phone().playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();//0.0
		
		//************************************
		PhoneMall mall = new PhoneMall();
//		mall.show(p);
		//匿名对象的使用
		mall.show(new Phone());
	}
}

class PhoneMall{
	public void show(Phone phone){
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;//价格
	
	public void sendEmail(){
		System.out.println("发送邮件");
	}
	public void playGame(){
		System.out.println("玩游戏");
	}
	public void showPrice(){
		System.out.println("手机价格为：" + price);
	}
}
```
# *工具类封装测试

1. 封装
```java
public class ArrayUtil {
	
	//求数组的最大值
	public int getMax(int[] arr){
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	//求数组的最小值
	public int getMin(int[] arr){
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	//求数组的总和
	public int getSum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	//求数组的平均值
	public double getAvg(int[] arr){
		return getSum(arr) / arr.length;
	}

	//反转数组
	public void reverse(int[] arr){
		int temp;
		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	//复制数组
	public int[] copy(int[] arr){
		int[] arr1 = new int[arr.length];
		for(int i = 0;i < arr.length;i++){
			arr1[i] = arr[i];
		}
		return arr1;
	}
	
	//数组排序(冒泡)
	public void sort(int[] arr){
		for(int i = 0;i < arr.length -1;i++){
			for(int j = 0;j < arr.length - 1 - i;j++){
				if(arr[j] > arr[j + 1]){
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					
					//错误的：
//					swap(arr[j],arr[j + 1]);
					
					//正确的：
					swap(arr,j,j + 1);
				}
			}
		}
	}
    
    //错误的：交换数组中指定两个位置元素的值
//	public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}
	
	//正确的：交换数组中指定两个位置元素的值
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//遍历数组
	public void print(int[] arr){
		System.out.print("[");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]);
			if(i < arr.length - 1){
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	//查找指定元素
	public int getIndex(int[] arr,int dest){
		//线性查找
		for(int i = 0;i < arr.length;i++){
			if(dest == (arr[i])){
				return i;
			}
		}
		return -1;//返回一个负数，表示没有找到
	}
}
```

2. 测试
```java
public class ArrayUtilTest {
	public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
		System.out.println("原数组：");
		util.print(arr);
		
		int max = util.getMax(arr);
		System.out.print("最大值：");
		System.out.println(max);
		
		int min = util.getMin(arr);
		System.out.print("最小值：");
		System.out.println(min);
		
		int sum = util.getSum(arr);
		System.out.print("总和：");
		System.out.println(sum);
		
		double avg = util.getAvg(arr);
		System.out.print("平均值：");
		System.out.println(avg);
		
		util.reverse(arr);
		System.out.println("反转数组：");
		util.print(arr);
		
		int[] arr1 = util.copy(arr);
		System.out.println("数组复制：");
		util.print(arr1);
		
		System.out.println("排序：");
		util.sort(arr);
		util.print(arr);
		
		int index = util.getIndex(arr, 0);
		System.out.print("0在数组中的位置：");
		System.out.println(index);
	}
}
```
# 4.6 再谈方法
## 方法的重载
```java
/*
 * 方法的重载（overload） loading...
 * 
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * 		“两同一不同”：	同一个类、相同方法名
 * 					参数列表不同：参数个数不同，参数类型不同
 * 2.举例：
 * 		Arrays 类中重载的 sort() / binarySearch()
 * 3.判断：
 * 		跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 * 4.在通过对象调用方法时，如何确定某一个指定的方法
 * 		方法名 ---> 参数列表
 */
public class OverLoadTest {
	public static void main(String[] args) {
		
		OverLoadTest test = new OverLoadTest();
		test.getSum(1, 2);
		
	}
	//如下的4个方法就构成了重载
	public void getSum(int i, int j) {
		System.out.println("1");
	}

	public void getSum(double d1, double d2) {
		System.out.println("2");
	}

	public void getSum(String s,int i) {
		System.out.println("3");
	}
	public void getSum(int i,String s) {
		System.out.println("4");
	}
	
//	public void getSum(int i, int j) {
//		return 0;
//	}
	
//	public void getSum(int m, int n) {
//		
//	}
	
//	private void getSum(int i, int j) {
//		
//	}
}
```
## 可变个数形参的方法
```java
/*
 * 可变个数形参的方法
 * 
 * 1.JDK 5.0 新增的内容
 * 2.具体使用
 * 	2.1 可变个数形参的格式：数据类型 ... 变量名
 * 	2.2 当调用可变个数形参的方法时，传入的参数个数可以是：0个，1个，2个...
 * 	2.3 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 * 	2.4 可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间，不构成重载
 * 	2.5 可变个数形参在方法的形参中，必须声明在（形参列表的）末尾
 * 	2.6 可变个数形参在方法的形参中，最多只能声明一个可变形参
 * 
 */
public class MethodArgsTest {
	
	public static void main(String[] args) {
		
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello ","world!");
		test.show();
		
		test.show("AA","BB","CC");//show(String ... strs)
		test.show(new String[]{"AA","BB","CC"});//show(String[] str)---JDK5.0以前需要这样调用
		
	}
	public void show(int i){
		System.out.println("show(int i)");
	}
	public void show(String s){
		System.out.println("show(String s)");
	}
	public void show(String ... strs){
		System.out.println("show(String ... strs)");
		for(int i = 0;i < strs.length;i++){
			System.out.println(strs[i]);
		}
	}
//	public void show(String[] str){
//		
//	}
	
	//The variable argument type String of the method show must be the last parameter
//	public void show(String ... strings,int i){
//		
//	}
}
```
## 变量的赋值
```java
/*
 * 关于变量的赋值
 *
 * 	如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 * 	如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 */
public class ValueTransferTest {
	public static void main(String[] args) {
		
		System.out.println("******************基本数据类型*******************");
		int m = 10;
		int n = m;
		
		System.out.println("m = " + m + ", n = " + n);
		
		n = 20;
		
		System.out.println("m = " + m + ", n = " + n);
		
		System.out.println("******************引用数据类型*******************");
		
		Order o1 = new Order();
		o1.OrderId = 1001;
		
		Order o2 = o1;//赋值以后，o1和o2的地址值相同，都指向了堆空间中同一个对象实体。
//		System.out.println(o1);
//		System.out.println(o2);
		
		System.out.println("o1.OrderId = " + o1.OrderId + ", o2.OrderId = " + o2.OrderId);
		
		o2.OrderId = 1002;
		
		System.out.println("o1.OrderId = " + o1.OrderId + ", o2.OrderId = " + o2.OrderId);
	}
}
class Order{
	int OrderId;
}
```
## 值传递机制
```java
/*
 * 方法的形参的传递机制：值传递
 * 
 * 1. 形参：方法定义时，声明的小括号内的参数
 *    实参：方法调用时，实际传递给形参的数据
 * 
 * 2. 值传递机制：
 * 	如果参数是基本数据类型，此时实参赋给形参的是，实参真实存储的数据值。
 * 	如果参数是引用数据类型，此时实参赋给形参的是，实参存储数据的地址值。
 * 
 */
public class ValueTransferTest1 {
	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		
		System.out.println("m = " + m + ", n = " + n);
		
		//交换两个变量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;
		
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n);
		
		System.out.println("m = " + m + ", n = " + n);
	}
	
	public void swap(int m,int n){
		int temp = m;
		m = n;
		n = temp;
	}
}
```
```java
public class ValueTransferTest2 {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n);
		
		//交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;
		
		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);
		System.out.println("m = " + data.m + ", n = " + data.n);
	}
	public void swap(Data data){
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}

class Data{
	
	int m;
	int n;
	
}
```
```java
public class ArrayUtil{	
	//数组排序(冒泡)
	public void sort(int[] arr){
		for(int i = 0;i < arr.length -1;i++){
			for(int j = 0;j < arr.length - 1 - i;j++){
				if(arr[j] > arr[j + 1]){
					
					//错误的：
//					swap(arr[j],arr[j + 1]);
					
					//正确的：
					swap(arr,j,j + 1);
				}
			}
		}
	}
	
	//错误的：交换数组中指定两个位置元素的值
//	public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}
	
	//正确的：交换数组中指定两个位置元素的值
	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
    public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
		
		System.out.println("排序：");
		util.sort(arr);
		util.print(arr);
		
	}
}
```
# 4.7 OOP特征一：封装与隐藏
```java
public class ValueTransferTest {
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		ValueTransferTest test = new ValueTransferTest();
		test.change(s1);
		
		System.out.println(s1);//hello
	}
	
	public void change(String s){
		s = "hi~~";
	}
}
```
```java
/*
 * 面向对象的特征一：封装与隐藏		3W: what?  why?  how?
 * 一、问题的引入：
 * 	当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值，
 * 	这里，赋值操作要受到属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。
 * 	但是，在实际问题中，我们往往需要给属性赋值，加入额外的限制条件。这个条件就不能在
 * 	属性声明时体现，我们只能通过方法进行限制条件的添加。（比如，setLegs）同时，我们
 * 	需要避免用户再使用"对象.属性"的方式对属性进行赋值，则需要将属性声明为私有的（private）
 * 	-->此时，针对于属性就体现了封装性。
 * 
 * 二、封装性的体现：
 * 	我们将类的属性私有化（private），同时，提供公共的(public)方法来获取(getXxx)
 * 	和设置(setXxx)此属性的值
 * 
 * 	拓展：封装性的体现：
 * 		① 如上	② 不对外暴露的私有的方法	③ 单例模式...
 * 
 * 三、封装性的体现，需要权限修饰符来配合。
 * 1. Java规定的4种权限（从小到大排列），private、缺省、protected、public
 * 2. 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 			修饰类的话，只能使用：缺省、public
 * 
 * 总结封装性：Java提供了4中权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小。
 * 
 */
public class AnimalTest {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
//		a.age = 1;
		a.setAge(1);
		
//		a.legs = 4;//The field Animal.legs is not visible
		
		a.show();
		
//		a.legs = -4;
//		a.setLegs(6);
		a.setLegs(-6);
//		a.legs = -4;//The field Animal.legs is not visible
		
		a.show();
	}
}

class Animal{
	
	String name;
	private int age;
	private int legs;//腿的个数
	
	//对属性的设置
	public void setLegs(int l){
		if(l >= 0 && l % 2 == 0){
			legs = l;
		}else{
			legs = 0;
//			抛出一个异常（暂时没有讲）
		}
	}
	
	//对属性的获取
	public int getLegs(){
		return legs;
	}
	
	public void eat(){
		System.out.println("动物进食");
	}
	
	public void show(){
		System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
	}
	
	//提供关于属性age的get和set方法
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age = a;
	}
}
//private class Dog{
//	
//}
```
```java
public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.oderDefault = 1;
		order.orderPublic = 2;
		
		//出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3;//orderPrivate cannot be resolved or is not a field
		
		order.methodDefault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
		
	}	
}
public class Order {
	
	private int oderPrivate;
	int oderDefault;
	public int orderPublic;
	
	private void methodPrivate(){
		oderPrivate = 1;
		oderDefault = 2;
		orderPublic = 3;
	}
	void methodDefault(){
		oderPrivate = 4;
		oderDefault = 5;
		orderPublic = 6;
	}
	public void methodPublic(){
		oderPrivate = 7;
		oderDefault = 8;
		orderPublic = 9;
	}
	
}
```
# 4.8 类的成员之三：构造器
```java
/*
 * 类的结构之三：构造器（或构造方法constructor）的使用
 * construct：建设、建造。	construction:CCB。 	constructor:建设者。
 * 
 * 一、构造器的作用：
 * 1. 创建对象
 * 2. 初始化对象的属性
 * 
 * 二、说明：
 * 1. 如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器；
 * 2. 定义构造器的格式： 权限修饰符  类名（形参列表）{}
 * 3. 一个类中定义的多个构造器，彼此构成重载
 * 4. 一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5. 一个类中，至少会有一个构造器。
 */
public class PersonTest {
	public static void main(String[] args) {
		//创建类的对象： new + 构造器
		Person p = new Person();
		
		p.eat();
		
		Person p1 = new Person("Tom");
		System.out.println(p1.name);
	}
}
class Person {
	// 属性
	String name;
	int age;

	// 构造器
	public Person() {
		System.out.println("Person()...");
	}

	public Person(String n) {
		name = n;
	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	// 方法
	public void eat() {
		System.out.println("人吃饭");
	}

	public void study() {
		System.out.println("人可以学习");
	}
}

```
## 总结：属性赋值的先后顺序
```java
/*
 * 总结：属性赋值的先后顺序
 * 
 * ① 默认初始化值
 * ② 显式初始化
 * ③ 构造器中赋值
 * ④ 通过"对象.方法"或"对象.属性"的方式，赋值
 * 
 * 以上操作的先后顺序：① -> ② -> ③ -> ④	
 * 
 */
public class UserTest {

	public static void main(String[] args) {
		User u = new User();
		
		System.out.println(u.age);
		
		User u1 = new User(2);
		
		u1.setAge(3);
		
		System.out.println(u1.age);
	}
}

class User{
	String name;
	int age = 1;
	
	public User(){
		
	}
	public User(int a){
		age = a;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
}
```
## JavaBean
```java
/*
 * JavaBean是一种Java语言写成的可重用组件。
 * 
 * 所谓javaBean，是指符合如下标准的Java类：
 * 		● 类是公共的
 * 		● 有一个无参的公共的构造器
 * 		● 有属性，且有对应的get、set方法
 * 
 */
public class Customer {
	
	private int id;
	private String name;
	
	public Customer(){
		
	}
	
	public void setId(int i){
		id = i;
	}
	public int getId(){
		return id;
	}
	public void setId(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
}
```
# 4.9 关键字：this
```java
/*
 * this关键字的使用
 * 1. this可以用来修饰、调用：属性、方法、构造器
 * 
 * 2. this修饰属性和方法：
 * 		this理解为：当前对象  或  当前正在创建的对象
 * 		
 * 	2.1	在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性或方法。
 * 		但是通常情况下，我们都省略"this."。
 * 		特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用"this.变量"的方式，
 * 		表明此变量是属性而非形参
 * 	2.2	在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用当前正在创建的对象属性或方法。
 * 		但是通常情况下，我们都省略"this."。
 * 		特殊情况下，如果构造器的形参和类的属性同名时，我们必须显式的使用"this.变量"的方式，
 * 		表明此变量是属性而非形参
 * 
 * 3. this调用构造器
 * 		① 我们在类的构造器中，可以显式的使用"this(形参列表)"方式，调用本类中指定的其他构造器
 * 		② 构造器中不能通过"this(形参列表)"方式调用自己
 * 		③ 如果一个类中有n个构造器，则最多有n - 1个构造器中使用了"this(形参列表)"
 * 		④ 规定："this(形参列表)"必须声明在当前构造器的首行
 * 		⑤ 构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他构造器
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		p1.eat();
		
		System.out.println();
		
		Person p2 = new Person("Jerry",20);
		System.out.println(p2.getAge());
	}
}

class Person{
	
	private String name;
	private int age;
	
	public Person(){
//		this.eat();
		String info = "Person在初始化时，需要考虑如下的1，2，3，4...（共40行代码）";
		System.out.println(info);
	}
	public Person(String name){
		this();
		this.name = name;
		
	}
	public Person(int age){
		this();
		this.age = age;
		
	}
	public Person(String name,int age){
		this(age);
		this.name = name;
//		this.age = age;
		//Person在初始化时，需要考虑如下的1，2，3，4...（共40行代码）
	}
	
	//***************************************
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void eat(){
		System.out.println("人吃饭");
		this.study();
	}
	public void study(){
		System.out.println("人学习");
	}
}
```
# 4.10 关键字：package、import
```java
package com.atguigu.java2;

import java.lang.reflect.Field;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;

import com.atguigu.expe2.Account;
import com.atguigu.expe2.Bank;
import com.atguigu.java2.java3.Dog;

import static java.lang.System.*;
import static java.lang.Math.*;
/*
 * 一、package关键字的使用
 * 1.为了更好的实现项目中类的管理，提供包的概念
 * 2.使用package声明类或接口所需的包，声明在源文件的首行
 * 3.包，属于标识符，遵循标识符的命名规则、规范（xxxyyyzzz）、“见名知意”
 * 4.每"."一次，就代表一层文件目录
 * 
 * 补充： 同一个包下，不能命名同名的接口、类
 * 		不同的包下，可以命名同名的接口、类
 * 
 * 二、import关键字的使用
 * import：导入
 * 1.在源文件中显式的使用import结构导入指定包下的类、接口
 * 2.声明在包的声明和类的声明之间
 * 3.如果需要导入多个结构，则并列写出即可
 * 4.可以使用"xxx.*"的方式，表示可以导入xxx包下的所有结构
 * 5.如果使用的类或接口是java.lang包下定义的，则可以省略import结构
 * 6.如果使用的类或接口是本包下定义的，则可以省略import结构
 * 7.如果在源文件中，使用了不同包下的同名的类，则必须至少有一个类以全类名的方式显示
 * 8.使用"xxx.*"方式表明可以调用xxx包下的所有结构。但是如果使用的是xxx子包下的结构，则仍需要显式导入。
 * 
 * 9.import static：导入指定类或接口中的静态结构：属性或方法。
 */
public class PackageImportTest {
	public static void main(String[] args) {
		
		String info = Arrays.toString(new int[]{1,2,3});
		
		Bank bank = new Bank();
		
		ArrayList list = new ArrayList();
		HashMap map = new HashMap(); 
		
		Scanner s = null;
		
		System.out.println("hello!");
		
		Person p = new Person();
		
		Account acct = new Account(1000);
		//全类名的方式显示
		com.atguigu.expe1.Account acct1 = new com.atguigu.expe1.Account(1000,2000,0.0123);
		
		Date date = new Date();
		java.sql.Date date1 = new java.sql.Date(64564646L);

		Dog dog = new Dog();
		
		Field field = null;
		
		out.println("hello！");
		
		long num = Math.round(123.456);
		long num1 = round(123.456);
	}
}
```
