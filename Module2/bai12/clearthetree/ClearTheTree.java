package bai12.clearthetree;

import bai12.clearthetree.Node2;

public class ClearTheTree {
    public static void main(String[] args) {
        Node2 root = new Node2(15);
        root.left = new Node2(12);
        root.right = new Node2(20);
        root.left.left = new Node2(10);
        root.left.right = new Node2(14);
        root.right.left = new Node2(17);
        root.right.right = new Node2(23);
        root.left.left.left = new Node2(6);
        root.left.left.right = new Node2(13);
        ClearTheTree clearingTree = new ClearTheTree();
        clearingTree.clearTheTree(root,6);
    }
    public  void  clearTheTree(Node2 node,int depth) {
        if (node == null) {
            return;
        }
        if (node.data.equals(depth)){
            node.data = null;
            System.out.println("da xoa");
        }
        clearTheTree(node.left,depth);
        System.out.println(node.data);
        clearTheTree(node.right,depth);
        System.out.println(node.data);
    }
}
