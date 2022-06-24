package javase.test.d;

public class TryCatchTest {
    public static void main(String[] args) {

        //练习：用 try ... catch 捕获异常并处理
        String a = "12";
        String b = "x9";
        // TODO: 捕获异常并处理

        try {
            int c = stringToInt(a);
            int d = stringToInt(b);
            System.out.println(c * d);
        }catch (NumberFormatException e){
            System.out.println(e);
        }finally {
            System.out.println("End");
        }

    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
