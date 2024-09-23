import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CHECK WHETHER A NUMBER IS POSITIVE, NEGATIVE OR ZERO ");
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        scanner.close();
    }
}