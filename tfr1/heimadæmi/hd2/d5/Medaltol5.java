public class Medaltol5 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double e = Double.parseDouble(args[4]);

        double med = (a+b+c+d+e)/5;
        double geo = Math.pow(a,1.0/5)*Math.pow(b,1.0/5)*Math.pow(c,1.0/5)*
        Math.pow(d,1.0/5)*Math.pow(e,1.0/5);
        double harm = (5/((1/a)+(1/b)+(1/c)+(1/d)+(1/e)));

        System.out.println("Venjulegt meðaltal: " + med);
        System.out.println("Faldmeðaltal: " + geo);
        System.out.println("Þýtt meðaltal: " + harm);
    }
}
