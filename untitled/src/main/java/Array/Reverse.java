package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] a={1,2,3,44,5,6,77,7};

        int start=0;
        int last=a.length-1;
        int temp;

        while(start<last)
        {
            temp=a[start];
            a[start]=a[last];
            a[last]=temp;
            start++;
            last--;
        }

        System.out.println(java.util.Arrays.toString(a));
    }
}
