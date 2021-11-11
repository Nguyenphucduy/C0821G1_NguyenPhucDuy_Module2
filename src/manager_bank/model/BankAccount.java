package manager_bank.model;

public abstract class BankAccount {
    private int accountID;
    private String accountCode;
    private String accountName;
    private int accountCreationDate;

    public BankAccount() {
    }

    public BankAccount(int accountID, String accountCode, String accountName, int accountCreationDate) {
        this.accountID = accountID;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.accountCreationDate = accountCreationDate;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(int accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return accountID + "," + accountCode + "," + accountName + "," + accountCreationDate;
    }
}
