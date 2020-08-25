public class switchdub {
    public static void main(String[] args) {
        double time = Double.parseDouble(args[0]);
        switch (time) {
            case 0.0: case 0.1: case 0.2: case 0.3: case 0.4: case 0.5: case 0.6:
                System.out.println("nott"); break;
            default:
                System.out.println("ass106"); break;
        }
    }
}

