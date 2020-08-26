import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.List;

public class Daemi6 {

    private class Tilraun {

        int fjoldi;
        int por;

        public Tilraun(int fjoldi, int por) {
            this.fjoldi = fjoldi;
            this.por = por;
        }
    }

    public static void main(String[] args) {
        new Daemi6().geraTilraun();
    }

    private void geraTilraun() {
        List<Tilraun> tilraunir = new ArrayList<>();

        int fjoldi = 16;

        for(int i = 0; i < 10; i++) {
            int porTil = count(fjoldi, false);

            Tilraun experiment = new Tilraun(fjoldi, porTil);
            tilraunir.add(experiment);

            fjoldi *= 2;
        }

    }
    private static int count(int fjoldi, boolean oskar) {
        int tengingar = 0;

        UnionFind unionFind = new UnionFind(fjoldi);

        while(unionFind.count() != 1) {

            int stradi = StdRandom.uniform(fjoldi);
            int viktor = StdRandom.uniform(fjoldi);

            tengingar++;

            if (oskar) {
                StdOut.println("Tengingar: " + stradi + " - " + viktor);
            }

            if (!unionFind.connected(stradi, viktor)) {
                unionFind.union(stradi, viktor);
            }
        }
        return tengingar;
    }
}
