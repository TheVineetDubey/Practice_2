package Integer;

public class SumofDigit {
    public static void main(String[] args) {
        int num=1234;
        int temp=0;
        int sum =0;
        while (num>0){
            temp=num%10;
            num=num/10;
            sum=temp+sum;


        }
        System.out.println(sum);
    }
}
