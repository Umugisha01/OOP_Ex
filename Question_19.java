import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CALCULATE PERCENTAGE AND GRADE");
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks in Biology: ");
        int biology = scanner.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        int mathematics = scanner.nextInt();
        System.out.print("Enter marks in Computer: ");
        int computer = scanner.nextInt();
        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (double)totalMarks / 500.0 * 100.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        char grade;
        if (percentage >= 90.0) {
            grade = 'A';
        } else if (percentage >= 80.0) {
            grade = 'B';
        } else if (percentage >= 70.0) {
            grade = 'C';
        } else if (percentage >= 60.0) {
            grade = 'D';
        } else if (percentage >= 40.0) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
        scanner.close();
    }
}