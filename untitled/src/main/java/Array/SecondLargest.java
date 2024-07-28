package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 8, 9, 7, 4, 5, 6};
        int max = 0;
        int second = 0;
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}