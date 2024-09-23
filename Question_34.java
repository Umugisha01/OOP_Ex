import java.util.Scanner;

public class Question_34 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO ESTIMATE THE STUDENT RETURNING BOOK RATE");
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        if (daysLate > 30) {
            System.out.println("Membership cancelled.");
        } else if (daysLate > 10) {
            System.out.println("Fine: Rs. 5");
        } else if (daysLate >= 6) {
            System.out.println("Fine: Rs. 1");
        } else if (daysLate > 0) {
            System.out.println("Fine: Rs. 0.50");
        } else {
            System.out.println("No fine.");
        }

        scanner.close(); 
    }
}