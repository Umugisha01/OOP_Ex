import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CALCULATE TOTAL EXPENSES");
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();
        double totalCost = (double)quantity * pricePerItem;
        if (quantity > 100) {
            totalCost -= totalCost * 0.1;
        }
        
        System.out.println("Total Expenses: Rs. " + totalCost);
        scanner.close();
    }
}