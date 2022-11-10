package edu.ilstu;

import java.util.Scanner;

public class enterArr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int arr[] = new int[15];
        /**
         * Write a for loop that takes a maximum 
         * of 15 values from the user and 
         * enters the values into the array above
         */

        for(int i =0; i<15; i++){
            String answer = "x";
            while (!(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("n")))
            {
                System.out.print("Would you like to enter a number into the array: (y or n) ");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("y")){
                System.out.print("Enter the number: ");
                arr[i] = scan.nextInt();
                count++;
            }
            else
                i =15;
        }
        /**
         * Make a for loop that prints out 
         * the filled array from back to front
         */
        
        for(int i=count-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }  
}