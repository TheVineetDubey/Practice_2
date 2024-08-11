package CoreJava;

public class Calculator {
    public static void main(String[] args) {
        int function =4 ;
        double num1 = 2;
        double num2 = 3;

        double result = perform(function, num1, num2);
        System.out.println(result);
    }

    public  static double perform(int function, double x ,double y){

        switch (function){
            case 1:
                return add(x,y);
            case 2:
                return subtract(x,y);

            case 3:
                return multiply(x,y);

            case 4:
                return divison(x,y);
            default:
                System.out.println("not available");
                return 0;
        }
    }
    public static double add(double x,double y){
        return x+y;
    }
    public static double subtract(double x,double y){
        return x-y;
    }
    public static double multiply (double x,double y){
        return x*y;
    }
    public static double divison(double x,double y){
        if(y!=0) {
            return x / y;
        }
        else
            System.out.println("denominator should not be zero");
            return 0;
    }
}
