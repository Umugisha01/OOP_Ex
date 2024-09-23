import java.util.Scanner;

public class Question_32 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO DETERMINE IF AREA OF A RECTANGLE IS GREATER THAN ITS PERIMETER");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        double area = length * breadth;
        double perimeter = 2.0 * (length + breadth);
        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else {
            System.out.println("The area of the rectangle is not greater than its perimeter.");
        }

        scanner.close();
    }
}