/*
 * In this file, we will take a look at some for and while loops.
 */

public class Solution {
    public static void main(String[] args) {

        System.out.println("For and While Loop Examples");
        System.out.println("----------------------------");

        /* Name: For Loop Printing
         * Here is a for loop to run as an example for Question 1.
         */
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n----------------------------");

        /*
         * Question 1: Create a while loop that recreates the output of "For Loop Print"
         */
        int x = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println("\n----------------------------");

        /* Name: While Loop Sum
         * Here is a while loop to run as an example for Question 2.
         */
        int sum = 0;
        int counter = 0;
        while (counter < 100) {
            sum += counter;
            counter++;
        }
        System.out.println(sum);

        System.out.println("\n----------------------------");

        /*
         * Question 2: Create a for loop that recreates the output of "While Loop Sum"
         */
        sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n----------------------------");

        /* Name: For Loop Pyramid
         * Here is a for loop to run as an example for Question 3.
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n----------------------------");

        /*
         * Question 3: Create a while loop that recreates the output of "For Loop Pyramid"
         */
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
