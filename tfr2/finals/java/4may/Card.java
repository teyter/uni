import edu.princeton.cs.algs4.StdOut;

public class Card /*implements Comparable<Cards>*/ {
    String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
    String[] rank = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen", "King","Ace"};

    //@Override
    //public int compareTo(Card c) {
    //    return 1;
    //}
    public static void main(String[] args) {
        Card t = new Card();
        int Suit = (int)(Math.random()*4);
        int Rank = (int)(Math.random()*13);
        StdOut.println(Rank + " " + Suit);
        StdOut.println(t.rank[Rank] + " of " + t.suit[Suit]);
    }
}
