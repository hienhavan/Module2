package demo.CAUTRUCDULIEU;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
LinkedList<Integer> queueList = new LinkedList<>();
        // Enqueue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        // peek queue
        queueList.add(queue.peek());
        //poll
        queue.poll();
        queueList.add(queue.peek());
        queue.poll();
        queueList.add(queue.peek());
        queue.poll();
        queueList.add(queue.peek());
        queue.poll();
        queueList.add(queue.peek());
        queue.poll();
        System.out.println(queueList);
        System.out.println(queue);
        // isEmpty
        System.out.println(queue.isEmpty());
        // LinkList
        //lay pt dau tien
        int a = queueList.peekLast();
        System.out.println(a);
        //xoa pt dau tien
        queueList.pollFirst();
        System.out.println(queueList);
        // them vao
        queueList.addLast(2);
        System.out.println(queueList);
    }
}
