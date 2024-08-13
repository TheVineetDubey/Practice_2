package Oops.Encapsulation;

 class Account {

     private String acnumber;
     private String name;
     private double balance;

     public Account(String acnumber, String name,double balance){
         this.acnumber=acnumber;
         this.name=name;
         this.balance=balance;
     }

     public String getAcnumber(){
         return acnumber;
     }
     public void setAcnumber(String acnumber){
         this.acnumber=acnumber;
     }

     public String getName(){
         return name;
     }

     public  void setName(String name){
         this.name=name;
     }

     public  double getBalance(){
         return balance;
     }

     public void setBalance(double balance){
         this.balance=balance;
     }

     public void displayaccountdetails(){
         System.out.println("accountnum   "+acnumber+"Nmae   "+name+"balance   "+balance);

     }



}
