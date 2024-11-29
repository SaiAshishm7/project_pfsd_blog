public class except4 {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j=18/i;
        } catch (ArithmeticException e){
            j=18/1;
            System.out.println("Thats the default output");
        } catch (Exception e){
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);
    }
}
