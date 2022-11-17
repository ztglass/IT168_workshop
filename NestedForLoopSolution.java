/**
 * @author Sivani Sayani
 */
public class NestedForLoopSolution {
    
    public static void main(String[] args){

        //Problem 1:
        for(int i = 1; i<=5 ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Problem 2:
        for(int i=1;i<=5;i++){  
            for(int j=5;j>=i;j--){  
                    System.out.print("*");  
            }  
            System.out.println();//new line  
        }

        //Problem 3:
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
