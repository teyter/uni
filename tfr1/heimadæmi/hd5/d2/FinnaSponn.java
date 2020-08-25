public class FinnaSponn {
    public static void main(String[] args) {
        int pizza[] = new int[args.length];
        for (int i = 0; i < args.length; i++) 
            pizza[i] = Integer.parseInt(args[i]);
        int max = pizza[0];
        int min = pizza[0];
        for (int i = 0; i < pizza.length; i++) {
            if (pizza[i] > max) {
                max = pizza[i];
            }
        }
        for (int i = 0; i < pizza.length; i++) {
            if (pizza[i] < min) { 
                min = pizza[i];
            }
        }
        System.out.println("Hæsta gildið er: " + max);
        System.out.println("Lægsta gildið er: " + min);
        System.out.println("Spönnin er: " + (max - min));
    }
}
