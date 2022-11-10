package edu.ilstu;

import java.util.Scanner;

public class Student {  
    int gradeLevel;  
    String name;  
    Address address;  
      
    public Student(int gradeLevel, String name,Address address) {  
        this.gradeLevel = gradeLevel;  
        this.name = name;  
        this.address=address;  
    }  
      
    void display(){  
        System.out.println(gradeLevel+" "+name);  
        System.out.println(address.street+" "+address. city+" "+address.state);  
    }  
      
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        
        Address address1=new Address("Main St.","Bloomington","IL");  
        
        System.out.print("Enter your grade level: ");
        int grade1 = scan.nextInt();
        System.out.print("Enter your name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter the name of the street you live on: ");
        String street1 = scan.nextLine();
        System.out.print("Enter the city you live in: ");
        String city1 = scan.nextLine();
        System.out.print("Enter the state you live in: ");
        String state1 = scan.nextLine();

        Address address2 = new Address(street1, city1, state1);

        Student s=new Student(11,"Dave",address1);  
        Student s2=new Student(grade1, name1,address2);        
        
        s.display();  
        s2.display();  
    }  
}  