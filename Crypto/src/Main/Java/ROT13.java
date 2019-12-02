package Java;

public class ROT13 {
    private char[] upperRot13Array = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    private char[] lowerRot13Array = ("abcdefghijklmnopqrstuvwxyz").toCharArray();
    private int delta;
    private char cha;


    public ROT13(Character a, Character n) {
        this.delta = a.compareTo(n);
    }

    public ROT13() {
        this.delta = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {


        return "";
    }

    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                if (Character.isLowerCase(i)) {
                    lowCaseConverter(text.charAt(i));
                } else {
                    upCaseConverter(text.charAt(i));
                }
            }
            sb.append(cha);
        }
        return sb.toString();
    }

    public String decrypt(String text) {
        return text;
    }

    public String rotate(String s, Character c) {
        int delta = c.compareTo(s.charAt(0));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {  // here we are determining how many letters to rotate in an alphabet, not the value of the character. Rotating is different than crypting.
            if (i + delta < s.length()) {
                sb = sb.append(s.charAt(i + delta));    // here we are changing the value of the value of the character that we are rotating.
            } else {
                sb = sb.append(s.charAt((i + delta - s.length())));
            }
        }
        return sb.toString();
    }

    public  boolean isUpperCase(char a) {
        return Character.isUpperCase(a);
    }

//    public int sameCaseChecker(Character a, Character b) {
//        if ((Character.isUpperCase(a) && Character.isUpperCase(b)) ||
//                Character.isLowerCase(a) && Character.isLowerCase(b)) {
//            delta = a.compareTo(b);
//        }
//        return delta;



    public char lowCaseConverter(Character a) {
        if (Character.isLowerCase(a)) {
            if (a < 'm') {
                cha = (char) (a + delta);
            } else {
                cha = (char) (a - delta);
            }
        }
        return cha;
    }

    public char upCaseConverter(Character a) {
        if (Character.isUpperCase(a)) {
            if (a < 'M') {
                cha = (char) (a + delta);
            } else {
                cha = (char) (a - delta);
            }
        }
        return cha;
    }
}





