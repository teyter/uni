public class ifday {
    public static void main(String[] args) {
        
        int time = Integer.parseInt(args[0]);
        if ( time >= 0 && time < 6) 
            System.out.println("nott");
        else if  (time >= 6 && time < 12) 
            System.out.println("morgunn");
        else if (time >= 12 && time < 19)
            System.out.println("dagur");
        else if (time >= 19 && time <= 24)
            System.out.println("kvold");
        else 
            System.out.println("fokk off");
     
    }
}
