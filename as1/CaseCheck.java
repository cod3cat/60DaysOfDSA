package as1;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char in = scanner.next().trim().charAt(0);

        if (in >= 'a' && in <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        scanner.close();
    }
}
