import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT ANGLES OF TRIANGLE AND CHECK WHETHER TRIANGLE IS VALID PR NOT");
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        scanner.close();
    }
}