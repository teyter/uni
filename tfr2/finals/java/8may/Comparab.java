public int compareTo(Item that) {
    if ( this > that ) return 1;
    if ( this < that ) return -1;
    return 0; // if equal
}
