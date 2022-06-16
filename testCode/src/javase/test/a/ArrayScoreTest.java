package javase.test.a;

public class ArrayScoreTest {
    public static void main(String[] args) {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        int sum = 0;
        for (int[] arr : scores){
            for (int n : arr){
                sum += n;
            }
        }
        average = sum * 1.0 / 3 / 5 ;

        System.out.println(average);

        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
