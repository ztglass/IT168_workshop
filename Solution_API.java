import java.util.Scanner;

public class Solution_API {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // 1) Create an instance of Produce named Alpha with the name "Jones' Family Farm",
        //produce type of "Corn", and an initial amount of 125 pounds.

        Produce Alpha = new Produce("Jones' Family Farm", "Corn", 125);



        // 2) Create an instance of Produce name Beta with the name "Northern Farm"
        // with a produce type of "Peaches".

        Produce Beta = new Produce ("Northern Farm", "Peaches");



        // 3) Print out both farms using the toString() method.

        System.out.println(Alpha.toString());
        System.out.println(Beta.toString());



        // 4) Using the appropriate methods, increase the peaches
        // from "Northern Farm" by 250.

        Beta.setAmount(Beta.getAmount() + 250);



        // 5) Print out "Northern Farm" using the toString() method.

        System.out.println(Beta.toString());



        // 6) Using the appropriate methods, create an instance Delta with the name "ISU Farm"
        // and with a produce type accepted by validateType(). If validateType returns false,
        // loop until a valid type is chosen.

        boolean flag = false;
        Produce Delta = new Produce();
        while (!flag){
            System.out.print("Enter a produce: ");
            String produce = scan.nextLine();
            if (Produce.validateType(produce)){
                Delta = new Produce("ISU Farm", produce);
                flag = true;
            }
        }


        // Print out "ISU Farm" using the toString() method, increase the amount by 50,
        // then print again.

        System.out.println(Delta.toString());
        Delta.setAmount(Delta.getAmount() + 50);
        System.out.println(Delta.toString());


        scan.close();
    }
}
