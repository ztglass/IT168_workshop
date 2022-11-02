public class Solution {
    
    public static void main(String[] args) {
        
        // 1) Write a nested for loop to print out a rectangle
        //    of 6 rows and 8 columns with the character " * ".

        for (int a = 0; a < 6; a++){
            for (int b = 0; b < 8; b++){
                System.out.print("*");
            }
            System.out.println("");
        }








        // 2) What will the following code output?
        //    If the code does not work, what changes
        //    must be made for it to work?
        for (int a = 0; a < 5; a++){
            for (int b = 7; b > 0; b++){
                System.out.print("$");
            }
            System.out.println("");
        }


        /*
         * Will not work. The inner for loop, with the condition
         * b = 7; b > 0; b++
         * will run forever, as b will never be less than or equal to 0.
         * 
         * To resolve, change b++ to b--.
         */





        // 3) Write a nested for loop to print out all 52 cards
        //    in a standard 52-card deck.

        String suit = "";
        for (int a = 0; a < 4; a++){
            for (int b = 1; b < 14; b++){
                switch (a){
                    case 0:
                        suit = "Hearts";
                        break;
                    case 1:
                        suit = "Clubs";
                        break;
                    case 2:
                        suit = "Diamonds";
                        break;
                    case 3:
                        suit = "Spades";
                        break;
                }
                switch (b){
                    case 1:
                        System.out.println("Ace of " + suit);
                        break;
                    case 11:
                        System.out.println ("Jack of " + suit);
                        break;
                    case 12:
                        System.out.println("Queen of " + suit);
                        break;
                    case 13:
                        System.out.println("King of " + suit);
                        break;
                    default:
                        System.out.println( b + " of " + suit);
                }
            }
        }





        // 4) What will the following code output?
        //    If the code does not work, what changes
        //    must be made for it to work?
        for (int a = 1; a < 4; a++){
            for (int b = 5; b > 0; b--){
                if ((a * b) % 2 == 0){
                    System.out.println(a * b);
                }
            }
        }


        /*
         * 4
         * 2
         * 10
         * 8
         * 6
         * 4
         * 2
         * 12
         * 6
         */
    }
}
