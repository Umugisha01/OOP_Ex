import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO FIND ALL ROOTS OF A QUADRATIC EQUATION");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4.0 * a * c;
        double root;
        if (discriminant > 0.0) {
            root = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0.0) {
            root = -b / (2.0 * a);
            System.out.println("Roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            System.out.println("Roots are complex and different.");
        }

        scanner.close();
    }
}