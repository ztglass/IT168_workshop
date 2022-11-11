import java.util.Scanner;

public class ArraySolution {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String names[] = new String[10];
        String grades[] = new String[10];

        for (int i = 0; i < names.length; i++){
            System.out.print("Enter a name: ");
            String name = scan.nextLine();
            name = scan.nextLine();
            System.out.print("Enter grade for " + name + ": ");
            grades[i] = scan.nextLine();
        }

        for (int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i] + ", Grade: " + grades[i]);
        }

        System.out.println("Enter a name to change grade: ");
        String name2 = scan.nextLine();
        for (int i = 0; i < names.length; i++){
            if (name2.toUpperCase() == names[i].toUpperCase()){
                System.out.println("Enter new grade: ");
                String grade = scan.nextLine();
                grades[i] = grade;
            }
            else{
                System.out.println("Name not found.");
            }
        }

        for (int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i] + ", Grade: " + grades[i]);
        }

        scan.close();
    }
}
