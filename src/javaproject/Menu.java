package javaproject;
import java.io.FileNotFoundException;
import java.util.*;


public class Menu {
    public static void main(String[] args) throws FileNotFoundException {


        Welcome out = new Welcome();
        out.display();

        Cardiology cardiology = new Cardiology();
        Surgery       surgery = new Surgery();
        Medicine     medicine = new Medicine();
        Dental         dental = new Dental();
        Neurology   neurology = new Neurology();

        Scanner input = new Scanner(System.in);
        int choice;
        int status =1;
        while (status==1){

            System.out.println("1. Cardiology");
            System.out.println("2. Surgery");
            System.out.println("3. Medicine");
            System.out.println("4. Dental");
            System.out.println("5. Neurology");
            System.out.println("6. Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> cardiology.display();
                case 2 -> surgery.display();
                case 3 -> medicine.display();
                case 4 -> dental.display();
                case 5 -> neurology.display();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Invalid option selected.Try again.");
            }

            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();

        }



    }
}
