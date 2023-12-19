package as1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Please enter a year: ");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        if (input / 4 == 0) {
            System.out.println("Entered year " + "'" + input + "'" + " is a leap year");
        } else {
            System.out.println("Entered year " + "'" + input + "'" + " is not a leap year");
        }

        scanner.close();
    }
}