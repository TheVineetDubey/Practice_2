package Integer;

public class rEVERSE {
    public static void main(String[] args) {

        int num=123456;
        int rev=0;
        int temp=0;
        while (num>0){
            temp=num%10;
            num=num/10;
            rev=rev*10+temp;

        }
        System.out.println(rev);
    }
}
