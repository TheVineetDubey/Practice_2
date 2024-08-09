package String;

public class Occurance {
    public static void main(String[] args) {

        String s = "vineet is";
        char[] ss=s.toCharArray();
                for (int i =0;i< ss.length;i++){
                    int count =0;
                   for (int j=0;j<ss.length;j++){
                       if(j<i&&(ss[j]==ss[i])) {
                           break;
                       }
                       if(ss[i]==ss[j]) {
                           count++;
                       }
                    }
                   if(count>0){
                       System.out.println(ss[i]+"  is times "+count);
                   }
                }


        }
    }



