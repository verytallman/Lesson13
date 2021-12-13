package Lesson13Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        File file = new File("qwe");

        readfile(file);

        System.out.println("Print after scanner");


    }

    static void readfile(File file){
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("123");
        } catch (FileNotFoundException e) {
            System.out.println("This is error");
//            e.printStackTrace();
        }
    }

}
