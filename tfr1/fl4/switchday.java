public class switchday {
    public static void main(String[] args) {
        int time = Integer.parseInt(args[0]);
        switch (time) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println("nott"); break;
            default:
                System.out.println("ass106"); break;
        }
    }
}

