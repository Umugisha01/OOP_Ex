import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CHECK WHETHER A CHARACTER IS ALPHABET OR NOT");
        System.out.print("Enter the character: ");
        char alpha = scanner.next().charAt(0);
        if ((alpha < 'a' || alpha > 'z') && (alpha < 'A' || alpha > 'Z')) {
            System.out.println("The character is not an alphabet");
        } else {
            System.out.println("The character is an alphabet");
        }
    }
}