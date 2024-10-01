package Assignment30_9_24;

public class SavingAcc {
	 private static double annualInterestRate; 
	    private double savingsBalance; 

	  
	    public SavingAcc(double balance) {
	        savingsBalance = balance;
	    }

	    
	    public void calculateMonthlyInterest() {
	        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
	        savingsBalance += monthlyInterest; 
	    }

	   
	    public static void modifyInterestRate(double newRate) {
	        annualInterestRate = newRate; 
	    }

	    
	    public void displayBalance() {
	        System.out.printf("Current Balance: $%.2f%n", savingsBalance);
	    }
}
