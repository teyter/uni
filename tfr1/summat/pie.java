public class pie {
    public static void main(String[] args) {
        StdOut.print("PI according to System.out.print: ");
        System.out.println(Math.PI);
        StdOut.printf("%16.5f\n", Math.PI);
        StdOut.printf("%f, %3d\n", 234.567, 4664);
        StdOut.printf("PI is approx. %.2f.\n", Math.PI);
    }
}
