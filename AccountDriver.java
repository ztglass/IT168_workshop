/*
 * Objects
 * 
 * Program designed to test creating functions, validating inputs,
 * using arrays, and creating a class to make a simplified
 * bank account system.
 * 
 * Date: 10/22/22
 * Author: Mark Milan
 */
package ilstu.edu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountDriver{
    public static Scanner scan = new Scanner(System.in);
    public static Account arr[] = new Account[5];
    public static int arrI = 0;
    public static DecimalFormat mFormat = new DecimalFormat("0.00");
    public static void main(String[] args) {
        displayMainMenu();
        int choice;

        boolean flag = false;
        while (!flag){
            System.out.print("Please enter your choice: ");
            choice = validateInt();

            switch (choice){
                case 1: //Create Account
                    if(arrI == 5){
                        System.out.println("Cannot create account - Too many accounts.");
                        break;
                    }
                    else{
                        System.out.print("Enter account name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter inital balance (0 for new account): ");
                        double balance = validateDouble();
                        while (balance < 0.0){
                            System.out.print("Please enter a positive number: ");
                            balance = validateDouble();
                        }
                        
                        if (balance == 0.0){
                            arr[arrI] = new Account (name);
                            System.out.println("New account "+ name + " has been created.");
                        }
                        else{
                            arr[arrI] = new Account (name, balance);
                            System.out.println("New account "+ name + " with balance $" + mFormat.format(balance) + " has been created.");
                        }
                        arrI++;
                    }
                    displayMainMenu();
                    break;
                case 2: //List Accounts
                    for (int i = 0; i < arrI; i++){
                        System.out.println(arr[i].getName() + " - $" + mFormat.format(arr[i].getBalance()));
                    }
                    displayMainMenu();
                    break;
                case 3: //Deposit
                    System.out.print("Enter account name: ");
                    String dName = scan.nextLine();
                    if (checkName(dName)){
                        System.out.print("Enter amount to deposit: ");
                        double dBalance = validateDouble();
                        while (dBalance < 0.0){
                            System.out.print("Please enter a positive number: ");
                            dBalance = validateDouble();
                        }
                        for(int i = 0; i < arrI; i++){
                            if (dName.toUpperCase().equals(arr[i].getName().toUpperCase())){
                                arr[i].deposit(dBalance);
                                System.out.println("$" + mFormat.format(dBalance) + " has been deposited. Your new balance is $" + mFormat.format(arr[i].getBalance()));
                            }
                        }
                    }
                    else{
                        System.out.println("Account not found.");
                    }
                    displayMainMenu();
                    break;
                case 4: //Withdraw
                    System.out.print("Enter account name: ");
                    String wName = scan.nextLine();
                    if(checkName(wName)){
                        System.out.print("Enter amount to withdraw: ");
                        double wAmount = validateDouble();
                        while (wAmount < 0.0){
                            System.out.print("Please enter a positive number: ");
                            wAmount = validateDouble();
                        }
                        for (int i = 0; i < arrI; i++){
                            if(wName.toUpperCase().equals(arr[i].getName().toUpperCase())){
                                if(wAmount > arr[i].getBalance()){
                                    System.out.println("Cannot withdraw $" + mFormat.format(wAmount) + " from $" + mFormat.format(arr[i].getBalance()));
                                }
                                else{
                                    arr[i].withdraw(wAmount);
                                    System.out.println("$" + mFormat.format(wAmount) + " has been withdrawn. Your new balance is $" + mFormat.format(arr[i].getBalance()));
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Account not found.");
                    }

                    displayMainMenu();
                    break;
                case 5: //Make a Payment    
                    if (arrI < 2){
                        System.out.println("Not enough accounts to make a payment.");
                    }
                    else {
                        System.out.print("Enter account name to make a payment from: ");
                        String pName = scan.nextLine();
                        if (checkName(pName)){
                            System.out.print("Enter account name to pay: ");
                            String pName2 = scan.nextLine();
                            if(checkName(pName2)){
                                System.out.print("Enter amount to transfer: ");
                                double pAmount = validateDouble();
                                while (pAmount < 0.0){
                                    System.out.println("Please enter a positive number: ");
                                    pAmount = validateDouble();
                                }
                                for(int i = 0; i < arrI; i++){
                                    if(pName.toUpperCase().equals(arr[i].getName().toUpperCase())){
                                        if(pAmount > arr[i].getBalance()){
                                            System.out.println("Cannot withdraw $" + mFormat.format(pAmount) + " from $" + mFormat.format(arr[i].getBalance()));
                                            break;
                                        }
                                        else{
                                            for (int a = 0; a < arrI; a++){
                                                if (pName2.toUpperCase().equals(arr[a].getName().toUpperCase())){
                                                    arr[a].deposit(pAmount);
                                                    arr[i].withdraw(pAmount);
                                                    System.out.println("Successfully deposited $" + mFormat.format(pAmount) + " to " + pName2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else{
                                System.out.println("Account not found.");
                                displayMainMenu();
                            }
                        }
                        else{
                            System.out.println("Account not found.");
                        }
                    }
                    displayMainMenu();
                    break;
                case 6: //Exit
                    System.out.println("Goodbye!");
                    flag = true;
                    break;
                default: //Input is not a menu choice
                    System.out.print("Please enter a menu choice: ");
                    choice = validateInt();
                    break;
            }
        }
        scan.close();
    }

    public static int validateInt(){ //Validates next input as integer
        while (!scan.hasNextInt()){
            System.out.print("Please enter an integer: ");
            scan.next();
        }
        int returnInt = scan.nextInt();
        scan.nextLine(); //Flush scanner
        return returnInt;
    }

    public static double validateDouble(){ //Validate next input as double
        while (!scan.hasNextDouble()){
            System.out.print("Please enter a double: ");
            scan.next();
        }
        double returnDouble = scan.nextDouble();
        scan.nextLine();
        return returnDouble;
    }

    public static void displayMainMenu(){ //Displays main menu
        String menu[] = {"Create Account", "List Accounts and Balance", "Deposit", "Withdraw", "Make a Payment", "Exit"};
        System.out.println("\n ~ ~ ~ Main Menu ~ ~ ~ ");
        for (int i = 1; i < menu.length + 1; i++){
            System.out.println(i + " - " + menu[i-1]);
        }
        System.out.println("");
    }

    public static boolean checkName(String name){ //Checks input name in array, returns true if found
        for (int i = 0; i < arrI; i++){
            if (name.toUpperCase().equals(arr[i].getName().toUpperCase())){
                return true;
            }
        }
        return false;
    }
}