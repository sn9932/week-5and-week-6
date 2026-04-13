// File: wpp65.java
import java.util.Scanner;

public class uc5 {
    public static void main(String[] args) {
        int number, temp, count = 0;

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        temp = number;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10]; // digits 0–9

        temp = number;

        // Store digits in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}