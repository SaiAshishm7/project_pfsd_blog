class Animal{
    void sound(){
        System.out.println("The animal makes a sound.");
    }
}
class Dog_1 extends Animal{
    void sound(){
        System.out.println("The dog barks.");
    }
}
public class animal2 {
    public static void main(String[] args) {
        Dog_1 dog = new Dog_1();
        dog.sound();
    }
}
