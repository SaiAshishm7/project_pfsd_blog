class overloadDemo2 {
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
public class overload {
    public static void main(String[] args) {
        overloadDemo2 obj = new overloadDemo2();
        int i = 88;
        obj.test();
        obj.test(10, 20);
        obj.test(i);
        obj.test(123.2);
    }
}
