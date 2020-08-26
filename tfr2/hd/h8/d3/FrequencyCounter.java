import edu.princeton.cs.algs4.*;

public class FrequencyCounter {

    private static final int efraMark = 1000;

    public static void main(String[] args) {
        new FrequencyCounter().doExperiment();
    }
    public static int[] generateArray(int length, int efraMark) {
        int[] array = new int[length];

        for(int i = 0; i < length; i++) {
            array[i] = StdRandom.uniform(efraMark);
        }
        return array;
    }

    private void doExperiment() {
        int[] fylkjaStaerdir = {10, 100, 1000, 10000, 100000, 1000000};

        for(int i = 0; i < fylkjaStaerdir.length; i++) {
            int[] randomArray = generateArray(fylkjaStaerdir[i], efraMark);
            int distinctKeys = frequencyCounter(randomArray);

            StdOut.println("Fjöldi af distinct keys meðal " + fylkjaStaerdir[i] + " random heildtalna minni en "
            + efraMark + ": " + distinctKeys);
        }
    }

    private int frequencyCounter(int[] integers) {

        BinarySearchST<Integer, Integer> binarySearchST = new BinarySearchST<>();

        for(int integer : integers) {
            if (!binarySearchST.contains(integer)) {
                binarySearchST.put(integer, 1);
            } else {
                binarySearchST.put(integer, binarySearchST.get(integer) + 1);
            }
        }

        return binarySearchST.size();
    }

}
