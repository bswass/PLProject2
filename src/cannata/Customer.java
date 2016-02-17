package cannata;

/**
 * Created by Owner on 2/17/2016.
 */
public class Customer extends Person {
    private String custNum;
    public void setCustNum (String custNum) {this.custNum = custNum;}
    public String getCustNum () {return custNum;}

    public Customer(){}
    public String getDisplayText() {return super.toString() + "\nCustomer number: " + custNum;}
}
