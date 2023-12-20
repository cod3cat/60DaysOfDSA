package as1;

import java.util.Scanner;

public class LargestOfThreeNums {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        int max = 0;

        if (number1 > number2) {
            max = number1;
        }else {
            max = number2;
        }

        if (max > number3) {
            System.out.printf("Maximum of 3 numbers is %d", max);
        } else {{
            System.out.printf("Maximum of 3 numbers is %d", number3);
        }}
    }
}
