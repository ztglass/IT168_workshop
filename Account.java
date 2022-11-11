/*
 * Account file for AccountDriver.java
 *
 * Date: 10/22/22
 * Author: Mark Milan
 */
package ilstu.edu;

public class Account {
    String name; //Account's name
    double balance; //Account's balance

    /*
     * Overloaded Constructor
     */
    public Account (String name){
        this.name = name;
        this.balance = 0.0;
    }

    /*
     * Overloaded Constructor
     */
    public Account (String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    /*
     * deposit method
     * 
     * Updates object's balance by adding a double to the original
     */
    public void deposit(double balance){
        this.balance = (this.balance + balance);
    }

    /*
     * getBalance() method
     * 
     * getter for balance
     */
    public double getBalance(){
        return this.balance;
    }

    /*
     * withdraw method
     * 
     * Updates object's balance by subtracting a double from the original
     */
    public void withdraw(double balance){
        this.balance = (this.balance - balance);
    }

    /*
     * getName() method
     * 
     * getter for name
     */
    public String getName(){
        return this.name;
    }
}