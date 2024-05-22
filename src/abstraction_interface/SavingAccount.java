package abstraction_interface;

public class SavingAccount implements Account {

	  private double balance;
	    private double interestRate;

	    public SavingAccount(double interestRate) {
	        this.interestRate = interestRate;
	        this.balance = 0;
	    }
	
	@Override
	public void deposit(double amt) {
		  if (amt > 0) {
	            balance += amt;
	            System.out.println(amt + " deposited. Current balance is: " + balance);
	        }
		
	}

	@Override
	public void withdraw(double amt) {
		if (amt > 0 && balance >= amt) {
            balance -= amt;
            System.out.println(amt + " withdrawn. Current balance is: " + balance+"\n");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
		
	}

	@Override
	public void calculateInterest() {
		 double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest calculated: " + interest + ". Your Current balance: " + balance);
		
	}

	@Override
	public void viewBalance() {
		 System.out.println("Your Saving Account balance is: " + balance);
    }
		
	}

