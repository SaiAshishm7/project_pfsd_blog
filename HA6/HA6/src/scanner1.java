import java.util.Scanner;
public class scanner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.print("Name : " + name);
        input.close();
    }

}