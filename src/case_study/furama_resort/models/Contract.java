package case_study.furama_resort.models;

public class Contract {
    private int contractSome;
    private int bookingCode;
    private double depositAmount;
    private double totalPaymentAmount;
    private String customerCode;

    public Contract() {
    }

    public Contract(int contractSome, int bookingCode, double depositAmount, double totalPaymentAmount, String customerCode) {
        this.contractSome = contractSome;
        this.bookingCode = bookingCode;
        this.depositAmount = depositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.customerCode = customerCode;
    }

    public int getContractSome() {
        return contractSome;
    }

    public void setContractSome(int contractSome) {
        this.contractSome = contractSome;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return this.contractSome + "," + this.bookingCode + "," + this.depositAmount + "," + this.totalPaymentAmount + "," + this.customerCode;
    }
}
