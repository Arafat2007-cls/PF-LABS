import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;

        System.out.println("Enter a sequence of numbers (end with 0):");

        while ((num = input.nextInt()) != 0) {
            if (num % 2 == 0)
                count++;
        }

        System.out.println("The number of even elements is: " + count);
    }
}
