public class InsufficientFundsException extends Exception{
    /**
     * Throws an error indicating that the funds are insufficient
     */
    public InsufficientFundsException(){
        super("Transaction error: Insufficient funds");
    }
}
