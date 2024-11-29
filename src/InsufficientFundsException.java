public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Transaction error: Insufficient funds");
    }
}
