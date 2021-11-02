package l20_structural_design_pattern.demo.facade_design_pattern.service;

public class PaymentService {
    public void paymentByPaypal() {
        System.out.println("Payment by Paypal");
    }

    public void paymentByCreditCard() {
        System.out.println("Payment by Credit Card");
    }

    public void paymentByEbankingAccount() {
        System.out.println("Payment by E-banking account");
    }

    public void paymentByCash() {
        System.out.println("Payment by cash");
    }
}
