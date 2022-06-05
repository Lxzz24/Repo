package Java.test.one;

public class SumTest {
    public static void main(String[] args) {
        int n = 100;

        // TODO: sum = 1 + 2 + ... + n
        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);//5050
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
}
