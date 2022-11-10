package edu.ilstu;

import java.util.Scanner;

public class sentinelControlled {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = "";
        String word = "";
        int count=0;
        System.out.print("Enter a word or phrase to add to the sentence (enter 'done' to quit): ");
        word = scan.nextLine();
        while(!word.equalsIgnoreCase("done")){
            sentence+= word+" ";
            count++;
            if (count>0){
                System.out.print("Enter a word or phrase to add to the sentence (enter 'done' to quit): ");
                word = scan.nextLine();
            }
        }
        System.out.print(sentence);
    }
}
