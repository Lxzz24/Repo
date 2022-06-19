package javase.test.c;

import java.beans.*;

public class JavaBeanTest {
    public static void main(String[] args) throws Exception {
        //枚举一个 JavaBean 的所有属性
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println(" " + pd.getReadMethod());
            System.out.println(" " + pd.getWriteMethod());
        }
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 只读属性:
    public boolean isChild() {
        return age <= 6;
    }
}