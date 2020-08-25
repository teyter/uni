public class eftir {
  public static void main(String[] args) {
    int[][] a = new int[10][];
    for (int i = 0; i < 10; i++) {
        a[i] = new int[(int) (Math.random()*10)+5];
    }
    System.out.println(a);
  }
}
