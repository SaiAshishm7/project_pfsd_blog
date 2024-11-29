public class age {
    public static void main(String[] args) {
        int age = 5;
        if(age < 18){
            throw new IllegalArgumentException("Age must be at least 18");
        }
    }
}
