public class throwexample {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{
            if(b==0){
                throw new ArithmeticException("cannot divide by zero");
            }
            int res = a/b;
            System.out.println("result: " + res);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
