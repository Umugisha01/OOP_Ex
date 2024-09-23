import java.util.Scanner;

public class Question_25 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CALCULATE DIVISION OBTAINED BY THE STUDENT");
        System.out.print("Enter marks in Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks in Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks in Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks in Subject 4: ");
        int subject4 = scanner.nextInt();
        System.out.print("Enter marks in Subject 5: ");
        int subject5 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (double)totalMarks / 500.0 * 100.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 60.0) {
            System.out.println("Division: First Division");
        } else if (percentage >= 50.0) {
            System.out.println("Division: Second Division");
        } else if (percentage >= 40.0) {
            System.out.println("Division: Third Division");
        } else {
            System.out.println("Division: Fail");
        }

        scanner.close();
    }
}