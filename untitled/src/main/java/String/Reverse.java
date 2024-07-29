package String;

public class Reverse {
    public static void main(String[] args) {
        int n = 151;
        int reverse = 0;

        System.out.println("entered number is " + n);

        while (n != 0)
        {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("String.Reverse of entered number is " + reverse);

        if (n == reverse)
            System.out.println("palindorme");
        else
            System.out.println("no");
    }
}
