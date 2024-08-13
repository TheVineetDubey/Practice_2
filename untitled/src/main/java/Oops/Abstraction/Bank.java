package Oops.Abstraction;

abstract class Bank {
     abstract double interestrate();
    }
class SBI extends  Bank{
    double interestrate(){
        return 5.0;
    }
}

class HDFC extends  Bank{
    double interestrate(){
        return 6.5;
    }
}