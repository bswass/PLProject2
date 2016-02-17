package cannata;
import java.util.Scanner;
/**
 * Created by Owner on 2/17/2016.
 */
public class PersonApp {
    public static void main (String[] args) {
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();


        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            String option = Console.getString ("Create customer or employee? (c/e): ");
            if (option.equalsIgnoreCase ("c")){
                String firstName = Console.getString ("Enter first name: ");
                String lastName = Console.getString ("Enter last name: ");
                String email = Console.getString ("Enter email: ");
                String custNum = Console.getString ("Customer number: ");


                Customer customer = new Customer();
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmail(email);
                customer.setCustNum(custNum);
                Console.displayLine();
                Console.print(customer);
            }
            else if (option.equalsIgnoreCase ("e")){
                String firstName = Console.getString ("Enter first name: ");
                String lastName = Console.getString ("Enter last name: ");
                String email = Console.getString ("Enter email: ");
                String social = Console.getString ("Social Security number: ");


                Employee employee = new Employee();
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                employee.setSocial(social);
                Console.displayLine();
                Console.print(employee);
            }
            Console.displayLine();
            choice = Console.getString("Continue? (y/n): ");
        }
        Console.displayLine("Bye");
    }
}
