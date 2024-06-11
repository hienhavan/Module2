package demo.CAUTRUCDULIEU;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> stackList = new LinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        // peek stack
        int aa = stack.peek();
        System.out.println(aa);
        list.add(stack.peek());
        //pop stack
        stack.pop();
        list.add(stack.peek());
        stack.pop();
        list.add(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(list);
        //isEmpty
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        //Linklist
        stackList.addAll(list);
        System.out.println(stackList);
        //peekLast
        int a = stackList.peekLast();
        System.out.println(a);
    }
}
