public class SlembiProfun {
    // Skila N-staka fylki með slemtiheiltölum á bilinu [a, b]
    // a og b eru heiltölur með a <= b
    public static int[] slembiFylki(int N, int a, int b) {
        int[] pulsa = new int[N]; 
        int range = 0; 
        for (int i = 0; i < N; i++) {
            //if both positive || if a is negative but b is positive
            if (a > 0 && b > 0 || a < 0 && b > 0) { 
                range = (b - a) + 1;
                pulsa[i] = (int)(Math.random()*range)+a;
            } else {
                // if both are negative
                range = Math.abs(a) - Math.abs(b) + 1;
                pulsa[i] = (int)(Math.random()*range)-Math.abs(a);
            }
        } return pulsa;
    }
    public static void main(String[] args) {
        // how many numbers to show
        int x = Integer.parseInt(args[0]);
        // from [a,
        int y = Integer.parseInt(args[1]);
        // to b]
        int z = Integer.parseInt(args[2]);

        if (y > z) {
            System.out.println("Neðra mark þarf að vera lægra gildi en efra mark");
        } else {
        int [] rnd = slembiFylki(x, y, z);
        
        for (int i = 0; i < rnd.length; i++)
            System.out.print(rnd[i] + " ");
        System.out.println();
        }
    }
}

