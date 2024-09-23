import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        //1. Write a program to find maximum between two numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO FIND AND PRINT THE MAXIMUM NUMBER BETWEEN TWO NUMBERS");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("The maximum number is the first one: " + num1);
        } else {
            System.out.println("The maximum number is the second one: " + num2);
        }

        scanner.close();
    }
}