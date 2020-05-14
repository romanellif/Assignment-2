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
			
			else if (option == 2) {
				System.out.println("How much would you like to withdraw?");
				double withdrawAmount = input.nextDouble();
				System.out.println("Which account would you like to withdraw from?");
				System.out.println("1. Chequing");
				System.out.println("2. Savings");
				System.out.println("2. Credit");
				int option3 = input.nextInt();
				
				if (option3 == 1) {
					double newChequing = chequing - withdrawAmount;
				}
				
				if (option3 == 2) {
					double newSavings = savings - withdrawAmount;
				}
				
				if (option3 == 3) {
					double newCredit = credit + withdrawAmount;
				}
			}
			
			else if (option == 2) {
				System.out.println("How much would you like to withdraw?");
				double withdrawAmount = input.nextDouble();
				System.out.println("Which account would you like to withdraw from?");
				System.out.println("1. Chequing");
				System.out.println("2. Savings");
				System.out.println("2. Credit");
				int option3 = input.nextInt();
				
                if (option3 == 1) {
                    double newChequing = chequing - withdrawAmount;
				}
				
                if (option3 == 2) {
                    double newSavings = savings - withdrawAmount;
				}
				
                if (option3 == 3) {
                    double newCredit = credit + withdrawAmount;
				}
            }
                       
            else if (option == 3) {
				System.out.println("Choose which accounts you would like to transfer funds from:");
				System.out.println("1. Chequing");
				System.out.println("2. Savings");
				System.out.println("3. Credit");
				int option4 = input.nextInt();
						
				if (option4 == 1) {
		            System.out.println("How much would you like to transfer?");
		            double transfer = input.nextDouble();
		            System.out.println("Which account would you like to deposit the funds in?");
		            System.out.println("1. Chequing");
		            System.out.println("2. Savings");
		            System.out.println("3. Credit");
		            int option5 = input.nextInt();
							
		            if (option5 == 2) {
						double newChequing = chequing - transfer;
						double newSavings = savings + transfer;
		            }
		            else if (option5 == 3) {
						double newChequing = chequing - transfer;
						double newCredit = credit - transfer;
		            }
		        }
						
				if (option4 == 2) {
		            System.out.println("How much would you like to transfer?");
		            double transfer = input.nextDouble();
		            System.out.println("Which account would you like to deposit the funds in?");
		            System.out.println("1. Chequing");
		            System.out.println("2. Savings");
		            System.out.println("3. Credit");
		            int option5 = input.nextInt();
							
		            if (option5 == 1) {
						double newSavings = savings - transfer;
						double newChequing = chequing + transfer;
		            }
		            
		            else if (option5 == 3) {
						double newSavings = savings - transfer;
						double newCredit = credit - transfer;
		                    }
				}

				if (option4 == 3) {
		            System.out.println("How much would you like to transfer?");
		            double transfer = input.nextDouble();
		            System.out.println("Which account would you like to deposit the funds in?");
		            System.out.println("1. Chequing");
		            System.out.println("2. Savings");
		            System.out.println("3. Credit");
		            int option5 = input.nextInt();

		        if (option == 1) {
					double newCredit = credit + transfer;
		            double newChequing = chequing + transfer;
		        }

		        if (option == 2) {
					double newCredit = credit + transfer;
					double newSavings = savings + transfer;
                    }
                }
            }

            else if (option == 4) {
            	System.out.println("This is your new balance after the changes you have made today:");
            	System.out.println("Chequing = " + newChequing + "$");
            	System.out.println("Savings = " + newSavings + "$");
            	System.out.println("Credit = " + newCredit + "$");
            }

            
    }
}
			