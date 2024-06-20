package bai11.trienkhaiqueue;

public class CircularQueue {
    private Node front, rear;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }
    public int deQueue() {
        if (front == null)
            return Integer.MIN_VALUE;

        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        return data;
    }
}
