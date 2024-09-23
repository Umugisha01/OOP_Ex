import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT ALL SIDES OF A TRIANGLE AND CHECK WHETHER TRIANGLE IS VALID OR NOT");
        System.out.print("Enter the first side: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int side3 = scanner.nextInt();
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        scanner.close();
    }
}