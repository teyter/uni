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

