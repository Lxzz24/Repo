package javase.test.c;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000

        //加法运算
        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 12345678902469135780

        //把 BigInteger 转换成 long 型
        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue()); // 123456789000
//        System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range

        //如果 BigInteger 的值甚至超过了 float 的最大范围（3.4x10^{38}），那么返回的 float 是什么呢？
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);//Infinity

    }
}
