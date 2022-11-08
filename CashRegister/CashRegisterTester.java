package cashRegister;

import java.util.Scanner;

public class CashRegisterTester {
	public static void main(String[] args) {
		CashRegister register = new CashRegister();
		Coin penny = new Coin("penny", .01);
		Coin nickel = new Coin("nickel", .05);
		Coin dime = new Coin("dime", .10);
		Coin quarter = new Coin("quarter", .25);
		Coin dollar = new Coin("dollar", 1);
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the price of your first item: (-1 to Quit) $");
		boolean truth = true;
		while (truth) {
			double purchase = in.nextDouble();
			if (purchase != -1) {
				register.recordpurchase(purchase);
				System.out.printf("Your current total is: $%.2f\n", register.getpurchaseamount());
				System.out.print("Enter the price of your next item (-1 to Quit) $");
			} else if (purchase == -1) {
				truth = false;
				System.out.println();
				System.out.printf("Your total amount of purchases was: $%.2f\n", register.getfinalpurchaseamount());
			}

		}

		System.out.println();
		while (register.getpaymentamount() < register.getpurchaseamount()) {
			System.out.println("You now must pay for your purchases.");
			System.out.print("How many dollars do you want to pay with?");
			int numDollar = in.nextInt();
			register.recievepayment(numDollar, dollar);

			System.out.print("How many quarters do you want to pay with?");
			int numQuarter = in.nextInt();
			register.recievepayment(numQuarter, quarter);

			System.out.print("How many dimes do you want to pay with?");
			int numDime = in.nextInt();
			register.recievepayment(numDime, dime);

			System.out.print("How many nickels do you want to pay with?");
			int numNickel = in.nextInt();
			register.recievepayment(numNickel, nickel);

			System.out.print("How many pennies do you want to pay with?");
			int numPenny = in.nextInt();
			register.recievepayment(numPenny, penny);

			System.out.printf("You have paid: $%.2f\n", register.getpaymentamount());
			if (register.getpaymentamount() < register.getfinalpurchaseamount()) {
				System.out.printf("You still owe: $%.2f\n",
						(register.getpaymentamount() - register.getfinalpurchaseamount()));
			}
			System.out.printf("Your change is: $%.2f", register.givechange());
		}

	}

}
