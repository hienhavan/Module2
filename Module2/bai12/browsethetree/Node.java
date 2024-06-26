package bai12.browsethetree;

public class Node {
    public Object element;
    public Node left;
    public Node right;
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
