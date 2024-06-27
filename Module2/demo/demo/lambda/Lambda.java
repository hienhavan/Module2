package demo.demo.lambda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("John1", 14));
        listPerson.add(new Person("Peter", 15));
        listPerson.add(new Person("John2", 33));
        listPerson.add(new Person("Tom", 21));
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Person.getListPerson().sort(comparator);
        System.out.println(Person.getListPerson());
        Comparator<Person> comparator2 = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Person.getListPerson().sort(comparator2);
        System.out.println(Person.getListPerson());
//        listPerson.sort((person1, person2) -> person1.getAge() - person2.getAge());
//        System.out.println(listPerson);
        try {
            FileOutputStream OIS =new FileOutputStream("iotext.txt");
            byte[] data = new byte[23];
        }catch (Exception e){}
    }
}
