package String;

public class RevString {
    public static void main(String[] args) {

        String s = "madam1";
        String rev = "";

        System.out.println("orignal " + s);
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;

        }
        System.out.println("reverse " + rev);

        if (s.equals(rev))
            System.out.println("pal");
        else
            System.out.println("not pal");
    }
    }





