package Assignment30_9_24;
import java.util.Scanner;
public class TestSavingAcc {

	public static void main(String[] args) {
		SavingAcc saver1 = new SavingAcc(2000.00);
		SavingAcc saver2 = new SavingAcc(3000.00);

		SavingAcc.modifyInterestRate(0.03);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		saver1.displayBalance();
		saver2.displayBalance();

		SavingAcc.modifyInterestRate(0.04);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("Balances after 4% interest:");
		saver1.displayBalance();
		saver2.displayBalance();
	}
	}


