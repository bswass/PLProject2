package business;

/**
 * Created by kaynekhoury on 2/19/16.
 */
public class Transactions {

    public static void deposit(account.interfaces.Depositable account, double amount) {account.Deposit(amount);
    }

    public static void withdraw(account.interfaces.Withdrawable account, double amount) {
        account.Withdraw(amount);
    }
}
