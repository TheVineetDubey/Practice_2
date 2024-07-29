package Array;

public class MOve0 {
    public static void main(String[] args) {
        int[] a = {5, 6, 0, 4, 6, 0, 9, 0, 8};
        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];
            }
        }
        while (count < n) {
            a[count++] = 0;
        }
        System.out.println(java.util.Arrays.toString(a));
    }
}