import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO CALCULATE PROFIT OR LOSS");
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();
        double loss;
        if (sellingPrice > costPrice) {
            loss = sellingPrice - costPrice;
            System.out.println("Profit: " + loss);
        } else if (sellingPrice < costPrice) {
            loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit or loss.");
        }

        scanner.close(); 
    }
}