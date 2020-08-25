public class Teningar {
    public static int kastaTening() {
        return (int)(Math.random() * 6) + 1;
	}

    public static int kastaGodumTening() {
	double a[] = {0,0.05,0.125,0.125,0.125,0.125,0.45};
	return StdRandom.discrete(a);
	}

    public static void main(String []args) {
	double[] counter = new double[19];
	for (int i = 0; i < 1000; i++) {
	    int a = kastaTening() + kastaTening() + kastaTening();
	    counter[a]++;
	    }
	for (int i = 3; i < counter.length; i++) {
	    System.out.println("Talan " + i + " kom " + counter[i] + " sinnum fyrir.");
		}
	    StdDraw.setPenColor(StdDraw.RED);
	    StdDraw.setXscale(0.0, 15.0);
            StdDraw.setYscale(0.0, 200.0);
	    StdStats.plotBars(counter);
		
	}
}
