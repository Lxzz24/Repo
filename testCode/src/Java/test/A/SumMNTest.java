package Java.test.A;

import java.util.Scanner;

public class SumMNTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Start: ");
        int m = scan.nextInt();

        System.out.print("End: ");
        int n = scan.nextInt();

        int sum = 0;
        // 使用while计算M+...+N:
        /*while (m <= n) {
            sum += m;
            m ++;
        }*/

        // 使用do while计算M+...+N:
        do {
            sum += m;
            m ++;
        }while(m <= n);

        System.out.printf("Sum: %d", sum);
    }
}
