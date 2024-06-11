package demo.CAUTRUCDULIEU;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    // Các phương thức khác như tìm kiếm, xóa, duyệt cây, vv.
}
