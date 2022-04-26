# 3.1 数组的概述
# 3.2 一维数组的使用
```java
/*
 * 一、数组的概述
 * 1. 数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
 * 并通过编号的方式对这些数据进行统一管理。
 * 
 * 2. 数组相关的概念
 * > 数组名
 * > 元素
 * > 角标、下标、索引
 * > 数组的长度：元素的个数
 * 
 * 3. 数组的特点：
 * 1） 数组是有序排列的
 * 2） 数组属于引用数据类型的变量。数组的元素既可以是基本数据类型，也可以是引用数据类型。
 * 3） 创建数组对象会在内存中开辟一整块连续的空间（不连续的-->链表）
 * 4） 数组的长度一旦确定，就不能修改。
 * 
 * 4. 数组的分类
 *    ①按照维数：一维数组、二维数组...
 *    ②按照数组元素的类型：基本数据类型元素的数组，引用数据类型元素的数组。
 * 5. 一维数组的使用
 * 	  ① 一维数组的声明和初始化
 * 	  ② 如何调用数组的指定位置的元素
 *    ③ 如何获取数组的长度
 *    ④ 如何遍历数组
 *    ⑤ 数组元素的默认初始化值，见 ArrayTest1.java
 *    ⑥ 数组的内存解析，见 ArrayTest1.java
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		//1. 一维数组的声明和初始化
		int num;//声明
		num = 10;//初始化
		int id = 1001;//声明+初始化
		
		int[] ids;
		//1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
		ids = new int[]{1001,1002,1003,1004};//这里不能去掉new int[]
		//1.2 动态初始化:数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		//错误的写法：
		//int[] arr1 = new int[];
		//int[5] arr2 = new int[5];
		//int[] arr3 = new int[3]{1,2,3};
        
        //也是正确写法
		int[] arr4 = {1,2,3,4,5};//类型推断
		
		//总结：数组一旦初始化完成，其长度就确定了。
				
		//2. 如何调用数组的指定位置的元素：通过角标的方式。
		//数组的角标（或索引）从0开始，到数组的长度-1结束。
		names[0] = "韩信";
		names[1] = "蔡徐坤";
		names[2] = "肖战";
		names[3] = "吴签";
		names[4] = "李元芳";
		//names[5] = "周扬青";
		
		//3. 如何获取数组的长度。
		//属性：length
		System.out.println(names.length);//5
		System.out.println(ids.length);
				
		//4. 如何遍历数组
		//复制：选中当前行，ctrl + alt + ↓
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		for(int i = 0;i < names.length;i++){
			System.out.println(names[i]);
		}
	}
}
```
```java
/*
 *   ⑤ 数组元素的默认初始化值
 *    	> 数组元素是整型：0
 *    	> 数组元素是浮点型：0.0
 *    	> 数组元素是char型：0或'\u0000'，而非'0'
 *      > 数组元素是boolean型：false
 * 		> 数组元素是引用数据型：null
 *   
 *   ⑥ 数组的内存解析
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		//5. 数组元素的默认初始化值
		int[] arr = new int[4];
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);//0	 0	 0	 0
		}
		System.out.println("********************");
				
		short[] arr1 = new short[4];
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("********************");
				
		float[] arr2 = new float[4];
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("********************");
				
		char[] arr3 = new char[4];
		for(int i = 0;i < arr3.length;i++){
			System.out.println("----" + arr3[i] + "****");
		}
		System.out.println("********************");
				
		if(arr3[0] == 0){
			System.out.println("你好！");
		}
		System.out.println("********************");
		
		boolean[] arr4 = new boolean[5];
		System.out.println(arr4[0]);
		System.out.println("********************");
		
		String[] arr5 = new String[5];
		System.out.println(arr5[0]);
		if(arr5[0] == null){
			System.out.println("北京天气不错！");
		}
				
		//6. 数组的内存解析						
	}
}
```
# 3.3 多维数组的使用
```java
/*
 * 二维数组的使用
 * 
 * 1. 理解：
 * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素
 * 而存在。其实，从数组底层的运行机制来看，其实没有多维数组。
 * 
 * 2. 二维数组的使用
 * ① 二维数组的声明和初始化
 * ② 如何调用数组的指定位置的元素
 * ③ 如何获取数组的长度
 * ④ 如何遍历数组
 * ⑤ 数组元素的默认初始化值//ArrayTest3
 * ⑥ 二维数组的内存解析//ArrayTest3
 * 
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//1. 二维数组的声明和初始化
		int[] arr = new int[]{1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];//三行二列
		//动态初始化2
		String[][] arr3 = new String[3][];
		
		//错误情况
		//String[][] arr4 = new String[][4];
		//String[4][3] arr5 = new String[][];
		//int[][] arr6 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};
		
		//也是正确写法
		int arr4[][] = new int[][]{{1,2,3},{4,5},{6,7,8}};
		int[] arr5[] = new int[][]{{1,2,3},{4,5},{6,7,8}};
		int[] arr6[] = {{1,2,3},{4,5},{6,7,8}};
		
		//2. 如何调用数组的指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);
		
		//3. 获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length);//3
		System.out.println(arr4[1].length);//2
		
		//4. 如何遍历二维数组
		for(int i = 0;i < arr4.length;i++){
			for(int j = 0;j < arr4[i].length;j++){
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
```
```java
/*
 * 二维数组的使用：
 * 规定：二维数组分为外层数组的元素，内层数组的元素
 * 		int[][] arr = new int[4][3];
 * 		外层元素：arr[0],arr[1]...
 * 		内层元素：arr[0][0],arr[0][1]...
 * 
 * ⑤ 数组元素的默认初始化值
 * 针对初始化方式一：比如，int[][] arr = new int[4][3];
 * 		外层元素的初始化值为：地址值
 * 		内层元素的初始化值为：与一维数组初始化情况相同
 * 针对初始化方式二：比如，int[][] arr = new int[4][];
 * 		外层元素的初始化值为：null
 * 		内层元素的初始化值为：不能调用，否则报错：NullPointerException
 * 
 * ⑥ 二维数组的内存解析
 * 
 */
public class ArrayTest3 {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//[I@15db9742(地址值)
		//[：一维数组，I：int型，@15db9742：具体地址（十六进制）
		System.out.println(arr[0][0]);//0
//		System.out.println(arr);//[[I@6d06d69c
		System.out.println("*******************");
		
		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);//[F@6d06d69c
		System.out.println(arr1[0][0]);//0.0
		System.out.println("*******************");
		
		String[][] arr2 = new String[4][2];
		System.out.println(arr2[1]);//[Ljava.lang.String;@7852e922
		System.out.println(arr2[1][1]);//null
		System.out.println("*******************");
		
		double[][] arr3 = new double[4][];
		System.out.println(arr3[1]);//null
		System.out.println(arr3[1][0]);//NullPointerException
		
	}
}
```
# 3.4 数组中涉及到的常见算法
## ①数组元素的赋值(杨辉三角、回形数等)
> 使用二维数组打印一个 10 行杨辉三角。
> 【提示】
> 1. 第一行有 1 个元素, 第 n 行有 n 个元素
> 2. 每一行的第一个元素和最后一个元素都是 1
> 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
> `yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];`

