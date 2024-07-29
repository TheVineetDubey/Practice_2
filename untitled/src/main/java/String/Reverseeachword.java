package String;

public class Reverseeachword
{
    public static void main(String[] args) {
        String s="fuck u java";
        String[] words=s.split(" ");

        String reverseString="";
        for(String w:words)
        {
            String reversewords="";

            for(int i=w.length()-1;i>=0;i--){

                reversewords=reversewords + w.charAt(i);
            }
            reverseString=reverseString + reversewords+" ";
        }
        System.out.println(reverseString);
    }

}
