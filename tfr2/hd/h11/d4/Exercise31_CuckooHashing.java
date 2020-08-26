public Value get(Key key) {
    for(int i = 0; i < 2; i++) {
        int hash = hashFunctions[i].hash(key);

        if (kVals[i][hash] != null && kVals[i][hash].key.equals(key)) {
            return kVals[i][hash].value;
        }
    }

    return null;
}

public void put(Key key, Value value) {
    if (value == null) {
        delete(key);
        return;
    }

    for(int i = 0; i < 2; i++) {
        int hash = hashFunctions[i].hash(key);

        if (kVals[i][hash] != null && kVals[i][hash].key.equals(key)) {
            kVals[i][hash].value = value;
            return;
        }
    }

    //Key does not exist, let's insert it
    //Check if the number of keys is equal or more than half of the hash table size
    if (keysSize >= size) {
        resize(size * 2);
    }

    Entry entry = new Entry(key, value);
    while (entry != null) {
        entry = tryToInsert(entry);

        if (entry != null) {
            rehash();
        }
    }

    keysSize++;
}

public void delete(Key key) {
    if (key == null) {
        throw new IllegalArgumentException("Argument to delete() cannot be null");
    }

    if (!contains(key)) {
        return;
    }

    for(int i = 0; i < 2; i++) {
        int hash = hashFunctions[i].hash(key);

        if (kVals[i][hash] != null && kVals[i][hash].key.equals(key)) {
            kVals[i][hash] = null;
            break;
        }
    }

    keysSize--;

    if (keysSize > 1 && keysSize <= size / (double) 8) {
        resize(size / 2);
    }
}
}
