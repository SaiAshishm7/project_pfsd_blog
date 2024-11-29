import java.util.ArrayList;
import java.util.List;

// Superclass representing a generic Animal
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
// Subclass representing a Dog
class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age); // Calling the superclass constructor
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }

    void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Manager class to handle multiple pets
class PetManager {
    List<Animal> pets;

    PetManager() {
        pets = new ArrayList<>();
    }

    // Method to add a pet (can be any Animal or its subclass like Dog)
    void addPet(Animal pet) {
        pets.add(pet);
    }

    // Method to display details of all pets
    void displayAllPets() {
        for (Animal pet : pets) {
            pet.displayDetails();
            if (pet instanceof Dog) {
                ((Dog) pet).displayBreed(); // Casting to Dog to access breed
            }
            pet.makeSound();
            System.out.println("-------------");
        }
    }
}

// Main class to run the program
public class PolymorphismExample {
    public static void main(String[] args) {
        // Create a PetManager to manage all pets
        PetManager petManager = new PetManager();

        // Create instances of Dog and add to the PetManager
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Bella", 2, "Labrador");

        // Adding dogs to the PetManager
        petManager.addPet(dog1);
        petManager.addPet(dog2);

        // Display details of all pets
        petManager.displayAllPets();
    }
}
