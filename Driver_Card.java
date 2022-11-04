import java.util.Random;

public class Driver_Card {
    public static Random random = new Random();
    public static void main(String[] args){
        // How many times will the nested loop run?
        // a - 21
        // b - 57
        // c - 63
        // d - will not run
        
        int total = 0;
        for (int a = 0; a < 21; a++){
            for (int b = 3; b > 0; b--){
                total++;
            }
        }
        System.out.println("Total: " + total);


        // Will this loop run correctly? If not, why?
        int a = 0;
        while (a != 20){
            for (int b = 17; b > 0; b++){
                a++;
            }
        }








        // Write a nested for loop that generates all 52 cards in a standard deck.
        // Use Card(suit, number) to create a new card.
        // Then, print all cards using the getCard() method.
        


    }
}