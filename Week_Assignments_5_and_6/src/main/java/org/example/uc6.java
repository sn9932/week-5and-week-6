// File: wpp65.java
import java.util.Scanner;

public class uc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Step 2: Count digits
        if (temp == 0) {
            count = 1; // special case for 0
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        int[] digits = new int[count];
        int[] frequency = new int[10]; // for digits 0–9

        temp = number;

        // Step 3: Store digits in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Step 5: Display result
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}