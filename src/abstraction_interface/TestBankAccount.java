package abstraction_interface;

public class TestBankAccount {

	public static void main(String[] args) {
		Bank bank = new Bank();
		 Account savingAcc = new SavingAccount(4.5);
		 Account currentAcc = new CurrentAccount(1000);
		 
		 bank.addAccount(savingAcc);
	        bank.addAccount(currentAcc);

	        savingAcc.deposit(2000);
	        currentAcc.deposit(5000);

	        savingAcc.calculateInterest();
	        currentAcc.calculateInterest();

	        savingAcc.withdraw(1200);
	        currentAcc.withdraw(7000);

	        bank.viewAllBalances();
	}
}
