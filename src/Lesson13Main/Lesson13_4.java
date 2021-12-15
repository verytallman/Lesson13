package Lesson13Main;

public class Lesson13_4 {
    public static void main(String[] args) {
        try {
            int a [] = new int[5];
            a[5] = 30/0;
            System.out.println(a[6]);

        }catch (ArrayIndexOutOfBoundsException er){
            System.out.println("This array has not index ");
        }catch (ArithmeticException es){
            System.out.println("You cannot divide by zero.");
        }
    }
}
