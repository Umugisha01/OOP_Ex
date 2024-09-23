import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CHECK WHETHER TRIANGLE IS EQUILATERAL, ISOSCELES OR SCALENE TRIANGLE");
        System.out.print("Enter the first side: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int side3 = scanner.nextInt();
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 != side2 && side1 != side3 && side2 != side3) {
            System.out.println("The triangle is scalene.");
        } else {
            System.out.println("The triangle is isosceles.");
        }

        scanner.close();
    }
}