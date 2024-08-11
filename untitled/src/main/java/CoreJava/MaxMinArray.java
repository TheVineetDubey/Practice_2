package CoreJava;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] a = {20, 45, 10, -16, 0, 21, 65, 89, 40, 14, 18, 46};
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max=a[i];

            }
            else if  (a[i] < min) {
                min=a[i];

            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
