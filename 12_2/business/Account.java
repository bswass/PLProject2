package cannata.Customer;

import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {

    //Depositable
    private double Deposit;
    public void setDeposit(double i){Deposit = i;}
    public double getDeposit() {return Deposit;}

    //Withdrawable
    private double Withdraw;
    public void setWithdraw(double i){Withdraw = i;}
    public double getWithdraw() {return Withdraw;}

    //Balanceable
    private double Balance;
    public void setBalance(double i){Balance = i;}
    public double getBalance() {return Balance;}

}
