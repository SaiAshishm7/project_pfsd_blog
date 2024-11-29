class OverloadDemo {
    void test() {
        System.out.println("No Parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class overload1 {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        double result;

        obj.test();             // No parameters
        obj.test(10);           // Single integer parameter
        obj.test(10, 20);       // Two integer parameters
        result = obj.test(123.25); // Single double parameter
        System.out.println("Result of obj.test(123.25): " + result);
    }
}
