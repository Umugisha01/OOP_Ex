import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO DETERMINE THE GRADE OF STEEL");
        System.out.print("Enter the hardness of the steel: ");
        double hardness = scanner.nextDouble();
        System.out.print("Enter the carbon content of the steel: ");
        double carbonContent = scanner.nextDouble();
        System.out.print("Enter the tensile strength of the steel: ");
        double tensileStrength = scanner.nextDouble();
        byte grade;
        if (hardness > 50.0 && carbonContent < 0.7 && tensileStrength > 5600.0) {
            grade = 10;
        } else if (hardness > 50.0 && carbonContent < 0.7) {
            grade = 9;
        } else if (carbonContent < 0.7 && tensileStrength > 5600.0) {
            grade = 8;
        } else if (hardness > 50.0 && tensileStrength > 5600.0) {
            grade = 7;
        } else if (!(hardness > 50.0) && !(carbonContent < 0.7) && !(tensileStrength > 5600.0)) {
            grade = 5;
        } else {
            grade = 6;
        }

        System.out.println("Steel Grade: " + grade);
        scanner.close();
    }
}