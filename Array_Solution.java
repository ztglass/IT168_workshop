import java.util.Scanner;
// create an array, access, update, and process its elements

public class Array_Solution {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        // 1) Create an array named "arr" of length 10
        int[] arr = new int[10];

        // 2) Take input from the user to initialize each value of the array
        for(int i = 0; i < arr.length; i++){
            System.out.print("arr["  + i + "]: ");
            arr[i] = scan.nextInt();
        }

        // 3) Use the printArray method to view the values of the array
        System.out.println("Original array: ");
        printArray(arr);
        
        // 4) Complete the printAverage method to calculate and print the average of the values in the array
        //    then call the method to see the average
        printAverage(arr);

        // 5) Complete the swapMinMax method that swaps the minimum and maximum values in the array
        //    then call the method and use printArray to see the results
        swapMinMax(arr);
        System.out.println("Array after swapping min and max: ");
        printArray(arr);

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
        for(int i : arr){
            average += i;
        }
        average /= arr.length;
        System.out.println("Average of values: " + average);
    }

    public static void swapMinMax(int[] arr){
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
