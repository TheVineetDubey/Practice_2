package String;

public class Evenodd {
    public static void main(String[] args) {
        int a[] = {1, 6, 9, 2, 4, 8};
        System.out.println("even numbers ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even" +a[i]);
            }
                if (a[i] % 2 != 0) {
                    System.out.println( "odd"+ a[i]);
                }

            }

        }
    }


