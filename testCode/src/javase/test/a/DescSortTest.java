package javase.test.a;

import java.util.Arrays;

public class DescSortTest {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };

        // 排序前:
        System.out.println("排序前：" + Arrays.toString(ns));

        // TODO:
        for (int i=0; i<ns.length-1; i++) {
            for (int j=0; j<ns.length-i-1; j++) {
                if (ns[j] < ns[j+1]) {
                    //交换ns[j]和ns[j+1]
                    int temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        }

        // 排序后:
        System.out.println("排序后：" + Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
