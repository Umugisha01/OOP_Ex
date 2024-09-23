import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO TEST IF THE YEAR IS LEAP YEAR OR NOT");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }

        scanner.close();  
    }
}