package manager_bank.model;

public class PaymentAccount extends BankAccount {
    private long cardNumber;
    private double moneyAccount;

    public PaymentAccount() {
    }

    public PaymentAccount(int accountID, String accountCode, String accountName, int accountCreationDate) {
        super(accountID, accountCode, accountName, accountCreationDate);
    }

    public PaymentAccount(long cardNumber, double moneyAccount) {
        this.cardNumber = cardNumber;
        this.moneyAccount = moneyAccount;
    }

    public PaymentAccount(int accountID, String accountCode, String accountName, int accountCreationDate, long cardNumber, double moneyAccount) {
        super(accountID, accountCode, accountName, accountCreationDate);
        this.cardNumber = cardNumber;
        this.moneyAccount = moneyAccount;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    @Override
    public String toString() {
        return super.toString() + "," + cardNumber + "," + moneyAccount;
    }
}
