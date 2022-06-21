package javase.test.d;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExceptionTest {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] toGBK(String s) {
        try {
            // 用指定编码转换 String 为 byte[]:
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 如果系统不支持 GBK 编码，会捕获到 UnsupportedEncodingException:
            e.printStackTrace();// 打印异常信息
//            return s.getBytes(); // 尝试使用用默认编码
        }
        return null;

        //不捕获UnsupportedEncodingException
//        return s.getBytes("GBK");
    }
}
