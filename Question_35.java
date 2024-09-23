import java.util.Scanner;

public class Question_35 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO DETERMINE WORKER EFFICIENCY");
        System.out.print("Enter the time taken by the worker (in hours): ");
        double timeTaken = scanner.nextDouble();
        if (timeTaken >= 2.0 && timeTaken < 3.0) {
            System.out.println("The worker is highly efficient.");
        } else if (timeTaken >= 3.0 && timeTaken < 4.0) {
            System.out.println("The worker is ordered to improve speed.");
        } else if (timeTaken >= 4.0 && timeTaken < 5.0) {
            System.out.println("The worker is given training to improve speed.");
        } else if (timeTaken >= 5.0) {
            System.out.println("The worker has to leave the company.");
        } else {
            System.out.println("Invalid time entered.");
        }

        scanner.close();
    }
}