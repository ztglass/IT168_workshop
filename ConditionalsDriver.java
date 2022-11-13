/*
 * Conditionals
 * 
 * Program designed to test switch statements and if - else statements
 * 10/20/22
 * Author: Mark Milan
 */
import java.util.Scanner;

public class ConditionalsDriver {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int savings = 150; //Integer amount of dollars
        int checkings = 2051;
        int investment = 7315;
        int withdraw;

        //Prompt user for account to withdraw from
        System.out.print("Please enter account name to withdraw from: ");
        String account = scan.nextLine();

        //Switch statement compares input, converted to all upper case with case statements
        switch(account.toUpperCase()){
            case "SAVINGS": 
                System.out.print("Enter amount to withdraw: ");
                withdraw = scan.nextInt();
                    if (withdraw > savings){ //If withdraw amount is greater than savings amount
                        System.out.println("Cannot withdraw " + withdraw + " from " + savings + ".");
                        break;
                    }
                    else{ //If withdraw amount is NOT greater than savings amount
                        System.out.println ("You have withdrawn " + withdraw + " from your Savings account. Your new balance is " + (savings - withdraw) + " dollars.");
                    }
                break; 
            case "CHECKINGS":
                System.out.print("Enter amount to withdraw: ");
                withdraw = scan.nextInt();
                    if (withdraw > checkings){ //If withdraw amount is greater than checkings amount
                        System.out.println("Cannot withdraw " + withdraw + " from " + checkings + ".");
                        break;
                    }
                    else{ //If withdraw amount is NOT greater than checkings amount
                        System.out.println ("You have withdrawn " + withdraw + " from your Checkings account. Your new balance is " + (checkings - withdraw) + " dollars.");
                    }
                break;
            case "INVESTMENT":
                System.out.print("Enter amount to withdraw: ");
                withdraw = scan.nextInt();
                    if (withdraw > investment){ //If withdraw amount is greater than investment amount
                        System.out.println("Cannot withdraw " + withdraw + " from " + investment + ".");
                        break;
                    }  
                    else{   //If withdraw amount is NOT greater than investment account
                        System.out.println ("You have withdrawn " + withdraw + " from your Investment account. Your new balance is " + (investment - withdraw) + " dollars.");
                    }
                break;
            default: //If user's input does not match any case
                System.out.println("Account not found.");
                break;
        }
        System.out.println("Exiting.");
        scan.close();
    }
}