public class promote {
    public static void main(String[] args) {
        byte b = 32;
        short s = 1024;
        char c = 'R';
        int i = 45000;
        float f = 5.67f;
        double d = .3425;
        double result = (f * b) + (i / c)  -  (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result = " + result);
    }
}