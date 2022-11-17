/**
 * @author Sivani Sayani
 */

 import java.util.Scanner;

public class ReverseStringSolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String reversedString= "";

        System.out.println("Enter string to be reversed: ");
        String str = sc.nextLine();
    
        char ch[]=str.toCharArray();  
  
        for(int i=ch.length-1; i>=0; i--){  
            reversedString+=ch[i];  
        } 
         
        System.out.println(reversedString);
    }

    
}
