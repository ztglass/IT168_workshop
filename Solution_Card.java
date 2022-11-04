import java.util.Random;

public class Solution_Card {
    public static Random random = new Random();
    public static void main(String[] args){
        // What will be the value of total?
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
        System.out.println(total);

        /*
         * C, 63 times.
         * 
         * The outer for loop runs 21 times,
         * while the inner loop runs 3 times per outer loop.
         * 
         * 21 * 3 = 63
         */


        // Will this loop run correctly? If not, why?
        int a = 0;
        while (a != 20){
            for (int b = 17; b > 0; b++){
                a++;
            }
        }

        /*
         * This will not run.
         * 
         * While the outer while loop's condition, a != 20, is being changed within the loop,
         * because the inner for loop starts at 17 and increases, it will never be less than 0.
         * This creates an infinite loop, and never breaks out of it.
         * 
         * To remedy this, b++ should be b--.
         */


        // Write a nested for loop that generates all 52 cards in a standard deck.
        // Use Card(suit, number) to create a new card.
        // Then, print all cards using the getCard() method.
        Card deck[] = new Card[52];
        int count = 1;
        int cardIndex = 0;
        String suit;
        for (int c = 0; c < 4; c++){
            for (int b = 1; b < 14; b++){
                switch (count){
                    case 1:
                        suit = "Hearts";
                        deck[cardIndex] = new Card(suit, b);
                        break;
                    case 2:
                        suit = "Diamonds";
                        deck[cardIndex] = new Card(suit, b);
                        break;
                    case 3:                        
                        suit = "Clubs";
                        deck[cardIndex] = new Card(suit, b);
                        break;
                    default:
                        suit = "Spades";
                        deck[cardIndex] = new Card(suit, b);
                        break;
                }
                cardIndex++;
            }
        }
        for (int i = 0; i < 52; i++){
            System.out.println(deck[i].getCard());
        }
    }
}