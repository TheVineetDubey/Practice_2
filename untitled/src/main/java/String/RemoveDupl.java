package String;

public class RemoveDupl {
    public static void main(String[] args) {
        String s="hahahahhahaha";
        String o="";

        for (int i=0;i<s.length();i++){
            boolean check=false;

            for(int j=0;j<o.length();j++){
                if(o.charAt(j)==s.charAt(i)){
                    check=true;
                    break;

                }

            }
            if (!check){
                o=o+s.charAt(i);
            }
        }




        System.out.println(o);
    }
}
