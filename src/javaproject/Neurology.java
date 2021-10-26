package javaproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Neurology {

    void display() throws FileNotFoundException {
        File file = new File("files/Neurology.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
    }


}
