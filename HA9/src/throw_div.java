public class throw_div {
    public  void Div(int a, int b) throws ArithmeticException{
        if(a==0){
            throw new ArithmeticException("Division by zero");
        }
        int res = a/b;
        System.out.println("Result:" + res);
    }
    public static void main(String[] args) {
        throw_div obj = new throw_div();
        try{
            obj.Div(0,3);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
