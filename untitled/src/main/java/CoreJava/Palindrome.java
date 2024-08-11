package CoreJava;

public class Palindrome {
    public static void main(String[] args) {

<<<<<<< HEAD
        String s= "Madamqa";
        String rev="";
        String s1=s.toLowerCase();
        System.out.println("orignal "+ s1);

        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
=======
        String s= "Madam";
        String rev="";

        System.out.println("orignal "+ s);

        for(int i =0;i<s.length();i++){
            rev=s.charAt(i)+rev;
>>>>>>> origin/main

        }
        System.out.println("reversed "+rev);

<<<<<<< HEAD
        if (s1.equals(rev)) {
=======
        if (s.equals(rev)) {
>>>>>>> origin/main
            System.out.println("Palindrome");
        }
        else{
                System.out.println("not Palindrome ");
            }

        }
    }

