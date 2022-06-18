package javase.test.c;

public class IntegerTest {
    public static void main(String[] args){

        //包装类型可以直接使用，并不需要自己定义
        int i1 = 100;
        // 通过 new 操作符创建 integer 实例 (不推荐使用, 会有编译警告):
//        Integer n1 = new Integer(i1);
        // 通过静态方法 valueOf(int) 创建 Integer 实例:
        Integer n2 = Integer.valueOf(i1);
        // 通过静态方法 valueOf(String) 创建 Integer 实例:
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3.intValue());


        //Auto Boxing
        //`int` 和 `Integer` 可以互相转换：
        int i2 = 100;
        Integer n4 = Integer.valueOf(i2);
        int x1 = n4.intValue();


        //Java 编译器可以帮助我们自动在 `int` 和 `Integer` 之间转型：
        Integer n5 = 100; // 编译器自动使用 Integer.valueOf(int)
        int x2 = n5; // 编译器自动使用 Integer.intValue()


        //自动拆箱执行时可能会报 NullPointerException：
//        Integer n6 = null;
//        int i3 = n6;


        // == or equals?
        Integer xx = 127;
        Integer yy = 127;
        Integer mm = 99999;
        Integer nn = 99999;
        System.out.println("xx == yy:" + (xx == yy)); // true
        System.out.println("mm == nn:" + (mm == nn)); // false
        System.out.println("x.equals(y):" + xx.equals(yy)); // true
        System.out.println("m.equals(n):" + mm.equals(nn)); // true


        //把整数格式化为指定进制的字符串：
        System.out.println(Integer.toString(100)); // "100", 表示为 10 进制
        System.out.println(Integer.toString(100, 36)); // "2s", 表示为 36 进制
        System.out.println(Integer.toHexString(100)); // "64", 表示为 16 进制
        System.out.println(Integer.toOctalString(100)); // "144", 表示为 8 进制
        System.out.println(Integer.toBinaryString(100)); // "1100100", 表示为 2 进制


        //包装类型还定义了一些有用的静态变量
        // boolean 只有两个值 true/false，其包装类型只需要引用 Boolean 提供的静态字段:
        Boolean tt = Boolean.TRUE;
        Boolean ff = Boolean.FALSE;
        // int 可表示的最大 / 最小值:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        // long 类型占用的 bit 和 byte 数量:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)


        // 向上转型为 Number:
//        Number num = new Integer(999);
        // 获取 byte, int, long, float, double:
//        byte b = num.byteValue();
//        int n = num.intValue();
//        long ln = num.longValue();
//        float f = num.floatValue();
//        double d = num.doubleValue();


        //Byte
        byte x = -1;
        byte y = 127;
        System.out.println(Byte.toUnsignedInt(x)); // 255
        System.out.println(Byte.toUnsignedInt(y)); // 127

    }
}