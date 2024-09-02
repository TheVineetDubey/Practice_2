package Array;

public class MOvezero {
    public static void main(String[] args) {

        int[]a={0,1,0,0,1,1,1,0,1,1,0,0};
        int count=0;
        int n=a.length;

        for (int i=0;i<a.length;i++){
            if(a[i]!=0)
            {
                a[count++]=a[i];
            }



        }
        while (count<n){
            a[count++]=0;


        }
        System.out.println(java.util.Arrays.toString(a));
    }
}
