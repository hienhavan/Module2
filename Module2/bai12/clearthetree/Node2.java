package bai12.clearthetree;

public class Node2 {
    public Object element;
    public Node2 left;
    public Node2 right;
    Node2 next;
    Object data;

    public Node2(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
