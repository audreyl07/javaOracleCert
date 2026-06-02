package BankAccountBalance;

public class InsufficientFundException extends Exception{

    private String message;
    //Constructor
    public InsufficientFundException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
