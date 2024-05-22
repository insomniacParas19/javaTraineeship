package abstraction_interface;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added.");
    }

    public void viewAllBalances() {
        for (Account account : accounts) {
            account.viewBalance();
        }
}
}
