class Vehicle1{
    void run(){
        System.out.println("The vehicle is running");
    }
}
class Bike extends Vehicle1{
    void run(){
        super.run();
        System.out.println("The Bike is running safely");
    }
}
public class vehicle {
    public static void main(String[] args) {
        Bike MyBike1 = new Bike();
        MyBike1.run();
    }
}