import java.util.Scanner;
public class scanner4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();
        System.out.print("Name : " + name);
        input.close();
    }

}