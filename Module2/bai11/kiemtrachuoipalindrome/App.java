package bai11.kiemtrachuoipalindrome;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        ArrayList<Integer> queue = new ArrayList<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(2);
        stack.add(1);
        queue.addAll(stack);
        System.out.println(stack);
        System.out.println(queue);
        int j = 0;
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i).equals(stack.get(j))) {
                System.out.println("true");
            }
            j++;
        }
    }
}
