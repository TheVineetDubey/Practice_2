package Array;

public class ASecondHigh {
    public static void main(String[] args) {
        int[] a = {23, -16, 35, 45, 30, 10, 36, 11};
        int temp=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]< a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println(java.util.Arrays.toString(a));
            System.out.println(a[1]);
        }
    }


