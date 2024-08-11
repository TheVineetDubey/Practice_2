package CoreJava;

public class Palindrome {
    public static void main(String[] args) {

        String s= "Madam";
        String rev="";

        System.out.println("orignal "+ s);

        for(int i =0;i<s.length();i++){
            rev=s.charAt(i)+rev;

        }
        System.out.println("reversed "+rev);

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        }
        else{
                System.out.println("not Palindrome ");
            }

        }
    }

