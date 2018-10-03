import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** checkings account.*/
        CHECKINGS,
        /** savings account.*/
        SAVINGS,
        /** student account.*/
        STUDENT,
        /** workplace account.*/
        WORKPLACE
    }
    /** Counter for number of bank accounts opened.*/
    private static int counter = 0;

    /** Account number.*/
    private int accountNumber;

    /** Account type.*/
    private BankAccountType accountType;

    /** Balance in account.*/
    private double accountBalance;

    /** Bank account owner's name.*/
    private String ownerName;

    /** Interest rate.*/
    private double interestRate;

    /** Earned interest.*/
    private double interestEarned;

    /**
     * Constructor for this class. Initializes fields of BankAccount
     * @param name owner name
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        counter++;
        ownerName = name;

    }
    /** Returns number of bank accounts opened.*/
   public static int  getCount() {
        return counter;
   }
   /**
    * Account balance.
    * @param aB new account balance.
    */
   public void setAccountBalance(final double aB) {
       accountBalance = aB;
   }
    /**
     * Account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * Account balance.
     * @param oN .
     */

    public void setOwnerName(final String oN) {
        ownerName = oN;
    }
    /**
     * Account balance.
     */
    public String getOwnerName() {
        return ownerName;
    }

}
