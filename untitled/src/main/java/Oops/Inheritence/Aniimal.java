package Oops.Inheritence;


class Animal {
    void sound(){
        System.out.println("sound");
    }
}

class Dog extends  Animal{

    void sound(){
        System.out.println("bark");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}

