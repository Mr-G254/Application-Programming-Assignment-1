public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialAmount){
        balance = initialAmount;
    }

    void addAmount(double amount){
        balance = balance + amount;
    }

    void reduceAmount(double amount){
        balance = balance - amount;
    }

    double getBalance(){
        return balance;
    }
}
