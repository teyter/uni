public class JadenCase {
    public static String toJadenCase(String phrase) {
        if((phrase == null) || (phrase.equals("")))
            return null;
        char[] charArray = phrase.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 2; i < charArray.length; i++)
            if (charArray[i-1] == ' ')
                charArray[i] = Character.toUpperCase(charArray[i]);
        String str = new String(charArray);
        return str;
    }
    public static void main(String[] args) {
        String phrase = "i want this uppercased now";
        StdOut.println(toJadenCase(phrase));
    }
}

