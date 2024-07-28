package Array;

public class Copy {
    public static void main(String[] args) {

        int[]a={1,2,3,4,5,6};
        int[]b=java.util.Arrays.copyOf(a,a.length-1);
        System.out.println(java.util.Arrays.toString(b));
    }
}
