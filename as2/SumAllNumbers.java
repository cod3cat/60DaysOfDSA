package as2;

import java.util.Scanner;

public class SumAllNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers you want to add. Enter x once you're done entering all the numbers: ");
        int sum = 0;
        String input = scanner.next();
        while (!input.equalsIgnoreCase("x")) {
            try {
              if (Integer.valueOf(input) % 1 == 0) {
                sum += Integer.valueOf(input);
            }
            } catch (Exception e) {
              System.out.println("Please enter an integer");
            } 

            input = scanner.next();  
        }
        System.out.printf("The sum is %d", sum);
        scanner.close();

    }
}
