/*
 * Loops
 * 
 * Program designed to test knowledge of for loops and while loops
 * to "crack a randomly generated code".
 * 
 * Date: 10/20/22
 * Author: Mark Milan
 */
package ilstu.edu;

import java.util.Random;
import java.util.Scanner;

public class LoopsDriver {

    public static String color_one, color_two, color_three, color_four;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String guess_one, guess_two, guess_three, guess_four;

        //Generate random four-color code
        for (int i = 0;i<4; i++){ //loops 4 times
            String x = null;
            switch(random.nextInt(4)+1){ //Generates random number 1 to 4
                case 1:
                    x = "RED";
                    break;
                case 2:
                    x = "BLUE";
                    break;
                case 3:
                    x = "GREEN";
                    break;
                case 4:
                    x = "YELLOW";
                    break;
            }
            switch (i){ //Based on which loop, assign "x" to that slot
                case 0:
                    color_one = x;
                    break;
                case 1:
                    color_two = x;
                    break;
                case 2:
                    color_three = x;
                    break;
                case 3:
                    color_four = x;
                    break;
            }
        }

        boolean flag = false;
        
        //While code is not correct, keep running
        int count = 0;
        while (flag != true){
            int i = 0; 
            System.out.print("Enter first color: ");
            guess_one = scan.next();
            System.out.print("Enter second color: ");
            guess_two = scan.next();
            System.out.print("Enter third color: ");
            guess_three = scan.next();
            System.out.print("Enter last color: ");
            guess_four = scan.next();

            System.out.println("Your guess is: " + guess_one + ", "+ guess_two + ", "+ guess_three + ", "+ guess_four);
            System.out.print("Your guess is ");
            if (guess_one.toUpperCase().equals(color_one)){ //If first color = first color in code
                i++; //Incrememnt by one
            }
            if (guess_two.toUpperCase().equals(color_two)){
                i++;
            }
            if (guess_three.toUpperCase().equals(color_three)){
                i++;
            }
            if(guess_four.toUpperCase().equals(color_four)){
                i++;
            }

            if (i == 4){ //If user got all 4 colors correct
                System.out.println("correct! Congratulations!");
                if (count == 1){
                    System.out.println("You got it in "+ count + "try. Awesome!");
                }
                else {
                    System.out.println("You got it in "+ count + " tries. Good job!");
                }
                flag = true;
            }
            else{ //If user did NOT get all colors correct
                System.out.println("incorrect. You got " + i + " correct. Try again.");
                count++;
            }

        }
        scan.close();
    }
}