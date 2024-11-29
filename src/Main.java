public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount(500);
        WithdrawalTransaction withdraw = new WithdrawalTransaction();
        DepositTransaction deposit = new DepositTransaction();

        withdraw.apply(account,100);
    }
}
