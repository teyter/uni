public class TolfraediPor {
    public static void main(String[] args) {
        int N = args.length;
        int[] k = new int[N/2];
        double[] x = new double[N/2];
        int counter = 0;
        
        double heildarSumma = 0;
        int heildarFjoldi = 0;
        double haestaGildi = 0;

        for (int i = 0; i < N/2; i++) {
            k[i] = Integer.parseInt(args[counter]);
            x[i] = Double.parseDouble(args[counter+1]);
            counter += 2;
            System.out.print(k[i] + " " + x[i] + " "); // prentar porin
            double summa = (k[i] * x[i]);
            if (summa > haestaGildi) {
                haestaGildi = summa;
            }
            heildarSumma += summa;
            heildarFjoldi += k[i];
        } System.out.println(); 
        System.out.println(heildarSumma);
        System.out.println(heildarFjoldi);
        System.out.println(heildarSumma/heildarFjoldi);
        System.out.println(haestaGildi);
    }
}
