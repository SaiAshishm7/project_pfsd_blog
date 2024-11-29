public class finally_mult {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int num1=10;
        int num2=0;

        try{
            System.out.println(num[3]);
            System.out.println(num1/num2);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        finally{
            System.out.println("multiple catch blocks");
        }
    }
}
