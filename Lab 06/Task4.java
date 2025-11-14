import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again;

        do {
            System.out.println("Choose pattern:");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.print("Enter choice (1 or 2): ");
            int choice = input.nextInt();

            System.out.print("Enter number of rows: ");
            int rows = input.nextInt();

            if (choice == 1) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("*");
                    System.out.println();
                }
            } else if (choice == 2) {
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows; j++)
                        System.out.print("*");
                    System.out.println();
                }
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to print again? (y/n): ");
            again = input.next().charAt(0);

        } while (again == 'y' || again == 'Y');
    }
}
