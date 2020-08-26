import edu.princeton.cs.algs4.*;

public class Degrees {
   public Degrees(Digraph G) {
       int n;
   }
   /**
    * Returns indegree of v
    * @param v
    */
   public int indegree(int v, Digraph d) {
       return d.indegree(v);
   }

   public int outdegree(int v) {
       return 2;
   }

   //public Iterable<Integer> source() {
   //}
   // 
   //public Iterable<Integer> sink() {
   //}

   boolean isMap() {
       return false;
   }
   public static void main(String[] args) {
       In in = new In(args[0]);
       Digraph k = new Digraph(in);
       Degrees d = new Degrees(k);
       int s = d.indegree(6,k);
       StdOut.println(s);
   }
}
