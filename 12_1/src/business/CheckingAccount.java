package business;

import java.text.NumberFormat;

/**
 * Created by kaynekhoury on 2/19/16.
 */
public class CheckingAccount extends Account{

    public CheckingAccount(){};
    double monthlyFee = 1.0;
    double subtractMonthlyFee() {return Balance - monthlyFee;}
    void setMonthlyFee(double monthlyFee) {this.monthlyFee = monthlyFee;}
    public double getMonthlyFee() {return monthlyFee;}
    String getMonthlyFeeFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(monthlyFee);
    }

}
