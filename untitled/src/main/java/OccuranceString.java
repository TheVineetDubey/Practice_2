public class OccuranceString {
    public static void main(String[] args) {
        String s="Java is Pathetic";
       int total= s.length();
        int totalmin =s.replace("a","").length();
        int count=0;

        count= total-totalmin;
        System.out.println(count);
        //for(int i=0;i<s.length();i++){

        }
    }

