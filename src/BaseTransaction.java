import java.util.Calendar;

public abstract class BaseTransaction implements TransactionInterface{
    /**
    * Gets the calendar date
    * @return date
    */
    public Calendar getDate() {
        return null;
    }

    /**
     * Gets the unique identifier which is the ID
     * @return transaction ID
     */
    public String getTransactionID() {
        return null;
    }

    /**
     * Gets the amount
     * @return amount
     */
    public double getAmount() {
        return 0;
    }

    /**
     * Prints the transaction details
     */
    public void printTransactionDetails(){

    }

    /**
     * Apply a transaction to a bank account
     * @param ba which is the bank account to apply the transaction to
     * requires: ba cannot be null
     * modifies: changes the balance in the bank account
     */
    public void apply(BankAccount ba){

    }

}
