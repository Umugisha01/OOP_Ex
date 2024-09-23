import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT CHARACTER AND CHECK WHETHER IT IS VOWEL OR CONSONANT");
        System.out.print("Enter a character: ");
        char charac = scanner.next().charAt(0);
        charac = Character.toLowerCase(charac);
        if (charac != 'a' && charac != 'i' && charac != 'u' && charac != 'o' && charac != 'e') {
            if (charac >= 'a' && charac <= 'z') {
                System.out.println("The character is a Consonant");
            } else {
                System.out.println("Input a valid Character");
            }
        } else {
            System.out.println("The character is a Vowel");
        }

        scanner.close();
    }
}