import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, max = 0, index = 0, count = 0;

        System.out.println("Enter a sequence of numbers (end with 0):");

        while ((num = input.nextInt()) != 0) {
            count++;
            if (num > max) {
                max = num;
                index = count;
            }
        }

        System.out.println("The index of the largest number is: " + index);
    }
}
