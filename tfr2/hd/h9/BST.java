import edu.princeton.cs.algs4.*;

public class BST<Key extends Comparable<Key>,Value> {

    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left, right;
        private int N;
        private double x,y;//coordinates

        public Node (Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }

    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        // return value associated with key in subtree rooted at x
        // return null if key not present in subtree rooted at x
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.val;
        }
    }

    public void put(Key key, Value val) {
        // search for key, update value if found, grow table if new
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        // change key's value to val if key is in subtree rooted at x
        // else, add new node to subtree associating key with val
        if (x == null) return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.val = val;
        }

        x.N = size(x.left) + size(x.right)+1;
        return x;
    }

    public Key min() {
        return min(root).key;
    }

    private Node min(Node x) {
        if (x.left == null) return x;
        return min(x.left);
    }

    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) return null;
        return x.key;
    }

    private Node floor(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.left, key); 

        Node t = floor(x.right, key);
        if (t != null) return t;
        else return x;
    }

    public void setCoords(Node n, double x, double y) {
        // var ad lenda i collision thar til eg baetti inn + n.N 
        if (n == null) return;
        setCoords(n.right, x+(3+n.N), y-(3+n.N));
        n.x = x;
        n.y = y;
        setCoords(n.left, x-(3+n.N), y-(3+n.N));
    }

    public void drawNode (Node n) {
        if (n == null) return;
        StdDraw.setPenColor(StdDraw.BLUE);
        drawNode(n.right);
        StdDraw.filledCircle(n.x, n.y, 2);
        drawNode(n.left);
    }
    public void drawLines(Node n) {
        if (n == null) return;
        StdDraw.setPenColor(StdDraw.BLUE);
        drawLines(n.right);
        if (n.right != null)
            StdDraw.line(n.x, n.y, n.right.x, n.right.y);
        if (n.left != null)
            StdDraw.line(n.x, n.y, n.left.x, n.left.y);
        drawLines(n.left);
    }
    public void drawText(Node n) {
        if (n == null) return;
        StdDraw.setPenColor(StdDraw.YELLOW);
        drawText(n.right);
        StdDraw.text(n.x, n.y, (n.key).toString());
        drawText(n.left);
    }
    public void draw() {
        StdDraw.setScale(0,100);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);

        setCoords(root, 50, 90);
        drawNode(root);
        drawLines(root);
        drawText(root);
    }

    public static void main(String[] args) {
        String s = "BINARYSECH";
        char[] charArray = s.toCharArray();
        Character[] c = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            c[i] = charArray[i];
        }
        BST<Character,Integer> bst = new BST<Character,Integer>(); 
        for (int i = 0; i < c.length; i++) {
            bst.put(c[i],i);
        }
        for (int i = 0; i < c.length; i++) {
            StdOut.printf("%d %c\n",bst.get(c[i]),c[i]);
        }
        StdOut.println(bst.size());
        bst.draw();

    }
}

