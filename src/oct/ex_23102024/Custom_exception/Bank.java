package oct.ex_23102024.Custom_exception;

import java.io.FileNotFoundException;

public class Bank {
    private String currency;
    private int amount;

    Bank(String currency, int amount){
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws FileNotFoundException, Exception {
        if(!bankName.currency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency mismatch");
        }
        return bankName.amount + this.amount;
    }
}
