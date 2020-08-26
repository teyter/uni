    private static String trip(Comparable[][] nofn) {
        String samaNafn = null;
        mergesort(nofn);
        int x = 0; int y = 0; int z = 0;
        int fjoldi = nofn[0].length;
        boolean[] bool = new boolean[3];
        while (x < fjoldi && y < fjoldi && z < fjoldi) {
            if (nofn[0][x].equals(nofn[1][y]) && nofn[1][y].equals(nofn[2][z])) {
                samaNafn = nofn[0][x].toString();
                break;
            } else {
                for(int i = 0; i < bool.length; i++)
                    bool[i] = false;
                if (nofn[0][x].compareTo(nofn[1][y]) < 0)
                    bool[0] = true;
                else if (nofn[0][x].compareTo(nofn[2][z]) < 0)
                    bool[0] = true;
                if (nofn[1][y].compareTo(nofn[0][x]) < 0)
                    bool[1] = true;
                else if (nofn[1][y].compareTo(nofn[2][z]) < 0)
                    bool[1] = true;
                if (nofn[2][z].compareTo(nofn[0][x]) < 0)
                    bool[2] = true;
                else if (nofn[2][z].compareTo(nofn[1][y]) < 0) {
                    bool[2] = true;
                if (bool[0])
                    x++;
                if (bool[1])
                    y++;
                if (bool[2])
                    z++;
            }
        }
    }
}
