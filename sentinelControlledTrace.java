package edu.ilstu;

import java.util.Scanner;

public class sentinelControlledTrace {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum=0;
        int sentinel=0;
        System.out.print("Enter a number to increment the count and add to the sum (enter -999 to quit): ");
        sentinel = scan.nextInt();
        while(sentinel!=-999){
            sum+=sentinel;
            count++;
            System.out.print("Enter a number to increment the count and add to the sum (enter -999 to quit): ");
            sentinel = scan.nextInt();
        }
        System.out.println(sum + " " + count);
    }
}
