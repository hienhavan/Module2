package demo.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //    public static boolean getListPerson;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static List<Person> getListPerson() {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("John1", 14));
        listPerson.add(new Person("Peter", 15));
        listPerson.add(new Person("John2", 33));
        listPerson.add(new Person("Tom", 21));
        return listPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
