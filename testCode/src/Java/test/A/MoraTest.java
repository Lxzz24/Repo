package Java.test.A;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class MoraTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please choice:");
        System.out.println(" 1: Rock");
        System.out.println(" 2: Scissors");
        System.out.println(" 3: Paper");

        // 用户输入:
        int choice = scan.nextInt();

        // 计算机随机数 1, 2, 3:
        int random = 1 + (int) (Math.random() * 3);
        System.out.println("Bot:" + random);

        switch (choice) {
            // TODO:
            case 1 :
                System.out.println(random == 1 ? "draw" : (random == 2 ? "win" : "lose"));
                break;
            case 2 :
                System.out.println(random == 2 ? "draw" : (random == 3 ? "win" : "lose"));
                break;
            case 3 :
                System.out.println(random == 3 ? "draw" : (random == 1 ? "win" : "lose"));
                break;
            default:
                System.out.println("Please input correct option!");
                break;
        }
    }
}
