class Payment1{
    void processPayment(){
        System.out.println("Processing Generic Payment");
    }
}
class creditCardPayment extends Payment1{
    void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }
}
class payPalPayment extends Payment1{
    void processPayment(){
        System.out.println("Processing PayPal Payment");
    }
}
public class payment {
    public static void main(String[] args) {
        Payment1 payment ;
        payment = new creditCardPayment();
        payment.processPayment();

        payment = new payPalPayment();
        payment.processPayment();

    }
}