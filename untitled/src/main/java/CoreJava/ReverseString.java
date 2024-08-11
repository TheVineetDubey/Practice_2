package CoreJava;

public class ReverseString {
    public static void main(String[] args) {
<<<<<<< HEAD
        String str="Learn and Grow with Automation";
=======
        String str=" Learn and Grow with Automation";
>>>>>>> origin/main
        String rev="";
        String expected="noitamotua htiw worg dna nrael";
        str=str.toLowerCase();

<<<<<<< HEAD
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
=======
        for (int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
>>>>>>> origin/main

        }
        System.out.println(rev);

        if(rev.equals(expected)) {
            System.out.println("Correct");
        }
        else {
            System.out.println("not correct");
        }
    }
}
