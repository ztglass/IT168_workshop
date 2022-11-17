/**
 * @author Sivani Sayani
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
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
                //Dollar conversion
                //Add code here:
			case 2:
                //Rupee conversion
                //Add code here:
			case 3:
				//Pound conversion
                //Add code here:
			case 4:
				//Euro conversion
                //Add code here:
		}
	}
}
