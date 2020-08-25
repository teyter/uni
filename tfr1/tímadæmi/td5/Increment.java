public class Increment {
    public static void main(String[] args) {
        int blaz[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            blaz[i] = Integer.parseInt(args[i]) + 1;
        }
        System.out.print("[");
        for (int i = 0; i < blaz.length; i++) {
            if (i < blaz.length - 1) {
                System.out.print(blaz[i] + ", ");
                } else { 
                    System.out.println(blaz[i] + "]");
            }
        }
    }
}

