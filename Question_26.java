import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM FOR A COMPANY TO INSURE ITS DRIVERS");
        System.out.print("Enter the marital status (married/unmarried): ");
        String maritalStatus = scanner.next();
        System.out.print("Enter the gender (male/female): ");
        String gender = scanner.next();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        boolean insured = false;
        if (maritalStatus.equalsIgnoreCase("married")) {
            insured = true;
        } else if (maritalStatus.equalsIgnoreCase("unmarried")) {
            if (gender.equalsIgnoreCase("male") && age > 30) {
                insured = true;
            } else if (gender.equalsIgnoreCase("female") && age > 25) {
                insured = true;
            }
        }

        if (insured) {
            System.out.println("The driver is eligible for insurance.");
        } else {
            System.out.println("The driver is not eligible for insurance.");
        }

        scanner.close();
    }
}