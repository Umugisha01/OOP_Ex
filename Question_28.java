import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO REVERSE A NUMBER AND CHECK FOR EQUALITY");
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        int reversedNumber;
        for(reversedNumber = 0; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversedNumber);
        if (originalNumber == reversedNumber) {
            System.out.println("The original and reversed numbers are equal.");
        } else {
            System.out.println("The original and reversed numbers are not equal.");
        }

        scanner.close();
    }
}