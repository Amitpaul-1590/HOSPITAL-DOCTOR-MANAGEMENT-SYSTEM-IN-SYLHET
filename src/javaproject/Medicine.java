package javaproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Medicine {
    void display() throws FileNotFoundException {
        File file = new File("files/Medicine.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
    }
}
