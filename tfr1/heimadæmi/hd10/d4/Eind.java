public class Eind {
    public static int einvidEind(int n) {
        int eind = 0;
        int counter = 0;
    
        while (eind != n) {
            double prob = Math.random();
            if (prob < 0.5) {
                if (eind == 0) {
                    eind++;
                    counter++;
                } else {
                    eind--;
                    counter++;
                    }
                } else {
                    eind++;
                    counter++;
                }
            } return counter;
    }
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int counter10 = 0;
        int counter20 = 0;
        int counter30 = 0;
        for (int i = 0; i < T; i++) {
            counter10 += einvidEind(10);
            counter20 += einvidEind(20);
            counter30 += einvidEind(30);
        }
        System.out.println("Medaltal 10 = " + counter10 / T);
        System.out.println("Medaltal 20 = " + counter20 / T);
        System.out.println("Medaltal 30 = " + counter30 / T);
    }
}