![image.png](https://cdn.nlark.com/yuque/0/2021/png/2822416/1637117262081-501c1f3f-6614-4fea-94af-f1f909860d82.png#clientId=u11846367-24fb-4&from=paste&height=354&id=ub50d1cc0&margin=%5Bobject%20Object%5D&name=image.png&originHeight=354&originWidth=702&originalType=binary&ratio=1&size=18847&status=done&style=none&taskId=u843b9525-15cf-49f9-bc87-b042b6015b4&width=702)
```java
public static void main(String[] args) {
	//1. 声明并初始化二维数组
    int[][] yanghui = new int[10][];
    
    //3. 遍历二维数组
	for(int i = 0;i < yanghui.length;i++){
        
        //2. 给数组的元素赋值
		yanghui[i] = new int[i+1];
        for(int j = 0;j < yanghui[i].length;j++){
			if(j == 0 || j == i){
                //2.1 给首末元素赋值
				yanghui[i][j] = 1;
			}else if(i >= 2 && j >= 1){
                //2.2 给每行的非首末元素赋值
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
			System.out.print(yanghui[i][j] + "\t");
		}
		System.out.println();
    }
}
```
ex：（1+1）i 展开式的每一项 --> 杨辉三角每行的元素
如：`yanghui[2] = (1 + 1)2 = 1 + 2 + 1`
`(a + b)2 = a2 + 2ab + b2;`
## ② 求数值型数组中元素的最大值、最小值、平均数、总和等
```java
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		// 数组
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 90 + 10);
			System.out.print(arr[i] + "\t");
		}

		// 求数组元素的最大值
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值为：" + maxValue);

		// 求数组元素的最小值
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值为：" + minValue);
		
		//求数组元素的总和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("总和为：" + sum);
		
		//求数组元素的平均值
		double avgValue = sum / arr.length;
		System.out.println("平均值为：" + avgValue);

		/*
		 * //自写 
         * int maxValue = arr[0];//避免数组中元素含有负数，使用arr[0]初始化 
		 * int minValue =arr[0]; 
		 * int sum = 0; 
		 * for(int i = 0;i < arr.length;i++){ 
		 * 		arr[i] =(int)(Math.random() * 90 + 10); 
		 * 		System.out.print(arr[i] + "\t"); 
		 * 		if(i > 0){ 
		 * 			// maxValue = arr[i]; 
		 * 			// minValue = arr[i]; 
		 * 		//}else{ 
		 * 			int temp1 = maxValue; 
		 * 			int temp2 = minValue; 
		 * 			maxValue = (arr[i] > temp1) ? arr[i] : temp1; 
		 * 			minValue = (arr[i] < temp2) ? arr[i] : temp2; 
		 * 		} 
		 * 		sum += arr[i]; 
		 * } 
		 * System.out.println(); 
		 * System.out.println("最大值为：" + maxValue); 
		 * System.out.println("最小值为：" + minValue);
		 * System.out.println("总和为：" + sum); 
		 * System.out.println("平均值为：" + (double)sum / arr.length);
		 */
	}
}
```
## ③ 数组的复制、反转、查找(线性查找、二分法查找)
```java
public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		
		//1.数组的复制(区别于数组变量的赋值：arr1 = arr)
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr.length;i++){
			arr1[i] = arr[i];
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		
		//2.数组的反转
//		String temp;
//		//方法一：
//		for(int i = 0;i < arr.length/2;i++){
//			temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		}
//		//方法二：
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
//		//遍历
//		for(int i = 0;i < arr.length;i++){
//			System.out.print(arr[i] + "\t");
//		}
		
		//3.数组的查找
		//线性查找
		String dest = "BB";
		boolean isFlag = true;
		for(int i = 0;i < arr.length;i++){
			if(dest.equals(arr[i])){
				System.out.println("找到了指定的元素，位置为：" + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag){
			System.out.println("没有找到指定元素");
		}
		
		//二分法查找
		//前提：所要查找的数组必须有序
		int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		
		int dest1 = -34;
		int head = 0;//初始的首索引
		int end = arr2.length - 1;//初始的末索引
		isFlag = true;
		while(head <= end){
			int middle = (head + end)/2;
			
			if(dest1 == arr2[middle]){
				System.out.println("找到了指定的元素，位置为：" + middle);
				isFlag = false;
				break;
			}else if(arr2[middle] > dest1){
				end = middle - 1;
			}else{
				head = middle + 1;
			}
		}
		if(isFlag){
			System.out.println("没有找到指定元素");
		}		
	}
}
```
## ④数组元素的排序算法
### 冒泡排序
```java
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
		
		//冒泡排序
		for(int i = 0;i < arr.length -1;i++){
			for(int j = 0;j < arr.length - 1 - i;j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
				
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i] + "\t");
		}		
	}
}
```
### 快速排序（暂时无需详细了解）
```java
/**
 * 快速排序
 * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 * 则分别对这两部分继续进行排序，直到整个序列有序。
 */
public class QuickSort {
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			int base = data[start];
			int low = start;
			int high = end + 1;
			while (true) {
				while (low < end && data[++low] - base <= 0)
					;
				while (high > start && data[--high] - base >= 0)
					;
				if (low < high) {
					swap(data, low, high);
				} else {
					break;
				}
			}
			swap(data, start, high);
			
			subSort(data, start, high - 1);//递归调用
			subSort(data, high + 1, end);
		}
	}
	public static void quickSort(int[] data){
		subSort(data,0,data.length-1);
	}
	
	
	public static void main(String[] args) {
		int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
		System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
	}
}
```
# 3.5 Arrays工具类的使用
```java
public class ArraysTest {
	public static void main(String[] args) {
		//1.boolean equals(int[] a,int[] b) :判断两个数组是否相等。
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
		boolean isEquals = Arrays.equals(arr1,arr2);
		System.out.println(isEquals);
		
		//2.String toString(int[] a) : 输出数组信息。
		System.out.println(Arrays.toString(arr1));
				
		//3.void fill(int[] a,int val) : 将指定值填充到数组之中。
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		//4.void sort(int[] a) : 对数组进行排序。
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//5.int binarySearch(int[] a,int key) : 对排序后的数组进行二分法检索指定的值。
		int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int index = Arrays.binarySearch(arr3, 211);
		if(index >= 0){
			System.out.println(index);
		}else{
			System.out.println("未找到");
		}		
	}
}
```
# 3.6 数组使用中的常见异常
```java
/*
 * 数组中的常见异常：
 * 1.数组角标越界的异常：ArrayIndexOutOfBoundsException
 * 
 * 2.空指针异常：NullPointerException
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
		
		//1.数组角标越界的异常：ArrayIndexOutOfBoundsException
		int[] arr = new int[]{1,2,3,4,5};
		
//		for(int i = 0;i <= arr.length;i++){
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[-2]);
		
		//2.空指针异常：NullPointerException
		//情况一：
//		int[] arr1 = new int[]{1,2,3};
//		arr1 = null;
//		System.out.println(arr1[0]);
		
		//情况二：
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0]);
//		System.out.println(arr2[0][0]);
		
		//情况三：
		String[] arr3 = new String[]{"AA","BB","CC"};
		arr3[0] = null;
		System.out.println(arr3[0].toString());
		
	}
}
```
