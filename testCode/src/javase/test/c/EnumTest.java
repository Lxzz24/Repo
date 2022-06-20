package javase.test.c;

public class EnumTest {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
//        if (day == Weekday.SAT || day == Weekday.SUN) {
//            System.out.println("Work at home!");
//        } else {
//            System.out.println("Work at office!");
//        }

        if (day.dayValue == 6 || day.dayValue == 0) {
//            System.out.println("Work at home!");
            System.out.println("Today is" + day + ". Work at home!");
        } else {
//            System.out.println("Work at office!");
            System.out.println("Today is" + day + ". Work at office!");
        }



//        int day = 1;
//        if (day == Weekday.SUN) { // Compile error: bad operand types for binary operator '=='
//        }

        //引用类型比较，要始终使用 `equals()` 方法，但 `enum` 类型可以例外。
        if (day == Weekday.FRI) { // ok!
        }
        if (day.equals(Weekday.SUN)) { // ok, but more code!
        }

        //返回常量名
        String s = Weekday.SUN.name(); // "SUN"

        //返回定义的常量的顺序，从 0 开始计数
        int n = Weekday.MON.ordinal(); // 1

        //switch
        switch(day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is" + day + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is" + day + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process" + day);
        }



    }
}

//enum Weekday {
//    SUN, MON, TUE, WED, THU, FRI, SAT;
//}

enum Weekday {
//    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

//    private Weekday(int dayValue) {
//        this.dayValue = dayValue;
//    }

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}

enum Color {
    RED, GREEN, BLUE;
}