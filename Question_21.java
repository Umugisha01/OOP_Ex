import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO INPUT ELECTRICITY UNIT AND CALCULATE TOTAL ELECTRICITY BILL");
        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();
        double bill;
        if (units <= 50) {
            bill = (double)units * 0.5;
        } else if (units <= 200) {
            bill = 25.0 + (double)(units - 50) * 0.75;
        } else if (units <= 450) {
            bill = 137.5 + (double)(units - 200) * 1.2;
        } else {
            bill = 437.5 + (double)(units - 450) * 1.5;
        }

        bill += bill * 0.2;
        System.out.println("Total Electricity Bill: Rs. " + bill);
        scanner.close(); 
    }
}