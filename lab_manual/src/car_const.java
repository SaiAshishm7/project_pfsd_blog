class Car {
    String make;
    String model;
    int year;
    Car(String make) {
        this.make = make;
        this.model = "Unknown";
        this.year = 0;
    }
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0;
    }
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class car_const {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford", "Mustang", 2021);
        car1.displayInfo();
        System.out.println();
        car2.displayInfo();
        System.out.println();
        car3.displayInfo();
    }
}