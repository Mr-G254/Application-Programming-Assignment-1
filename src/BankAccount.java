public class BankAccount {
    /**
     * stores the balance of the bank account and can only be accessed by members of this class
     */
    private double balance;

    /**
    * Constructor that initialize the balance variable with an initial value of zero
    */
    public BankAccount(){
        balance = 0;
    }

    /**
     * Constructor that initialize the balance variable
     * @param initialAmount which is the initial amount for the initialized Bank Account
     * requires: initialAmount cannot be null
     * modifies: initializes the balance variable by giving it a value
     */
    public BankAccount(double initialAmount){
        balance = initialAmount;
    }

    /**
     * Adds the balance
     * @param amount is the value to add to the balance
     * requires: cannot be null
     * modifies: changes the value of the balance
     */
    void addAmount(double amount){
        balance = balance + amount;
    }

    /**
     * Reduces the balance
     * @param amount is the value to minus from the balance
     * requires: cannot be null
     * modifies: changes the value of the balance
     */
    void reduceAmount(double amount){
        balance = balance - amount;
    }

    /**
     * Returns the value of the balance variable
     * @return the balance of the account
     */
    double getBalance(){
        return balance;
    }
}
