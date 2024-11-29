class Animal{
     private String name;

     Animal(String name){
         this.name = name;
     }
     void eat(){
         System.out.println(name + " is eating");
     }
}

public class main1{
    public static void main(String[] args){
        Animal animal = new Animal("Dog");
        animal.eat();
    }
}
