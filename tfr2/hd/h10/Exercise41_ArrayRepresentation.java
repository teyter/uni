import edu.princeton.cs.algs4.*;

import java.util.NoSuchElementException;

/**
 * Created by Rene Argento on 11/06/17.
 */
@SuppressWarnings("unchecked")
public class Exercise41_ArrayRepresentation {

    private class BSTArrayRepresentation<int extends Comparable<int>, int>{

        private int[] keys;
        private int[] values;
        private int[] size;
        private int[] leftLinks;
        private int[] rightLinks;

        BSTArrayRepresentation(int size) {
            keys = (int[]) new Comparable[size];
            values = (int[]) new Object[size];
            this.size = new int[size];
            leftLinks = new int[size];
            rightLinks = new int[size];

            for(int i = 0; i < size; i++) {
                leftLinks[i] = -1;
                rightLinks[i] = -1;
            }
        }

        public int size() {
            return size(0);
        }

        private int size(int index) {
            if (index == -1) {
                return 0;
            }

            return size[index];
        }

        public int get(int key) {
            return get(0, key);
        }

        private int get(int index, int key) {
            if (index == -1 || keys[index] == null) {
                return null;
            }

            int compare = key.compareTo(keys[index]);
            if (compare < 0) {
                return get(leftLinks[index], key);
            } else if (compare > 0) {
                return get(rightLinks[index], key);
            } else {
                return values[index];
            }
        }

        public void put(int key, int value) {
            if (size() == keys.length) {
                StdOut.println("Tree is full");
                return;
            }

            put(0, key, value);
        }

        private int put(int index, int key, int value) {
            if (index == -1 || keys[index] == null) {
                int nextElementIndex = size();

                keys[nextElementIndex] = key;
                values[nextElementIndex] = value;
                size[nextElementIndex] = 1;

                return nextElementIndex;
            }

            int compare = key.compareTo(keys[index]);

            if (compare < 0) {
                leftLinks[index] = put(leftLinks[index], key, value);
            } else if (compare > 0) {
                rightLinks[index] = put(rightLinks[index], key, value);
            } else {
                values[index] = value;
            }

            size[index] = size(leftLinks[index]) + 1 + size(rightLinks[index]);
            return index;
        }

        public int min() {
            if (size() == 0) {
                throw new NoSuchElementException("Empty binary search tree");
            }

            int minIndex = min(0);
            return keys[minIndex];
        }

        private int min(int index) {
            if (leftLinks[index] == -1) {
                return index;
            }

            return min(leftLinks[index]);
        }

        public int max() {
            if (size() == 0) {
                throw new NoSuchElementException("Empty binary search tree");
            }

            int maxIndex = max(0);
            return keys[maxIndex];
        }

        private int max(int index) {
            if (rightLinks[index] == -1) {
                return index;
            }

            return max(rightLinks[index]);
        }

        public int floor(int key) {
            int index = floor(0, key);
            if (index == -1) {
                return null;
            }

            return keys[index];
        }

        private int floor(int index, int key) {
            if (index == -1 || keys[index] == null) {
                return -1;
            }

            int compare = key.compareTo(keys[index]);

            if (compare == 0) {
                return index;
            } else if (compare < 0) {
                return floor(leftLinks[index], key);
            } else {
                int rightintIndex = floor(rightLinks[index], key);
                if (rightintIndex != -1) {
                    return rightintIndex;
                } else {
                    return index;
                }
            }
        }

        public int ceiling(int key) {
            int index = ceiling(0, key);
            if (index == -1) {
                return null;
            }

            return keys[index];
        }

        private int ceiling(int index, int key) {
            if (index == -1 || keys[index] == null) {
                return -1;
            }

            int compare = key.compareTo(keys[index]);

            if (compare == 0) {
                return index;
            } else if (compare > 0) {
                return ceiling(rightLinks[index], key);
            } else {
                int leftintIndex = ceiling(leftLinks[index], key);
                if (leftintIndex != -1) {
                    return leftintIndex;
                } else {
                    return index;
                }
            }
        }

