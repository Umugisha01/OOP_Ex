import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CHECK WHETHER THE NUMBER IS DIVISIBLE BY 5 AND 11 OR NOT");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("This number is divisible by 5 and 11");
        } else {
            System.out.println("This number is not divisible by 5 and 11");
        }  
        
    }
}