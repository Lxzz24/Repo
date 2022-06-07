package Java.test.two;

public class PersonATest {
    public static void main(String[] args) {
        PersonA ming = new PersonA();
        ming.setName("小明");
        System.out.println(ming.getName());
        ming.setAge(12);
        System.out.println(ming.getAge());
    }
}
class PersonA {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}