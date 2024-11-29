import java.util.Scanner;
public class scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int data = input.nextInt();
        System.out.println("Using nextInt() : " + data);
        input.close();
    }
}