package manager_bank.common;

public class NotFoundBankAccountException extends Exception{
    public NotFoundBankAccountException(String message) {
        super(message);
    }
}
