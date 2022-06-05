package Java.test.one;

//方式二：
public class RectangleTest1 {
    public static void main(String[] args) {
        int n = 7;
        int[][] arr = new int[n][n];

        int count = 0; // 要显示的数据
        int maxX = n - 1; // X 轴的最大下标
        int maxY = n - 1; // Y 轴的最大下标
        int minX = 0; // X 轴的最小下标
        int minY = 0; // Y 轴的最小下标

        while (minX <= maxX) {
            for (int x = minX; x <= maxX; x++) {
                arr[minY][x] = ++count;
            }
            minY++;
            for (int y = minY; y <= maxY; y++) {
                arr[y][maxX] = ++count;
            }
            maxX--;
            for (int x = maxX; x >= minX; x--) {
                arr[maxY][x] = ++count;
            }
            maxY--;
            for (int y = maxY; y >= minY; y--) {
                arr[y][minX] = ++count;
            }
            minX++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String space = (arr[i][j] + "").length() == 1 ? "0" : "";
                System.out.print(space + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
