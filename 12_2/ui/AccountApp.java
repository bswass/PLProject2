package cannata.Customer;
import java.util.Scanner;


public class AccountApp {

    public static void main(String[] args) {

        //Set the initial account balance
        setBalance()

        //Welcome message
        System.out.println("Welcome to the Account Calculator");
        System.out.println();
        System.out.println("Starting Balance");
        System.out.println("Checking: " + getBalance() );

        //Set the loop to start
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter the transactions for the month");
            //get input from user
            System.out.println("Withdrawal or deposit? (w/d): ");
            int customerId = sc.nextInt();

            Customer cx = new Customer();
            cx = CustomerDB.getCustomer(customerId);

            //Do the transaction
            System.out.println("");
            if (cx = "w") {
                System.out.println("Amount: $")
            }
            else if (cx = "d") {
                System.out.println("Amount: $")
            } else{
                System.out.println("Please input a correct responce");
            }


            // see if the user wants to continue
            System.out.println();
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }

        //Ending Statements
        System.out.println("Monthly Fees");
        System.out.println("Checking fee: $" + getMonthlyFee());

        System.out.println("Final Balance");
        System.out.println("Checking: $" + getBalance() );


    }
}

}
