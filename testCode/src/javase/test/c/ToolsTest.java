package javase.test.c;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class ToolsTest {
    public static void main(String[] args) {

        //求绝对值
        Math.abs(-100); // 100
        Math.abs(-7.8); // 7.8

        //最大最小值
        Math.max(100, 99); // 100
        Math.min(1.2, 2.3); // 1.2

        //计算 xy 次方
        Math.pow(2, 10); // 2 的 10 次方 = 1024

        //计算√x
        Math.sqrt(2); // 1.414...

        //计算 e^x 次方
        Math.exp(2); // 7.389...

        //计算以 e 为底的对数
        Math.log(4); // 1.386...

        //计算以 10 为底的对数
        Math.log10(100); // 2

        //三角函数
        Math.sin(3.14); // 0.00159...
        Math.cos(3.14); // -0.9999...
        Math.tan(3.14); // -0.0015...
        Math.asin(1.0); // 1.57079...
        Math.acos(1.0); // 0.0

        //数学常量
        double pi = Math.PI; // 3.14159...
        double e = Math.E; // 2.7182818...
        Math.sin(Math.PI / 6); // sin(π/6) = 0.5

        //生成一个随机数x，x 的范围是 0 <= x < 1
        Math.random(); // 0.53907... 每次都不一样

        //生成一个区间在 [MIN, MAX) 的随机数
        double x = Math.random(); // x 的范围是 [0,1)
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min; // y 的范围是 [10,50)
        long n = (long) y; // n 的范围是 [10,50) 的整数
        System.out.println(y);
        System.out.println(n);



        // Random
        Random r = new Random();
        r.nextInt(); // 2071575453, 每次都不一样
        r.nextInt(10); // 5, 生成一个 [0,10) 之间的 int
        r.nextLong(); // 8811649292570369305, 每次都不一样
        r.nextFloat(); // 0.54335... 生成一个 [0,1) 之间的 float
        r.nextDouble(); // 0.3716... 生成一个 [0,1) 之间的 double


        Random r1 = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(r1.nextInt(100));
        }
        // 51, 80, 41, 28, 55...


        // SecureRandom 创建安全的随机数
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException exp) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充 buffer
        System.out.println(Arrays.toString(buffer));

    }
}
