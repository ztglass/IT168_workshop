public class Driver {
    public static void main(String[] args) {
        
        // 1) Write a for loop that prints out "IT 168" seven times.





        // 2) What does the following for loop output?
        //    If the code does not work, what changes must be made
        //    for it to work?
        for (int i = 20; i > 0; i -= 2){
            System.out.println(i % 3);
        }





        // 3) Write a sentinel-controlled while loop that counts backwards
        //    from 15, printing all multiples of 3 until the count reaches 7.





        // 4) What does the following while loop output?
        //    If the code does not work, what changes must be made
        //    for it to work?
        boolean flag = false;
        int b = 7;
        while (!flag){
            if (b == 21%3){
                System.out.println("21 % 3 = " + 21 % 3);
            }
            else{
                b--;
            }
        }
    }
    
}
