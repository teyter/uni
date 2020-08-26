public class Nnode {

    String data;
    Nnode link;

    public static void main(String[] args) {
        Nnode first = new Nnode();
        Nnode second = new Nnode();
        Nnode last = new Nnode();

        first.data = "to";
        second.data = "be";
        last.data = "or";

        first.link = second;
        second.link = last;

        for (Nnode x = first; x != null; x = x.link)
            System.out.println(x.data);

        // remove last node
        second.link = null;

        System.out.println();
        for (Nnode x = first; x != null; x = x.link)
            System.out.println(x.data);
    }
}
