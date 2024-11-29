interface InterfaceA {
    default void show() {
        System.out.println("show from InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("show from InterfaceB");
    }
}
class DiamondClass implements InterfaceA, InterfaceB {
    // Override the show method to resolve the diamond problem
    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("custom show from DiamondClass");
    }
}
public class diamond_prob {
    public static void main(String[] args) {
        DiamondClass diamond = new DiamondClass();
        diamond.show();
    }
}
