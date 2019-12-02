package Java;

public class ROT13 {
    private char[] upperRot13Array = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    private char[] lowerRot13Array = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
    private int delta;


    public ROT13(Character a, Character n) {

    }

    public ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {


        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        int delta = c.compareTo(s.charAt(0));
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {  // here we are determining how many letters to rotate in an alphabet, not the value of the character.
            if (i + delta < s.length()) {
                sb = sb.append(s.charAt(i + delta));    // here we are changing the value of the value of the character that we are rotating.
            } else {
                sb = sb.append(s.charAt((i + delta - s.length())));
            }
    }
        return sb.toString();
}

    public static boolean isUpperCase(char a) {
        return Character.isUpperCase(a);
    }


}
