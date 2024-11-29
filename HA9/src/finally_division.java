public class finally_division {
    public static void main(String[] args) {
        int num1= 10;
        int num2 = 0;
        int result= 0;

        try{
            result = num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("error: Division by zero");
        }finally{
            System.out.println("Division attempt completed");
        }

        System.out.println("Result" + result);
    }
}
