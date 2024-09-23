import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("A PROGRAM TO COUNT TOTAL NUMBER OF NOTES IN A GIVEN AMOUNT IN Frw");
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int[] officialNotes = new int[]{5000, 2000, 1000, 500};
        int[] countedNotes = new int[officialNotes.length];

        int i;
        for(i = 0; i < officialNotes.length; ++i) {
            if (amount >= officialNotes[i]) {
                countedNotes[i] = amount / officialNotes[i];
                amount %= officialNotes[i];
            }
        }

        System.out.println("Total number of notes:");

        for(i = 0; i < officialNotes.length; ++i) {
            if (countedNotes[i] > 0) {
                System.out.println("Notes of " + officialNotes[i] + " : " + countedNotes[i]);
            }
        }

        scanner.close();
    }
}
