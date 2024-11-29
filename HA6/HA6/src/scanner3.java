import java.util.Scanner;
public class scanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Double value: ");
        Double value = input.nextDouble();
        System.out.print("Using nextDouble() : " + value);
        input.close();
    }

}