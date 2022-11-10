import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // 1) Create an array named "arr" of length 10

        // 2) Take input from the user to initialize each value of the array

        // 3) Use the printArray method to view the values of the array
        
        // 4) Complete the printAverage method to calculate and print the average of the values in the array
        //    then call the method to see the average

        // 5) Complete the swapMinMax method that swaps the minimum and maximum values in the array
        //    then call the method and use printArray to see the results

        scan.close();
    }

    public static void printArray(int[] arr){
        System.out.print("[  ");
        for(int i : arr){
            System.out.print(i + "  ");
        }
        System.out.println("]");
    }

    public static void printAverage(int[] arr){
        double average = 0;
        // calculate the average here

        System.out.println("Average of values: " + average);
    }

    public static void swapMinMax(int[] arr){
        // write your method here
    }
}

