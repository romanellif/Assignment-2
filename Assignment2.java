package Assignment2;

/**
 *
 * @author Filippo
 */
import java.util.Scanner;

public class Assignment2 {

	public static void main(String args[]) {

		Scanner input = new Scanner (System.in);
        
		System.out.println("Choose one of the following options:");
		System.out.println("1. Make a deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer between accounts");
		System.out.println("4. Print balance");
		System.out.println("5. Make a payment");
		int option = input.nextInt();

		double chequing = 500;
		double savings = 1000;
		double credit = 300;

			if (option == 1) {
				System.out.println("What is the amount you would like to deposit?");
				double deposit = input.nextDouble();
				System.out.println("Which account would you like to deposit in?");
				System.out.println("1. Chequing");
				System.out.println("2. Savings");
				int option2 = input.nextInt();
				if (option2 == 1) {
					double newChequing = chequing + deposit;
					System.out.println("Your new chequing balance is equal to " + newChequing);
				}
				if (option2 == 2)	{
					double newSavings = savings + deposit;
					System.out.println("Your new savings balance is equal to " + newSavings);
				}
			}


	}
}