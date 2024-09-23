import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT ANY CHARACTER AND CHECK IF IT IS ALPHABET, DIGIT OR SPECIAL CHARACTER");
        System.out.print("Enter a character: ");
        char charact = scanner.next().charAt(0);
        if (Character.isAlphabetic(charact)) {
            System.out.println("The character is alphabetic.");
        } else if (Character.isDigit(charact)) {
            System.out.println("The character is a Digit.");
        } else {
            System.out.println("It is a special character.");
        }

        scanner.close();
    }
}