public class Aha {
    public static int aha(int a, int b) {
        if (a < b) return 0;
        return 1 + aha(a - b, b);
    }
    public static void main(String[] args) {
        System.out.println(aha(7, 2));
    }
}

//7 < 2 false
//    1 + (5, 2)
//5 < 2 false
//    1 + (3, 2)
//3 < 2 false
//    1 + (1, 2)
//1 < 2 true
//    return 0
