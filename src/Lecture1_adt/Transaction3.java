package Lecture1_adt;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

/**
 * There is still Exposure seen in Transaction2 I that if we make next payment the date of first payment is also altered
 * This Class Transaction3:Adds Code to correct this exposure:
 * Intentional review of any methods that receive produces (returns)
 *              If produces interface of a method deals with objects or any reference types,
 *              there is need to perform defensive copying to enhance Invariant preservation
 */
public class Transaction3 {
    /**
     * stores the amount involved in the transaction
     */
    private final int amount;

    /**
     * stores the date of the transaction
     */
    private final Calendar date;

    /**
     * Constructor that initializes the transaction
     * @param amount is the amount involved in the transaction
     * @param date is the date when the transaction took place
     * requires: amount and date cannot be null
     */
    public Transaction3(int amount, @NotNull Calendar date) {
        this.amount = amount;
        this.date = date;
    }

    /**
     * Gets the amount involved in the transaction
     * @return the amount involved in the transaction
     */
    public int getAmount() {
        return amount; // Because we are dealing with Value types we need not worry about what we return
    }

    /**
     * Gets the date when the transaction took place
     * @return the date when the transaction took place
     */
    public Calendar getDate() {
//        return date;    // Because we are dealing with Reference types we need to judiciously copy what our getters return
        return (Calendar) date.clone(); // Defensive copying or Judicious Copying
    }
}
