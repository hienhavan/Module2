package bai11.daonguocphantu;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Integer> countCoppy = new ArrayList<Integer>();
        count.add(1);
        count.add(2);
        count.add(3);
        count.add(4);
        System.out.println(count);
        for (int i = count.size() - 1; i >= 0; i--) {
            countCoppy.add(count.get(i));
        }
        System.out.println(countCoppy);
    }
}
