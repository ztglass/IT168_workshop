public class Driver {
    public static void main(String[] args) {
        
        // 1) Write a nested for loop to print out a rectangle
        //    of 6 rows and 8 columns with the character " * ".










        // 2) What will the following code output?
        //    If the code does not work, what changes
        //    must be made for it to work?
        for (int a = 0; a < 5; a++){
            for (int b = 7; b > 0; b++){
                System.out.print("$");
            }
            System.out.println("");
        }










        // 3) Write a nested for loop to print out all 52 cards
        //    in a standard 52-card deck.










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
    }
}