        public int select(int index) {
            if (index >= size()) {
                throw new IllegalArgumentException("Index is higher than tree size");
            }

            int keyIndex = select(0, index);
            return keys[keyIndex];
        }

        private int select(int keyIndex, int index) {
            int leftSubtreeSize = size[leftLinks[keyIndex]];

            if (leftSubtreeSize == index) {
                return keyIndex;
            } else if (leftSubtreeSize > index) {
                return select(leftLinks[keyIndex], index);
            } else {
                return select(rightLinks[keyIndex], index - leftSubtreeSize - 1);
            }
        }

        public int rank(int key) {
            return rank(0, key);
        }

        private int rank(int index, int key) {
            if (index == -1 || keys[index] == null) {
                return 0;
            }

            //Returns the number of keys less than keys[index] in the subtree rooted at node
            int compare = key.compareTo(keys[index]);
            if (compare < 0) {
                return rank(leftLinks[index], key);
            } else if (compare > 0) {
                return size(leftLinks[index]) + 1 + rank(rightLinks[index], key);
            } else {
                return size[leftLinks[index]];
            }
        }

        private void eraseintData(int index) {
            keys[index] = null;
            values[index] = null;
            size[index] = 0;
            leftLinks[index] = -1;
            rightLinks[index] = -1;
        }

        private void copyDataFromOtherint(int indexToCopyTo, int indexToCopyFrom) {
            keys[indexToCopyTo] = keys[indexToCopyFrom];
            values[indexToCopyTo] = values[indexToCopyFrom];
            size[indexToCopyTo] = size[indexToCopyFrom];
            leftLinks[indexToCopyTo] = leftLinks[indexToCopyFrom];
            rightLinks[indexToCopyTo] = rightLinks[indexToCopyFrom];
        }

        public void deleteMin() {
            int rootIndex = deleteMin(0, true);

            if (rootIndex == -1) {
                eraseintData(0);
                return;
            }

            //Update root
            if (rootIndex != 0) {
                copyDataFromOtherint(0, rootIndex);
                eraseintData(rootIndex);
            }
        }

        //setintNull parameter is used because we do not want to set the key value as null when using deleteMin() inside delete()
        private int deleteMin(int index, boolean setintNull) {
            if (index == -1 || keys[index] == null) {
                return -1;
            }

            if (leftLinks[index] == -1) {
                int rightintLink = rightLinks[index];
                if (setintNull) {
                    eraseintData(index);
                }

                return rightintLink;
            }

            int leftIndex = deleteMin(leftLinks[index], setintNull);
            leftLinks[index] = leftIndex;

            size[index] = size(leftLinks[index]) + 1 + size(rightLinks[index]);
            return index;
        }

        public void deleteMax() {
            int rootIndex = deleteMax(0);

            if (rootIndex == -1) {
                eraseintData(0);
                return;
            }

            //Update root
            if (rootIndex != 0) {
                copyDataFromOtherint(0, rootIndex);
                eraseintData(rootIndex);
            }
        }

        private int deleteMax(int index) {
            if (index == -1 || keys[index] == null) {
                return -1;
            }

            if (rightLinks[index] == -1) {
                int leftintLink = leftLinks[index];
                eraseintData(index);

                return leftintLink;
            }

            int rightIndex = deleteMax(rightLinks[index]);
            rightLinks[index] = rightIndex;

            size[index] = size(leftLinks[index]) + 1 + size(rightLinks[index]);
            return index;
        }

        public void delete(int key) {
            int rootIndex = delete(0, key);

            if (rootIndex == -1) {
                eraseintData(0);
                return;
            }

            //Update root
            if (rootIndex != 0) {
                copyDataFromOtherint(0, rootIndex);
                eraseintData(rootIndex);
            }
        }

