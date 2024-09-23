import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT EMPLOYEE'S SALARY AND FIND HIS/HER GROSS SALARY");
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        double hra;
        double da;
        if (basicSalary < 1500.0) {
            hra = basicSalary * 0.1;
            da = basicSalary * 0.9;
        } else {
            hra = 500.0;
            da = basicSalary * 0.98;
        }

        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: Rs. " + grossSalary);
        scanner.close();
    }
}