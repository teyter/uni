public class Insult {
    public static void main(String[] args) {
        String[] x = {"lazy", "stupid", "insecure", "idiotic", "slimy", "slutty", "smelly","pompous", "communist", "dicknose", "pie-eating", "racist", "elitist", "white-trash", "drug-loving", "butteface", "tone-deaf", "ugly"};
        String[] y = {"douche", "ass", "turd", "rectum", "butt", "cock", "shit", "crotch", "bitch", "turd", "prick", "slut", "taint", "fuck", "dick", "boner", "shart", "nut", "sphincter"};
        String[] z = {"pilot", "canoe", "captain", "pirate", "hammer", "knob", "box", "jockey", "nazi", "waffle", "goblin", "blossum", "biscuit", "clown", "socket", "monster", "hound", "dragon", "balloon"};
        int i = (int)(Math.random()*x.length);
        int j = (int)(Math.random()*x.length);
        int k = (int)(Math.random()*x.length);
        System.out.println("fucking " + x[i] + " " + y[j] + " " + z[k]);
    }
}
