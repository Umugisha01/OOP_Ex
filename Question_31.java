import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO FIND THE ABSOLUTE VALUE OF THE INPUT NUMBER ON THE KEYBOARD");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int absoluteValue = number < 0 ? -number : number;
        System.out.println("Absolute value: " + absoluteValue);
        scanner.close();
    }
}