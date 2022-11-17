/**
 * @author Sivani Sayani
 */

 import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverterSolution {
    public static void main(String[] args) {
 
		double dollar, rupee, pound, euro;
		int token;
		float amount;

		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.##");
		
		System.out.println("which currency You want to Convert? ");
		System.out.println("1:Dollar 2:Rupee 3:Pound 4:Euro ");
		token = sc.nextInt();

		System.out.println("Enter amount: ");
		amount = sc.nextFloat();

		switch(token){
			case 1:
				rupee = amount * 80;
				System.out.println( amount + " in dollars : " + f.format(rupee)  + " rupees");

				pound = amount * 0.85;
				System.out.println( amount + " in dollars : " + f.format(pound)  + " pounds");

				euro = amount * 0.97;
				System.out.println( amount + " in dollars : " + f.format(euro)  + " euros");

			case 2:
				dollar = amount / 80;
				System.out.println( amount + " in rupees : " + "$" + f.format(dollar));
	
				pound = amount / 95;
				System.out.println( amount + " in rupees : " + f.format(pound) + " pounds");

				euro = amount / 83;
				System.out.println( amount + " in rupees : " + f.format(euro) + " euros");
			case 3:
				rupee = amount * 95;
				System.out.println( amount + " in pounds : " + f.format(rupee) + " rupees");
				
				dollar = amount * 1.18;
				//System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
				System.out.println( amount + " in pounds : $" + f.format(dollar));

				euro = amount * 1.14;
				System.out.println( amount + " in pounds : " + f.format(euro) + " euros");

			case 4:
				rupee = amount * 83;
				System.out.println( amount + " in euros: " + f.format(rupee) + " ruppes");
	
				dollar = amount * 1.03;
				System.out.println( amount + " in euros: $"  + f.format(dollar));
	
				pound = amount * 0.88;
				System.out.println( amount + " in euros: "  + f.format(pound) + " pounds");
	
		}
	}
}
