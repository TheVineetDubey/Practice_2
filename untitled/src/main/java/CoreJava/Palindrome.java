package CoreJava;

public class Palindrome {
    public static void main(String[] args) {


        String s = "Madamqa";
        String rev = "";
        String s1 = s.toLowerCase();
        System.out.println("orignal " + s1);


            for (int i = 0; i < s.length(); i++) {
                rev = s.charAt(i) + rev;
            }
            System.out.println("reversed " + rev);




                if (s.equals(rev)) {

                    System.out.println("Palindrome");
                } else {
                    System.out.println("not Palindrome ");
                }

            }
        }
