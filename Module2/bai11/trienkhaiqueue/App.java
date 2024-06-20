package bai11.trienkhaiqueue;

public class App {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.enQueue(40);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}

