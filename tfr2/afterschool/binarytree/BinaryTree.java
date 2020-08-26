import edu.princeton.cs.algs4.StdOut;

public class BinaryTree {
    public Node root;

    private static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void insert(int data) {
        Node temp = new Node(data);
        if (isEmpty()) root = temp;
        else {
            Node x = root;
            while (x != null) {
                if (data < x.data && x.left == null) {
                    x.left = temp;
                    return;
                }
                if (data < x.data && x.left != null) {
                    x = x.left;
                }
                if (data > x.data && x.right == null) {
                    x.right = temp;
                    return;
                }
                if (data > x.data && x.right != null) {
                    x = x.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] a = { 5, 3, 8, 1, 2, 6, 4, 9, 7};
        for (int i = 0; i < a.length; i++)
            bt.insert( a[i] );
    }
}
