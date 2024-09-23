import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM TO DETERMINE THE YOUNGEST PERSON");
        System.out.print("Enter age of Ram: ");
        int ramAge = scanner.nextInt();
        System.out.print("Enter age of Shyam: ");
        int shyamAge = scanner.nextInt();
        System.out.print("Enter age of Ajay: ");
        int ajayAge = scanner.nextInt();
        int youngestAge = ramAge;
        String youngestName = "Ram";
        if (shyamAge < youngestAge) {
            youngestAge = shyamAge;
            youngestName = "Shyam";
        }

        if (ajayAge < youngestAge) {
            youngestAge = ajayAge;
            youngestName = "Ajay";
        }

        System.out.println("The youngest person is " + youngestName + " with age " + youngestAge);
        scanner.close();
    }
}