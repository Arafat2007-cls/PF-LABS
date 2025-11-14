import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year (1=Mon, 2=Tue, ..., 7=Sun): ");
        int firstDayInput = input.nextInt(); 
        int dayOfWeek = firstDayInput % 7; 
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // leap year check
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        for (int m = 0; m < 12; m++) {
            System.out.println("\n      " + months[m] + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

                for (int i = 0; i < dayOfWeek; i++) {
                System.out.print("    ");
            }


            for (int d = 1; d <= daysInMonth[m]; d++) {
                System.out.printf("%4d", d);
                dayOfWeek = (dayOfWeek + 1) % 7;
                if (dayOfWeek == 0) System.out.println();
            }

            if (dayOfWeek != 0) System.out.println();


        }
    }
}
