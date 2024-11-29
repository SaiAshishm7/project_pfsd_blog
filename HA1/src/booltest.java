public class booltest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is : "+b);
        b = true;
        System.out.println("b is : "+b);

        if (b) System.out.println("b is executed");
        b = false;
        if (b) System.out.println("b is not  executed");
    }
}
