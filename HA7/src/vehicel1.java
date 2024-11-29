class Animal_2{
    void sound(){
        System.out.println("The animal makes a sound.");
    }
}
class Dog_2 extends Animal_2{
    void sound(){
        super.sound();
        System.out.println("Dog barks.");
    }
}
class Cat_2 extends Animal_2{
    void sound(){
        super.sound();
        System.out.println("Cat meow.");
    }
}
public class vehicel1 {
    public static void main(String[] args) {
        Animal_2 myAnimal;
        myAnimal = new Dog_2();
        myAnimal.sound();

        myAnimal = new Cat_2();
        myAnimal.sound();
    }
}