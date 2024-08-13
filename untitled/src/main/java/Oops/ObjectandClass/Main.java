package Oops.ObjectandClass;

public class Main {
        public static void main(String[] args) {
            // Creating objects of Car
            Car car1 = new Car("Toyota", "Corolla", 2020);
            Car car2 = new Car("Honda", "Civic", 2022);

            // Displaying car details
            car1.displayDetails();
            car2.displayDetails();
        }
    }
