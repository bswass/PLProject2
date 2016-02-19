package ui;
import java.util.Scanner;


public class AccountApp {

    public static void main(String[] args) {

        //Set the initial account balance
        business.CheckingAccount a = new business.CheckingAccount();
        a.setBalance(1000);

        //Welcome message
        System.out.println("Welcome to the Account Calculator");
        System.out.println();
        System.out.println("Starting Balance");
        System.out.println("Checking: " + a.getBalanceFormatted() );
        System.out.println();
        System.out.println("Enter the transactions for the month");
        //Set the loop to start
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {


            //get input from user
            String wd = Console.getString("Withdrawal or deposit? (w/d): ");

            //Do the transaction
            System.out.println();
            if (wd.equalsIgnoreCase("w")) {
                System.out.print("Amount: $");
                int x = sc.nextInt();
                if (x <= a.getBalance()){
                    a.setBalance(a.getBalance()-x);
                } else {
                    System.out.println("Insufficient funds");
                }

            }
            else if (wd.equalsIgnoreCase("d")) {
                System.out.print("Amount: $");
                int x = sc.nextInt();
                if (x<=10000) {
                    a.setBalance(a.getBalance() + x);
                } else {
                    System.out.println("Exceeded deposit limit");
                }
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
        System.out.println("Checking fee: $" + a.getMonthlyFee());
        a.setBalance(a.getBalance()-a.getMonthlyFee());
        System.out.println();
        System.out.println("Final Balance");
        System.out.println("Checking: $" + a.getBalance() );


    }
}


