import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CALCULATE BONUS FOR THE EMPLOYEE");
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year in which the employee joined: ");
        int joiningYear = scanner.nextInt();
        int yearsOfService = currentYear - joiningYear;
        if (yearsOfService > 3) {
            System.out.println("Bonus: Rs. 2500");
        } else {
            System.out.println("No bonus.");
        }

        scanner.close();
    }
}