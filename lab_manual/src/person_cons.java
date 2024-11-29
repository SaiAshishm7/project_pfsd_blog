class Person {
    String name;
    int age;
    String address;
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Not provided";
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not provided";
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
public class person_cons {
    public static void main(String[] args) {
        Person person1 = new Person("Samantha");
        Person person2 = new Person("Rohit Sharma", 30);
        Person person3 = new Person("Surya Bhai", 25, "123 Main St");
        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
        System.out.println();
        person3.displayInfo();
    }
}