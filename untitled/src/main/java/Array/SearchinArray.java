package Array;

public class SearchinArray {
    public static void main(String[] args) {
        int a[] = {1, 6, 9, 10, 4, 8};
        int n = 2;
        boolean fl = false;

        for (int i = 0; i < a.length; i++) {

            if (n == a[i]) {
                System.out.println("at position: " + i);
                fl = true;
                break;
            }
        }
        if (fl = false) {
            System.out.println("not found");
        }
    }

}

