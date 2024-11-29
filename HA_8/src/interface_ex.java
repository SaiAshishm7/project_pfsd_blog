interface swimmable{
    void swim();

    default void dive(){
        System.out.println("dive");
    }

    static void floatwater(){
        System.out.println("floatwater");
    }
}

class fish implements swimmable{
    public void swim(){
        System.out.println("swim");
    }
}
public class interface_ex {
    public static void main(String[] args) {
        swimmable fish = new fish();
        fish.swim();
        fish.dive();
        swimmable.floatwater();
    }
}
