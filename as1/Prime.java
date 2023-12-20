package as1;

import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        boolean isPrime = true;
        System.out.print("Enter a number > 0 to check if it is a prime: ");
        int input = scanner.nextInt();

        boolean validInput = input < 2;

        if (!validInput) {
            while (i*i < input) {

                if (input % i == 0) {
                    isPrime = false;
                    break;
                }

                i++;
            }

            if (isPrime) {
                System.out.println("Number is a prime");
            } else {
                System.out.println("Number is not a prime");
            }
    
        } else {
            System.out.printf("Please enter a valid input. Input %d is neither prime nor composite", input);
        }

        
        scanner.close();
    }
}
