public class DepositTransaction  extends BaseTransaction{
    /**
     * Applies a deposit transaction to a bank account
     * @param ba is the bank account to apply the deposit transaction to
     * @param depositAmount is the amount to deposit to the bank account
     * requires: ba and depositAmount cannot be null
     * modifies: ba which is the bank account data
     */
    public void apply(BankAccount ba,double depositAmount) {
        ba.addAmount(depositAmount);
    }
}
