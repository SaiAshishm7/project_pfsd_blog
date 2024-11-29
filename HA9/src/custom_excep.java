class AIDSexception extends Exception {
    public AIDSexception(String s) {
        super(s);
    }
}
public class custom_excep {
    public static void main(String[] args) {
        try{
            System.out.println("Starting the print block");

            int i=10;
            int j=2;

            int result=i/j;
            System.out.println("Result is: "+ result);

            throw new AIDSexception("This is my custom exception");
        }
        catch(AIDSexception e) {
            System.out.println(e.getMessage());
        }
    }
}
