package javase.test.a;

public class ForTest {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };

        //练习1 倒序输出
        for (int i=4; i>=0; i--) {
            System.out.printf("ns[%d]: %d\t", i , ns[i]);
        }

        System.out.println();

        //练习2 for each 数组求和
        int sum = 0;
        for (int n : ns){
            sum += n;
        }
        System.out.printf("Sum: %d", sum);

        System.out.println();

        //练习3 圆周率

        double pi = 0;
        int times = 0;
        for (int i=1; i<1000000; i+=2) {
            // TODO
            times ++;
            if(times%2 == 1){
                pi += 1.0 / i;
            }else{
                pi -= 1.0 / i;
            }
            System.out.println("times:" + times + ", pi:" + pi);
        }
        pi = 4 * pi;
        System.out.println(pi);
    }
}
