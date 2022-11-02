public class Solution {
    public static void main(String[] args) {
        
        // 1) Write a for loop that prints out "IT 168" seven times.

        for (int i = 0; i < 7; i++){
            System.out.println("IT 168");
        }




        // 2) What does the following for loop output?
        //    If the code does not work, what changes must be made
        //    for it to work?
        for (int i = 20; i > 0; i -= 2){
            System.out.println(i % 3);
        }

        /*
         * 2
         * 0
         * 1
         * 2
         * 0
         * 1
         * 2
         * 0
         * 1
         * 2
         */



        // 3) Write a sentinel-controlled while loop that counts backwards
        //    from 15, printing all multiples of 3 until the count reaches 7.
        int a = 15;
        while (a == 7){
            if (a % 3 == 0){
                System.out.println(a);
            }
            a--;
        }




        // 4) What does the following while loop output?
        //    If the code does not work, what changes must be made
        //    for it to work?
        boolean flag = false;
        int b = 7;
        while (!flag){
            if (b == 21 % 3){
                System.out.println("21 % 3 = " + 21 % 3);
            }
            else{
                b--;
            }
        }

        /*
         *      The code does not work. The condition for the while loop is
         * never changed within the loop itself, and will run infinitely.
         * 
         *      To remedy this, you must put:
         *    flag = true;
         *      under System.out.println().
         * 
         *      Once b = 0, the if statement's condition (b == 21 % 3) is true,
         * and runs.
         */





    }
}
