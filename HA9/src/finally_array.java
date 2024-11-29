public class finally_array {
    public static void main(String[] args) {
        int[] numb = {1,2,3};
        try {
            System.out.println(numb[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bounds");
        }
        finally{
            System.out.println("array operation completed");
        }
    }
}
