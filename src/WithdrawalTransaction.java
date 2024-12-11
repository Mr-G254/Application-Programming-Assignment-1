public class WithdrawalTransaction extends BaseTransaction{
    /**
     * Applies a withdrawal transaction to a bank account
     * @param ba is the bank account to apply the deposit transaction to
     * @param withdrawalAmount is the amount to withdraw from the bank account
     * requires: ba and withdrawalAmount cannot be null
     * modifies: ba which is the bank account data
     */
    public void apply(BankAccount ba,double withdrawalAmount) {
        boolean successfulTransaction = false;
        double balance = ba.getBalance();

        try {
            if(balance > 0 && balance >= withdrawalAmount){
                balance = balance - withdrawalAmount;
                successfulTransaction = true;
            }else{
                throw  new InsufficientFundsException();
            }

        }catch (InsufficientFundsException e){
            throw new RuntimeException(e);

        }finally {
            if(successfulTransaction){
                System.out.println("The transaction was successful");
            }else{
                System.out.println("The transaction has failed");
            }
        }
    }
}
