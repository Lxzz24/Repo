package Java.test.A;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi = scanner.nextDouble();

        if (bmi <= 0){
            return;
        }else if (bmi < 18.5) {
            System.out.println("BMI: 过轻");
        }else if (bmi <= 25) {
            System.out.println("BMI: 正常");
        }else if (bmi <= 28) {
            System.out.println("BMI: 过重");
        }else if (bmi <= 32) {
            System.out.println("BMI: 肥胖");
        }else{
            System.out.println("BMI: 非常肥胖");
        }
    }
}
