package bai10.arraylist1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        myList.add(4,5);
        myList.add(5,6);
        myList.add(6,7);
        myList.add(7,8);
        myList.add(8,9);
        myList.add(9,10);
        System.out.println(Arrays.toString(myList.display()));
        myList.remove(2);
//        myList.remove(3);
        System.out.println(Arrays.toString(myList.display()));
    }
}
