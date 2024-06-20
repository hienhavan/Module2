package bai11.kiemtradaungoac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        ArrayList<String> stack = new ArrayList<>();
        stack.add("S");
        stack.add("*");
        stack.add("(");
        stack.add("(");
        stack.add("2b");
        stack.add("+");
        stack.add("2a");
        stack.add(")");
        int openParentheses = 0;
        int count = 0;
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i).equals(")")) {
                openParentheses++;
            } else if (stack.get(i).equals("(")) {
                if (openParentheses == 0) {
                    System.out.println("fail");
                    count++;
                    break;
                } else if (openParentheses > 0) {
                    openParentheses--;
                }
            }
        }
        if (openParentheses == 0 && count == 0) System.out.println("pass");
        else if (count == 0) System.out.println("fail");
    }
}

