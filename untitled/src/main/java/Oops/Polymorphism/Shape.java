package Oops.Polymorphism;

class Shape {
    double area(){
        return 0;
    }
}
class Rectangle extends Shape{
    double length,width;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    double area(){
        return  length*width;
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    double area(){
        return 3.14* radius*radius;
    }
}