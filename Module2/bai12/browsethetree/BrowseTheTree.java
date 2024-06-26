package bai12.browsethetree;

public class BrowseTheTree {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.left = new Node(10);
        root.left.right = new Node(14);
        root.right.left = new Node(17);
        root.right.right = new Node(23);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(13);
        BrowseTheTree browseTheTree = new BrowseTheTree();
        browseTheTree.browseTheTree(root);
    }

    public void browseTheTree(Node node) {
        if (node == null) {
            return;
        }
        browseTheTree(node.left);
        System.out.println(node.data);
        browseTheTree(node.right);
        System.out.println(node.data);
    }
}
