class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class Bankacc {
    private double  balance;
    public Bankacc(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient balance, current balance is :"+ balance);
        }
        balance -= amount;
        System.out.println("Withdraw amount :"+ amount);
    }
    public static void main(String[] args){
        Bankacc bankacc = new Bankacc(100);
        try{
            bankacc.withdraw(500);
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
