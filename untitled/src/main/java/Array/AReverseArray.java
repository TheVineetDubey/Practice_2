package Array;

public class AReverseArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 5, 6, 8, 9, 3, 4, 5};
        int temp = 0;
        int last = a.length - 1;
        int start = 0;


        while (last > start) {

            temp=a[start];
            a[start]=a[last];
            a[last]=temp;
            start++;
            last--;

        }

        System.out.println(java.util.Arrays.toString(a));
    }
}
