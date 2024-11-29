class OuterClass {
    private String message = "hello from outer class";

    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }
}

public class non_static {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
