package Oops.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Account acc= new Account("123456789 ","Tokyo ",100000000.000);

        acc.displayaccountdetails();
        acc.setBalance(200);
        acc.displayaccountdetails();
    }
}
