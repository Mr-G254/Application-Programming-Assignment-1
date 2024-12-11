package Lecture1_adt;

import java.util.Calendar;

/**
 * This Lecture1_adt.TransactionInterface Class violates several ADT design principles:
 * 1. Representation Independence: --- Changes in representation of the data may require external code to alter access
 * 2. Preservation of Invariants: --- Any external client code can alter the internal values
 */
public class Transaction1 {
    /**
     * stores the amount used in the transaction
     */
    public int amount;

    /**
     * stores the date of the transaction
     */
    public Calendar date;

    /**
     * Constructor that initializes the transaction
     * @param amount is the amount involved in the transaction
     * @param date is the date when the transaction took place
     * requires: amount and date cannot be null
     */
    public Transaction1(int amount, Calendar date) {
        this.amount = amount;
        this.date = (Calendar) date.clone();
    }
}
