public class heildarHaekkun {
    public static int heildarHaekkun(int[] h) {
        int breyting = 0;
        for (int i = 0; i < h.length-1; i++) {
            if (h[i] < h[i+1]) {
                breyting += h[i+1] - h[i];
            }  
        } return breyting; 
    }   
    public static void main(String[] args) {
        int[] h = new int[10];
        for (int i = 0; i < h.length; i++) {
            h[i] = (int)(Math.random()*101);
            System.out.print(h[i] + " ");
        } System.out.println();
        System.out.print("Heildarhaekkun er: ");
        System.out.println(heildarHaekkun(h));
    }
}
