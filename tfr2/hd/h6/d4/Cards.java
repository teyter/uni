public class Card implements Comparable<Card> {
    private final String suit;
    private final int rank;

    public Card(String s, int r) {
        suit = s;
        if (suit.equals("Hjarta")) {
            r += 13;
        } else if (suit.equals("Tígull")) {
            r += 26;
        } else if (suit.equals("Lauf")) {
            r += 39;
        }
        rank = r;
    }

    public String suit() {
        return suit;
    }
    public int rank() {
        if (rank > 13 && rank < 27) {
            return rank - 13;
        } else if (rank > 26 && rank < 40) {
            return rank - 26;
        } else if (rank > 39) {
            return rank - 39;
        } else {
            return rank;
        }
    } 

    public int compareTo(Card that) {
        if (this.rank > that.rank) return +1;
        if (this.rank < that.rank) return -1;
        return 0;
    }

    public static void main(String [] args) {
        Card hjarta3 = new Card("Hjarta", 3);
        Card spadi12 = new Card("Spadi", 12);

        System.out.println(spadi12.compareTo(hjarta3));
        System.out.println(hjarta3.rank());
    }
}
