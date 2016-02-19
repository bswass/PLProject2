package business;

import java.text.NumberFormat;
/**
 * Created by kaynekhoury on 2/19/16.
 */
public class Account implements account.interfaces.Balanceable, account.interfaces.Depositable, account.interfaces.Withdrawable {


    //Balanceable
    double Balance;
    public void setBalance(double i){Balance = i;}
    public double getBalance() {return Balance;}

    //Depositable
    public void Deposit(double d) {setBalance(getBalance()+d);}

    //Withdrawable
    public void Withdraw(double w) {setBalance(getBalance()-w);}

    public String getBalanceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Balance);
    }



}
