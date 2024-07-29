package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 8, 9, 7, 4, 5, 6};
        int second = a.length-1;
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
        System.out.println(java.util.Arrays.toString(a));
            System.out.println(second);
        }
    }

