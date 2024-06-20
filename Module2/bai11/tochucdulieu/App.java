package bai11.tochucdulieu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Staff staff1 = new Staff("a", "09123", "1", 11);
        Staff staff2 = new Staff("b", "09123", "2", 16);
        Staff staff3 = new Staff("c", "09123", "2", 14);
        Staff staff4 = new Staff("d", "09123", "2", 2);
        Staff staff5 = new Staff("e", "09123", "1", 13);
        Staff staff6 = new Staff("f", "09123", "1", 23);
        Staff staff7 = new Staff("g", "09123", "2", 22);
        ArrayList<Staff> list = new ArrayList<Staff>();
        ArrayList<Staff> list2 = new ArrayList<Staff>();
        list.add(staff1);
        list.add(staff2);
        list.add(staff3);
        list.add(staff4);
        list.add(staff5);
        list.add(staff6);
        list.add(staff7);
        list.sort(Comparator.comparingInt(Staff::getDateOfBirth));
        System.out.println(list);
        for (Staff staff : list) {
            if (staff.getGender().equals("1")) {
                list2.add(staff);
            }
        }
        for (Staff staff : list) {
            if (staff.getGender().equals("2")) {
                list2.add(staff);
            }
        }
        System.out.println(list2);
    }
}
