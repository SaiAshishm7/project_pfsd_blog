public class comma {
    public static void main(String args[]) {
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.print("a+" + a);
            System.out.print(",b+" + b);
        }
    }
}
