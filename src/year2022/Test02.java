package year2022;

import sun.applet.Main;

/**
 * @create 2022-03-01 21:52
 */
public class Test02 {

    public static void main(String[] args) {

        Person A = new Person(18, "lisi");
        Person B = A;

        System.out.println(A + "\n" + B);

        A.setName("zhangsan");

        System.out.println(A + "\n" + B);

    }
}

class Person{

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

