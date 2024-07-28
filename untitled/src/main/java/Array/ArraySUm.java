package Array;

public class ArraySUm {
    public static void main(String[] args) {
        int a []={4,5,6,55,2,1};
        int sum=0;

        for (int i =0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }

}
