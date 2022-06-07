package Java.test.two;

public class OverloadTest {
    public static void main(String[] args) {
//        String s = "Test string";
//        int n1 = s.indexOf('t');
//        int n2 = s.indexOf("st");
//        int n3 = s.indexOf("st", 4);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);

        PersonC ming = new PersonC();
        PersonC hong = new PersonC();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
class PersonC {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }
}