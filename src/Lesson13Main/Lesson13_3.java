package Lesson13Main;

import java.util.Scanner;

public class Lesson13_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        try {
            int result = a / b;
        } catch (ArithmeticException e){
            System.err.println("you cannot divide by zero");
        }


//        if (b == 0){
//            System.out.println("you cannot divide by zero");
//        }else {
//            int result = a / b;
//            System.out.println(result);
//        }




    }
}
