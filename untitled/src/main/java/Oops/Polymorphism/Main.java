package Oops.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Shape Rectangle= new Rectangle(5,5);
        Shape Circle= new Circle(3);

        System.out.println(Rectangle.area());
        System.out.println(Circle.area());
    }
}