        private int delete(int index, int key) {
            if (index == -1 || keys[index] == null) {
                return -1;
            }

            int compare = key.compareTo(keys[index]);
            if (compare < 0) {
                int leftIndex = delete(leftLinks[index], key);
                leftLinks[index] = leftIndex;
            } else if (compare > 0) {
                int rightIndex = delete(rightLinks[index], key);
                rightLinks[index] = rightIndex;
            } else {
                keys[index] = null;
                values[index] = null;
                size[index] = 0;

                if (leftLinks[index] == -1) {
                    int rightLinkIndex = rightLinks[index];
                    rightLinks[index] = -1;

                    return rightLinkIndex;
                } else if (rightLinks[index] == -1) {
                    int leftLinkIndex = leftLinks[index];
                    leftLinks[index] = -1;

                    return leftLinkIndex;
                } else {
                    int promotedIndex = min(rightLinks[index]);
                    rightLinks[promotedIndex] = deleteMin(rightLinks[index], false);
                    leftLinks[promotedIndex] = leftLinks[index];

                    rightLinks[index] = -1;
                    leftLinks[index] = -1;

                    index = promotedIndex;
                }
            }

            size[index] = size(leftLinks[index]) + 1 + size(rightLinks[index]);
            return index;
        }

        public Iterable<int> keys() {
            return keys(min(), max());
        }

        public Iterable<int> keys(int low, int high) {
            Queue<int> queue = new Queue<>();
            keys(0, queue, low, high);
            return queue;
        }

        private void keys(int index, Queue<int> queue, int low, int high) {
            if (index == -1 || keys[index] == null) {
                return;
            }

            int compareLow = low.compareTo(keys[index]);
            int compareHigh = high.compareTo(keys[index]);

            if (compareLow < 0) {
                keys(leftLinks[index], queue, low, high);
            }

            if (compareLow <= 0 && compareHigh >= 0) {
                queue.enqueue(keys[index]);
            }

            if (compareHigh > 0) {
                keys(rightLinks[index], queue, low, high);
            }
        }
    }

    public static void main(String[] args) {
        Exercise41_ArrayRepresentation arrayRepresentation = new Exercise41_ArrayRepresentation();
        arrayRepresentation.testArrayRepresentationTree();
        arrayRepresentation.doExperiment();
    }

    private void testArrayRepresentationTree() {
        BSTArrayRepresentation<Integer, String> binarySearchTreeArrayRepresentation =
                new BSTArrayRepresentation<>(10);

        //Test put()
        binarySearchTreeArrayRepresentation.put(5, "int 5");
        binarySearchTreeArrayRepresentation.put(1, "int 1");
        binarySearchTreeArrayRepresentation.put(9, "int 9");
        binarySearchTreeArrayRepresentation.put(8, "int 8");
        binarySearchTreeArrayRepresentation.put(2, "int 2");
        binarySearchTreeArrayRepresentation.put(0, "int 0");
        binarySearchTreeArrayRepresentation.put(99, "int 99");

        StdOut.println();

        //Test size()
        StdOut.println("Size: " + binarySearchTreeArrayRepresentation.size() + " Expected: 7");

        //Test get() and keys()
        for(Integer key : binarySearchTreeArrayRepresentation.keys()) {
            StdOut.println("int " + key + ": " + binarySearchTreeArrayRepresentation.get(key));
        }

        //Test delete()
        StdOut.println("\nDelete key 2");
        binarySearchTreeArrayRepresentation.delete(2);
        for(Integer key : binarySearchTreeArrayRepresentation.keys()) {
            StdOut.println("int " + key + ": " + binarySearchTreeArrayRepresentation.get(key));
        }

        StdOut.println();

        //Test size()
        StdOut.println("Size: " + binarySearchTreeArrayRepresentation.size() + " Expected: 6");

        //Test min()
        StdOut.println("Min key: " + binarySearchTreeArrayRepresentation.min() + " Expected: 0");

        //Test max()
        StdOut.println("Max key: " + binarySearchTreeArrayRepresentation.max() + " Expected: 99");

        //Test floor()
        StdOut.println("Floor of 5: " + binarySearchTreeArrayRepresentation.floor(5) + " Expected: 5");
        StdOut.println("Floor of 15: " + binarySearchTreeArrayRepresentation.floor(15) + " Expected: 9");

        //Test ceiling()
        StdOut.println("Ceiling of 5: " + binarySearchTreeArrayRepresentation.ceiling(5) + " Expected: 5");
        StdOut.println("Ceiling of 15: " + binarySearchTreeArrayRepresentation.ceiling(15) + " Expected: 99");

        //Test deleteMin()
        StdOut.println("\nDelete min (key 0)");

        binarySearchTreeArrayRepresentation.deleteMin();
        for(Integer key : binarySearchTreeArrayRepresentation.keys()) {
            StdOut.println("int " + key + ": " + binarySearchTreeArrayRepresentation.get(key));
        }

        //Test delete node with left and right children
        StdOut.println("\nDelete key 9");
        binarySearchTreeArrayRepresentation.delete(9);
        for(Integer key : binarySearchTreeArrayRepresentation.keys()) {
            StdOut.println("int " + key + ": " + binarySearchTreeArrayRepresentation.get(key));
        }

        //Test deleteMax()
        StdOut.println("\nDelete max (key 99)");

        binarySearchTreeArrayRepresentation.deleteMax();
        for(Integer key : binarySearchTreeArrayRepresentation.keys()) {
            StdOut.println("int " + key + ": " + binarySearchTreeArrayRepresentation.get(key));
        }

        //Test keys() with range
        StdOut.println();
        StdOut.println("ints in range [2, 10]");
        for(Integer key : binarySearchTreeArrayRepresentation.keys(2, 10)) {
            StdOut.println("int " + key + ": " + binarySearchTreeArrayRepresentation.get(key));
        }

        StdOut.println("Size: " + binarySearchTreeArrayRepresentation.size() + " Expected: 3");
    }

