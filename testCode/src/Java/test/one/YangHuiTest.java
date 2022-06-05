package Java.test.one;

public class YangHuiTest {
    public static void main(String[] args){
        //1. 声明并初始化二维数组
        int[][] yanghui = new int[10][];

        //2. 给数组的元素赋值
        for (int i=0; i<yanghui.length; i++) {
            yanghui[i] = new int[i+1];

            for (int j=0; j<yanghui[i].length; j++) {
                if (j == 0 || j == i) {
                    //2.1 给首末元素赋值
                    yanghui[i][j] = 1;
                } else if (i >= 2 && j >= 1){
                    //2.2 给每行的非首末元素赋值
                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                }
            }
        }

        //3. 遍历二维数组
        for (int i=0; i<yanghui.length; i++) {
            for (int j=0; j<yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
