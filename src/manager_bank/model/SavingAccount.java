package manager_bank.model;

public class SavingAccount extends BankAccount{
    private double savingDepositAmount;
    private int depositDateSavings;
    private double interest;
    private int term;

    public SavingAccount() {
    }

    public SavingAccount(int accountID, String accountCode, String accountName, int accountCreationDate) {
        super(accountID, accountCode, accountName, accountCreationDate);
    }

    public SavingAccount(double savingDepositAmount, int depositDateSavings, double interest, int term) {
        this.savingDepositAmount = savingDepositAmount;
        this.depositDateSavings = depositDateSavings;
        this.interest = interest;
        this.term = term;
    }

    public SavingAccount(int accountID, String accountCode, String accountName, int accountCreationDate, double savingDepositAmount, int depositDateSavings, double interest, int term) {
        super(accountID, accountCode, accountName, accountCreationDate);
        this.savingDepositAmount = savingDepositAmount;
        this.depositDateSavings = depositDateSavings;
        this.interest = interest;
        this.term = term;
    }

    public double getSavingDepositAmount() {
        return savingDepositAmount;
    }

    public void setSavingDepositAmount(double savingDepositAmount) {
        this.savingDepositAmount = savingDepositAmount;
    }

    public int getDepositDateSavings() {
        return depositDateSavings;
    }

    public void setDepositDateSavings(int depositDateSavings) {
        this.depositDateSavings = depositDateSavings;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return super.toString() + "," + savingDepositAmount + "," + depositDateSavings + ","+ interest;
    }
}
