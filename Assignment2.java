package Assignment2;

import java.util.Scanner;
/**
 *<p> This program will be able to work as an <bold>ATM<bold> Machine.
 *
 * @author Filippo Romanelli
 */


public class Assignment2 {

	public static void main(String args[]) {

		Scanner input = new Scanner (System.in);
        
        /*Here I am listing the different tasks the ATM machine is able to operate */ 
		System.out.println("Choose one of the following options:");
		System.out.println("1. Make a deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer between accounts");
		System.out.println("4. Print balance");
		System.out.println("5. Make a payment");
		int option = input.nextInt();

		/*Here I placed some variables of the different accounts on the ATM machine*/
		double chequing = 500;
		double savings = 1000;
		double credit = 300;

			/*Option 1 will deal with deposits, whether you want to deposit in your savings or chequing account.*/
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
			/*Option 2 will deal with the withdraw option, as well as where my challenge is being placed. 
			Where the ATM will need to dispense the amount requested in the least amount of bills*/
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
					System.out.println("The amount withdrew is " + withdrawAmount);
					System.out.println("Your current Chequing balance is equal to" + newChequing);
				}
				
				if (option3 == 2) {
					double newSavings = savings - withdrawAmount;
					System.out.println("The amount withdrew is " + withdrawAmount);
					System.out.println("Your current Savings balance is equal to" + newSavings);
				}
				
				if (option3 == 3) {
					double newCredit = credit + withdrawAmount;
					System.out.println("The amount withdrew is " + withdrawAmount);
					System.out.println("Your current Credit balance is equal to " + newCredit);
				}
			}

            /* Option 3 deals with the transfer of funds from one account to the other (you can choose which) */          
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
						System.out.println("Your new chequing balance is equal to " + newChequing);
						System.out.println("Your new savings balance is equal to " + newSavings);
		            }
		            
		            else if (option5 == 3) {
						double newChequing = chequing - transfer;
						double newCredit = credit - transfer;
						System.out.println("Your new chequing balance is equal to " + newChequing);
						System.out.println("Your new credit balance is equal to " + newCredit);
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
						System.out.println("Your new savings balance is equal to " + newSavings);
						System.out.println("Your new chequing balance is equal to " + newChequing);
		            }
		            
		            else if (option5 == 3) {
						double newSavings = savings - transfer;
						double newCredit = credit - transfer;
						System.out.println("Your new savings balance is equal to " + newSavings);
						System.out.println("Your new credit balance is equal to " + newCredit);
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
		            System.out.println("Your new credit balance is equal to " + newCredit);
					System.out.println("Your new chequing balance is equal to " + newChequing);
		        }

		        if (option == 2) {
					double newCredit = credit + transfer;
					double newSavings = savings + transfer;
					System.out.println("Your new credit balance is equal to " + newCredit);
					System.out.println("Your new savings balance is equal to " + newSavings);
                    }
                }
            }
            /* Option 4 will print out your balance*/
            else if (option == 4) {
            	System.out.println("This is your balance");
            	System.out.println("Chequing = " + chequing + "$");
            	System.out.println("Savings = " + savings + "$");
            	System.out.println("Credit = " + credit + "$");
            }
			/*Option 5 will let you make a payment to your credit card*/
            else if (option == 5) {
            	System.out.println("Would you like to make a payment to your credit card from your chequing "
            		               +  "or your savings account?");
            	System.out.println("1. Chequing");
            	System.out.println("2. Savings");
            	int option6 = input.nextInt();
            	
            	if (option6 == 1) {
            		System.out.println("How much would you like to pay off?");
            		double payment = input.nextDouble();
            		double newChequing = chequing - payment;
            		double newCredit = credit - payment;
            		System.out.println("Payment has been made. Thank you :)");
            		System.out.println("Your new chequing balance is equal to: " + newChequing);
            		System.out.pritnln("Your new credit balance is equal to: " + newCredit);
            	}
            	
            	if (option6 == 2) {
            		System.out.println("How much would you like to pay off?");
            		double payment = input.nextDouble();
            		double newSavings = savings - payment;
            		double newCredit = credit - payment;
            		System.out.println("Payment has been made. Thank you :)");
            		System.out.println("Your new savings balance is equal to: " + newSavings);
            		System.out.pritnln("Your new credit balance is equal to: " + newCredit);
            	}
            }
    }
}
			