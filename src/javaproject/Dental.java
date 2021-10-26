package javaproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dental {
    void display() throws FileNotFoundException {
        File file = new File("files/Dental.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
    }
}
