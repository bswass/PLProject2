package cannata;

/**
 * Created by Owner on 2/17/2016.
 */
public class Employee extends Person {
    private String social;
    public void setSocial (String social) {this.social = social;}
    public String getSocial () {return social;}

    public Employee(){}
    public String getDisplayText() {return super.toString() + "\nSocial security number: " + social;}
}
