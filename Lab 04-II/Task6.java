import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pricePerPackage = 99.0;

        System.out.print("Enter the number of packages purchased: ");
        int quantity = input.nextInt();

        double discountRate = 0.0;

        if (quantity >= 10 && quantity <= 19) {
            discountRate = 0.20;
        } else if (quantity >= 20 && quantity <= 49) {
            discountRate = 0.30;
        } else if (quantity >= 50 && quantity <= 99) {
            discountRate = 0.40;
        } else if (quantity >= 100) {
            discountRate = 0.50;
        }

        double totalBeforeDiscount = quantity * pricePerPackage;
        double discountAmount = totalBeforeDiscount * discountRate;
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;

        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Total after discount: $" + totalAfterDiscount);
    }
}
