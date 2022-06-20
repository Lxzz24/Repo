package javase.test.c;

public class RecordTest {
    public static void main(String[] args) {
        Point p = new Point(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);

        var z = Point.of();
        var p1 = Point.of(123, 456);

        System.out.println(z);
        System.out.println(p1);
    }
}

//final class Point {
//    private final int x;
//    private final int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int x() {
//        return this.x;
//    }
//
//    public int y() {
//        return this.y;
//    }
//}

record Point(int x, int y) {
    //检查逻辑
    public Point {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
    }
    public static Point of() {
        return new Point(0, 0);
    }
    public static Point of(int x, int y) {
        return new Point(x, y);
    }
}

//上面这行代码相当于以下代码
//public final class Point extends Record {
//    private final int x;
//    private final int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int x() {
//        return this.x;
//    }
//
//    public int y() {
//        return this.y;
//    }
//
//    public String toString() {
//        return String.format("Point[x=%s, y=%s]", x, y);
//    }
//
//    public boolean equals(Object o) {
//        ...
//    }
//    public int hashCode() {
//        ...
//    }
//}
