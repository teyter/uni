public class Bankareikningur {
    double innistaeda;
    int fjoldiFaersla;

    // smidur
    public Bankareikningur() {
        innistaeda = 0.0;
        fjoldiFaersla = 0;
    }
    // adferdin skilaInnst
    double skilaInnist() {
        return innistaeda;
    }
    // adferdin leggjaInn
    void leggjaInn(double upph) {
        innistaeda += upph;
        fjoldiFaersla++;
    }
    // adferdin takaUt
    boolean takaUt(double upph) {
        if (innistaeda >= upph) {
            innistaeda -= upph;
            return true;
        } return false;
    }
    // faerslugjold
    void faerslugjold() {
        if (fjoldiFaersla > 5)
            innistaeda = Math.max(innistaeda - 10*(fjoldiFaersla-5), 0.0);
        fjoldiFaersla = 0;
    } 
    // main fall
    public static void main(String[] args) {
        Bankareikningur r = new Bankareikningur();

        System.out.println("Leggja inn kr. 100");
        r.leggjaInn(100);

        System.out.println("Reyna ad taka ut kr. 120");
        if (r.takaUt(120))
            System.out.println("Tokst");
        else
            System.out.println("Tokst ekki");

        System.out.println("Leggja 10 sinnum inn kr. 10");
    }
}
