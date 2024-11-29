import java.util.Scanner;
public class scanner5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int data1 = input.nextInt();
        int data2 = input.nextInt();
        System.out.println("First Number : " + data1);
        System.out.println("Second Number : " + data2);
        input.close();
    }
}