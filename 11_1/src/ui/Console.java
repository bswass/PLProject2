package ui;
import java.util.Scanner;
/**
 * Created by Owner on 2/17/2016.
 */
public class Console {
    private static Scanner sc = new Scanner (System.in);

    public static void displayLine() {System.out.println();}

    public static void displayLine(String s) {System.out.println(s);}

    public static String getString (String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static void print (business.Person p) {
        System.out.println("You entered:\n" + p.getDisplayText());
    }
}
