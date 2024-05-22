package abstraction_interface;

public class CurrentAccount implements Account{
	
	 private double balance;
	    private double overdraftLimit;

	    public CurrentAccount(double overdraftLimit) {
	        this.overdraftLimit = overdraftLimit;
	        this.balance = 0;
	    }

	@Override
	public void deposit(double amt) {
		  if (amt > 0) {
	            balance += amt;
	            System.out.println(amt + " deposited. Current balance: " + balance);
	        }
		
	}

	@Override
	public void withdraw(double amt) {
		 if (amt > 0 && balance + overdraftLimit >= amt) {
	            balance -= amt;
	            System.out.println(amt + " withdrawn. Current balance: " + balance);
	        } else {
	            System.out.println("Overdraft limit exceeded or invalid amount.");
	        }
		
	}

	@Override
	public void calculateInterest() {
		  System.out.println("Current Account does not calculate interest.");
		
	}

	@Override
	public void viewBalance() {
		  System.out.println("Current Account balance: " + balance);
    }
		
	}

