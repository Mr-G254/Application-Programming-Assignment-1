public class WithdrawalTransaction extends BaseTransaction{
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

    public boolean reverse(){
        return true;
    }
}
