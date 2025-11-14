import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package in pounds: ");
        double weight = input.nextDouble();

        double rate;

        if (weight <= 2) {
            rate = 1.10;
        } else if (weight <= 6) {
            rate = 2.20;
        } else if (weight <= 10) {
            rate = 3.70;
        } else {
            rate = 3.80;
        }

        double totalCharge = weight * rate;
        System.out.println("The shipping charge is $" + totalCharge);
    }
}
