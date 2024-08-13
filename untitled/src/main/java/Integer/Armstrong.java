package Integer;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = 0;
        int arm = 0;

        while (num > 0) {
            temp = num % 10;
            num = num / 10;
            arm = temp * temp * temp + arm;
        }
        System.out.println(arm);
        if (num == arm) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not");
        }
    }
}
