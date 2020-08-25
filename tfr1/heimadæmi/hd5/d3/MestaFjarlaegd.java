public class MestaFjarlaegd {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] birdy = new int[N];
        int tala = 0;
        int fjarlaegd = 0;

        for (int i = 0; i < N; i++) {
           birdy[i] = ((int)(Math.random()*11)-5); // Slembi -5 til 5
        }
        int saetiFjarlaegd = 0;
       for (int i = 0; i < N; i++) {
           if (i < birdy.length - 1) { // Setja kommur a milli
            System.out.print(birdy[i] + ", ");
           } else {
               System.out.println(birdy[i]); // Engin komma aftast
                }
            } for (int i = 0; i < birdy.length; i++) { // Finna eins tolur
                for (int j = 0; j < birdy.length; j++) {
                    if (j != i) { 
                        if (birdy[i] == birdy[j]) {
                            int fjarlaegdNu = Math.abs(i - j); 
                            if (fjarlaegdNu > fjarlaegd) {
                                fjarlaegd = Math.abs(i - j);
                                saetiFjarlaegd = birdy[i];
                            }
                        }
                    }
                }
            } if (fjarlaegd == 0) {
                System.out.println("Mesta fjarlægðin er engin því það eru engin pör");
            } else { 
            System.out.println("Mesta fjarlægðin er: " + fjarlaegd + 
                " fyrir gildið " + saetiFjarlaegd);
            }
       }
    }
            
                 
        

