package Java.test.C;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringTest1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);

//        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println();


        //是否包含子串:
        System.out.println("是否包含子串:");
        System.out.println("Hello".contains("ll")); // true
        System.out.println();


        //搜索子串的更多的例子：
        System.out.println("搜索子串的更多的例子：");
        System.out.println("Hello".indexOf("l")); // 2
        System.out.println("Hello".lastIndexOf("l")); // 3
        System.out.println("Hello".startsWith("He")); // true
        System.out.println("Hello".endsWith("lo")); // true
        System.out.println();


        //提取子串的例子:
        System.out.println("提取子串的例子:");
        System.out.println("Hello".substring(2)); // "llo"
        System.out.println("Hello".substring(2, 4)); //"ll"
        System.out.println();


        //移除字符串首尾空白字符：
        System.out.println("移除字符串首尾空白字符：");
        System.out.println("\tHello\r\n".trim()); // "Hello"

        System.out.println("\u3000Hello\u3000".strip()); // "Hello"
        System.out.println("Hello".stripLeading()); // "Hello"
        System.out.println("Hello".stripTrailing()); // "Hello"
        System.out.println();


        //判断字符串是否为空和空白字符串：
        System.out.println("判断字符串是否为空和空白字符串：");
        System.out.println("".isEmpty()); // true，因为字符串长度为 0
        System.out.println(" ".isEmpty()); // false，因为字符串长度不为 0
        System.out.println("\n".isBlank()); // true，因为只包含空白字符
        System.out.println("Hello".isBlank()); // false，因为包含非空白字符
        System.out.println();

        //替换子串
        System.out.println("替换子串:");
        String s3 = "hello";
        System.out.println(s3.replace('l', 'w')); // "hewwo"，所有字符'l'被替换为'w'
        System.out.println(s3.replace("ll", "~~")); // "he~~o"，所有子串 "ll" 被替换为 "~~"

        String s4 = "A,,B;C ,D";
        System.out.println(s4.replaceAll("[\\,\\;\\s]+", ",")); // "A,B,C,D"
        System.out.println();


        //分割字符串
        System.out.println("分割字符串:");
        String s5 = "A,B,C,D";
        String[] ss = s5.split("\\,"); // {"A", "B", "C", "D"}
        System.out.println(Arrays.toString(ss));
        System.out.println();


        //拼接字符串
        System.out.println("拼接字符串:");
        String[] arr = {"A", "B", "C"};
        String s6 = String.join("***", arr); // "A***B***C"
        System.out.println(s6);
        System.out.println();


        //格式化字符串
        System.out.println("格式化字符串:");
        String s7 = "Hi %s, your score is %d!";
        System.out.println(s7.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
        System.out.println();

        //类型转换
        System.out.println("类型转换:");

        System.out.println(String.valueOf(123)); // "123"
        System.out.println(String.valueOf(45.67)); // "45.67"
        System.out.println(String.valueOf(true)); // "true"
        System.out.println(String.valueOf(new Object())); // 类似java.lang.Object@636be97c
        System.out.println();

        System.out.println("把字符串转换为int类型：");
        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        System.out.println(n1);
        System.out.println(n2);
        System.out.println();


        System.out.println("把字符串转换为boolean类型：");
        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();


        System.out.println("getInteger(String)：");
        System.out.println(Integer.getInteger("java.version")); // 版本号，11
        System.out.println();

        //转换为 char[]

        //互相转换
        char[] cs1 = "Hello".toCharArray(); //String -> char[]
        String s8 = new String(cs1); // char[] -> String
        System.out.println(s8);
        System.out.println();


        //如果修改了 `char[]` 数组， `String` 并不会改变：
        char[] cs2 = "Hello".toCharArray();
        String s9 = new String(cs2);
        System.out.println(s9);
        cs2[0] = 'X';
        System.out.println(s9);
        System.out.println();


        //设计了一个 `Score` 类保存一组学生的成绩：
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s10 = new Score(scores);
        s10.printScores();
        scores[2] = 99;
        s10.printScores();
        System.out.println();


        //字符编码
        byte[] b01 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b02 = "Hello".getBytes("UTF-8"); // 按 UTF-8 编码转换
        byte[] b03 = "Hello".getBytes("GBK"); // 按 GBK 编码转换
        byte[] b04 = "Hello".getBytes(StandardCharsets.UTF_8); // 按 UTF-8 编码转换

        System.out.println(b01);
        System.out.println(b02);
        System.out.println(b03);
        System.out.println(b04);
        System.out.println();


        String s11 = new String(b01, "GBK"); // 按 GBK 转换
        String s12 = new String(b01, StandardCharsets.UTF_8); // 按 UTF-8 转换
        System.out.println(s11);
        System.out.println(s12);

    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
