package Java.test.A;

import java.util.Scanner;

public class ScorePercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("name: ");
        String name = scanner.nextLine(); // 获取输入的姓名
        System.out.print("last result: ");
        int prev = scanner.nextInt(); // 获取输入的上次考试成绩
        System.out.print("this result: ");
        int score = scanner.nextInt(); // 获取输入的本次考试成绩
        double percent = 100.0 * ( score - prev ) / prev; // 计算成绩提高的百分比
        System.out.printf("Hi, %s, your result improve %.2f%%\n", name, percent); // %.2f保留两位小数
    }
}

