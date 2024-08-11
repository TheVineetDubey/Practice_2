package CoreJava;

public class Palindrome {
    public static void main(String[] args) {

        String s= "Madamqa";
        String rev="";
        String s1=s.toLowerCase();
        System.out.println("orignal "+ s1);

        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);

        }
        System.out.println("reversed "+rev);

        if (s1.equals(rev)) {
            System.out.println("Palindrome");
        }
        else{
                System.out.println("not Palindrome ");
            }

        }
    }

