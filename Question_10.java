import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("THE PROGRAM TO CHECK WHETHER THE CHARACTER IS UPPERCASE OR LOWERCASE");
        System.out.print("Enter the character: ");
        char character = scanner.next().charAt(0);
        if (character >= 'a' && character <= 'z') {
            System.out.println("Character is in LowerCase");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("Character is in UpperCase");
        } else {
            System.out.println("Please enter a valid character");
        }

        scanner.close();
    }
}