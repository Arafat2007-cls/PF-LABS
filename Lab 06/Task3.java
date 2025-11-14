import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers (end with 0):");
        int prev = input.nextInt();  // store the first number
        int num, count = 0;

        while ((num = input.nextInt()) != 0) {
            if (num > prev)
                count++;
            prev = num;  // update previous number
        }

        System.out.println("The number of elements greater than the previous one is: " + count);
    }
}
