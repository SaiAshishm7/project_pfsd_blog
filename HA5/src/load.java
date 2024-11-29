class OverloadDemo2 {
    void test() {
        System.out.println("No Parameters");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}

public class load {
    public static void main(String[] args) {
        OverloadDemo2 obj = new OverloadDemo2();
        int i = 88;

        obj.test();             // No parameters
        obj.test(10, 20);       // Two integer parameters
        obj.test(i);            // Single integer parameter
        obj.test(123.2);        // Single double parameter
    }
}
