package javaproject;

import java.util.Scanner;

public class Welcome {
    Scanner input = new Scanner(System.in);
    String name;
    Welcome(){
        System.out.println("Welcome to doctors info In Sylhet Sadar.");
        System.out.print("Please enter your name : ");
        name = input.nextLine();

    }
    void display(){
        System.out.println("\n");
        System.out.println("\t\t\t\t\tDoctor's Info In Sylhet Sadar");
        System.out.println("\t\t\t\t\t=============\n");
        System.out.println("Welcome,"+name+" to our system" );
        System.out.println("Please select the category below");
    }
}
