package Java.test.two;

public class StaticTest {
    public static void main(String[] args) {
        PersonE ming = new PersonE("Xiao Ming", 12);
        PersonE hong = new PersonE("Xiao Hong", 15);

        System.out.println(PersonE.getCount());
    }
}

class PersonE {
    public String name;
    public int age;

    public static int count;

    public PersonE(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public static int getCount() {
        return count;
    }
}