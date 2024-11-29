public class DepositTransaction  extends BaseTransaction{
    public void apply(BankAccount ba,double depositAmount) {
        ba.addAmount(depositAmount);
    }
}
