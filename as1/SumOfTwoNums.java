package as1;

import java.util.Scanner;

public class SumOfTwoNums {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter another number to add: ");
        int number2 = scanner.nextInt();
        scanner.close();

        System.out.printf("The sum of two numbers is: %d", number1 + number2);
    }
}