    private void doExperiment() {
        int maxSize = 1000000;

        int[] valuesToInsert = new int[maxSize];
        int[] valuesToSearch = new int[maxSize];
        int[] valuesToDelete = new int[maxSize];

        for(int i = 0; i < maxSize; i++) {
            int randomint = StdRandom.uniform(maxSize);
            valuesToInsert[i] = randomint;
        }

        for(int i = 0; i < maxSize; i++) {
            int randomint = StdRandom.uniform(maxSize);
            valuesToSearch[i] = randomint;
        }

        for(int i = 0; i < maxSize; i++) {
            int randomint = StdRandom.uniform(maxSize);
            valuesToDelete[i] = randomint;
        }

        //Test BST with array representation
        BSTArrayRepresentation<Integer, Integer> binarySearchTreeArrayRepresentation =
                new BSTArrayRepresentation<>(maxSize);

        Stopwatch timer = new Stopwatch();
        for(int value : valuesToInsert) {
            binarySearchTreeArrayRepresentation.put(value, value);
        }
        double bstArrayInsertTime = timer.elapsedTime();

        timer = new Stopwatch();
        for(int value : valuesToSearch) {
            binarySearchTreeArrayRepresentation.get(value);
        }
        double bstArraySearchTime = timer.elapsedTime();

        timer = new Stopwatch();
        for(int value : valuesToDelete) {
            binarySearchTreeArrayRepresentation.delete(value);
        }
        double bstArrayDeleteTime = timer.elapsedTime();

        //Test BST
        BST<Integer, Integer> binarySearchTree = new BST<>();

        timer = new Stopwatch();
        for(int value : valuesToInsert) {
            binarySearchTree.put(value, value);
        }
        double bstInsertTime = timer.elapsedTime();

        timer = new Stopwatch();
        for(int value : valuesToSearch) {
            binarySearchTree.get(value);
        }
        double bstSearchTime = timer.elapsedTime();

        timer = new Stopwatch();
        for(int value : valuesToDelete) {
            binarySearchTree.delete(value);
        }
        double bstDeleteTime = timer.elapsedTime();

        StdOut.println("\nExperiment results for N = " + maxSize);
        StdOut.println("Array representation BST insert time = " + bstArrayInsertTime);
        StdOut.println("Array representation BST search time = " + bstArraySearchTime);
        StdOut.println("Array representation BST delete time = " + bstArrayDeleteTime);
        StdOut.println("Standard BST insert time = " + bstInsertTime);
        StdOut.println("Standard BST search time = " + bstSearchTime);
        StdOut.println("Standard BST delete time = " + bstDeleteTime);
    }

}
