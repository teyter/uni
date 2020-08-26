import java.util.Random;
// java Generate min max amount > textfile.txt
public class Generate {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int amount = Integer.parseInt(args[2]);
        Random rand = new Random();
        for (int i = 0; i < amount; i++) {
            StdOut.println((int)(rand.nextInt((max-min)+1)+min));
        }
    }
}
