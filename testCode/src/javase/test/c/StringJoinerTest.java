package javase.test.c;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args){

        // Hello Bob, Alice, Grace!
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello");
        for (String name : names) {
            sb.append(" " + name).append(",");
        }
        System.out.println(sb.toString());

        // 注意去掉最后的 ",":
        sb.delete(sb.length() - 1, sb.length());
        sb.append("!");
        System.out.println(sb.toString());

        //引入StringJoiner
        var sj1 = new StringJoiner(", ");
        for (String name : names) {
            sj1.add(name);
        }
        System.out.println(sj1.toString());

        //加上开头和结尾
        var sj2 = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj2.add(name);
        }
        System.out.println(sj2.toString());

        //join()
        var sj3 = String.join(", ", names);
        System.out.println(sj3.toString());

        //test：请使用 StringJoiner 构造一个 SELECT 语句：
        String[] fields = { "name", "position", "salary"};
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");

    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        var sj = new StringJoiner(", ", "SELECT " , " FROM " + table);
        for (String field : fields){
            sj.add(field);
        }
        return sj.toString();
    }
}
