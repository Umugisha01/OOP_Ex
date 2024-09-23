import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT WEEK NUMBER AND PRINT WEEK DAY");
        System.out.print("Enter a day number: ");
        int dayNum = scanner.nextInt();
        if (dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid number. A week is composed by only 7 days. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}