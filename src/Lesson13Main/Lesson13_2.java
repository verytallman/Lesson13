package Lesson13Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson13_2 {
    public static void main(String[] args) {
        File file = new File("qwe");
        File cat = new File("cat");


        try {
            readfile(cat);
            readfile(file);

        } catch (FileNotFoundException e) {
            System.err.println("There is not valid file");
            e.printStackTrace();
        }


        System.out.println("Print after scanner");


    }

    static void readfile(File file) throws FileNotFoundException {
            Scanner scanner = new Scanner(file);
            System.out.println("123");

    }

}
