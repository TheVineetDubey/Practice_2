package CoreJava;

public class ReverseString {
    public static void main(String[] args) {
        String str=" Learn and Grow with Automation";
        String rev="";
        String expected="noitamotua htiw worg dna nrael";
        str=str.toLowerCase();

        for (int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;

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
