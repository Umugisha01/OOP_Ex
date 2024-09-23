import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CHECK WHETHER THE NUMBER IS EVEN OR ODD");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number provided above is even number");
        } else {
            System.out.println("The number provided above is odd number");
        }

        scanner.close();
    }
}