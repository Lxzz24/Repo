package Java.test.two;

public class PersonBTest {
    public static void main(String[] args) {
        PersonB ming = new PersonB();
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

class PersonB {
    private String name;
    private int age;

    public PersonB() {
    }

    public PersonB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonB(String name) {
        this(name, 18);
    }

    public PersonB(int age) {
        this("Unnamed", age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}