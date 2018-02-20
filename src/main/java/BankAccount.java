import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }
    public void setBankAccountType(final BankAccountType type) {
        accountType = type;
    }

    /**
     * css.
     */
    public BankAccountType getBankAccountType() {
        return accountType;
    }

    /**
     * css.
     *
     * @param interest is an double.
     */
    public void setInterestEarned(final double interest) {
        interestEarned = interest;
    }

    /**
     * css.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * css.
     *
     * @param rate is an double.
     */
    public void setInterestRate(final double rate) {
        interestRate = rate;
    }

    /**
     * css.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * css.
     *
     * @param name is an String.
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }

    /**
     * css.
     */
    public String getOwnerName() {
        return ownerName;
    }


    /**
     * css.
     *
     * @param num is an int.
     */
    public void setAccountNumber(final int num) {
        accountNumber = num;
    }

    /**
     * css.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * css.
     *
     * @param balance is an int.
     */
    public void setAccountBalance(final double balance) {
        accountBalance = balance;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}