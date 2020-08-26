import edu.princeton.cs.algs4.Queue;
 
public class MergeQueue {
    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> newQ = new Queue<Integer>();
 
        int i = q1.dequeue();
        int j = q2.dequeue();
       
        while (!q1.isEmpty() || !q2.isEmpty()) {
            if (q1.size() == 0 && q2.size() != 0) {
                newQ.enqueue(j);
                j = q2.dequeue();
            } else if (!q2.isEmpty() && q1.isEmpty()) {
                newQ.enqueue(i);
                i = q1.dequeue();
            } else if (i > j) {
                newQ.enqueue(j);
                j = q2.dequeue();
            } else {
                newQ.enqueue(i);
                i = q1.dequeue();
            }
        }
        return newQ;
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<Integer>();
        Queue<Integer> q2 = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q1.enqueue(i);
            q2.enqueue(i*9);
        }
        Queue<Integer> q3 = merge(q1,q2);
        while (q3.size() != 0) {
            System.out.println(q3.dequeue());
        }
 
 
    }
}
