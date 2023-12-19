package as1;

import java.util.Scanner;

public class Table {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to get the multiplication table for it: ");
        int input = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf(input + " x " + i + " = %d\n", input*i);
        }

        scanner.close();
    }
}
