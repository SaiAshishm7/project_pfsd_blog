import java.util.Scanner;

public class tryout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your student");
        String name = sc.nextLine();
        System.out.println("Enter the age of your student");
        int age = sc.nextInt();
        System.out.println(age + name);
    }
}
