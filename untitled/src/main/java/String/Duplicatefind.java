package String;

public class Duplicatefind {
    public static void main(String[] args) {
        String s ="Mmeantime";
        int len=s.length();
        char[] ch=s.toCharArray();


        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(ch[i]==ch[j]){
                    System.out.println("Repeated  " + ch[i]);

                    break;


                }
            }
        }

    }
}
