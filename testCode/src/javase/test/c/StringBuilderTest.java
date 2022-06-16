package javase.test.c;

public class StringBuilderTest {
    public static void main(String[] args){

        //1
        String s1 = "";
        for (int i = 0; i < 1000; i++) {
            s1 = s1 + "," + i;
        }
        System.out.println(s1);//,0,1,2,3,4,5,6,7,8,9,...,999

        //2
        StringBuilder sb1 = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb1.append(',');
            sb1.append(i);
        }
        String s2 = sb1.toString();
        System.out.println(s2);

        //3.链式操作
        var sb2 = new StringBuilder(1024);
        sb2.append("Mr")
                .append("Bob")
                .append("!")
                .insert(0, "Hello,");
        System.out.println(sb2.toString());


        //4.一个可以不断增加的计数器
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(adder.value());


        //练习：请使用 `StringBuilder` 构造一个 `INSERT` 语句：
        String[] fields = { "name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ")
                .append(table + " (")
                .append(String.join(", ",fields))
                .append(") VALUES (?, ?, ?)");
        return sb.toString();
    }
}

class Adder {
    private int sum = 0;

    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum ++;
        return this;
    }

    public int value() {
        return sum;
    }
}
