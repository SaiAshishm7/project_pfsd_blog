public class throw2 {
    public static void main(String[] args) {

        int age =12;
        try{
            checkage(age);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkage(int age){
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("valid age: "+age);
    }
}
