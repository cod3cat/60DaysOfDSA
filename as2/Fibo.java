package as2;

import java.util.Scanner;

public class Fibo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int in = scanner.nextInt();
        scanner.close();

        int previous = 0;
        int current = 1;
        int count = 2;

        System.out.print(previous + ", " + current);
        while (count <= in) {
            int temp = current;
            if (previous + current > 0) {
                current = previous + current;
                System.out.printf(", %d", current);
            } else {
                System.out.println();
                System.out.println("Integer overflow");
                break;
            }
            
            previous = temp;
            count++;
            
            
        }


    }


}
