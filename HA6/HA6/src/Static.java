public class Static {
    static int a = 4;
    static int b;

    static void math(int x){
        System.out.println("X: " + x);
        System.out.println("a: "+ a);
        System.out.println("b:" + b);
    }
    static{
        System.out.println("Static block");
        b = a*4;
    }
    public static void main(String[] args) {
        math(52);
    }
}
