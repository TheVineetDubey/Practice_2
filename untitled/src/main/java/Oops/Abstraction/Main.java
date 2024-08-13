package Oops.Abstraction;

public class Main {
    public static void main(String[] args) {

        Bank sbi =new SBI();
        Bank hdfc = new HDFC();

        System.out.println("sbi"+sbi.interestrate()+"%");
        System.out.println("hdfc"+hdfc.interestrate()+"%");
    }
}
