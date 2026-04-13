// File: wpp62.java
import java.util.Scanner;

public class uc2 {
    public static void main(String[] args) {
        int number;
        int[] table = new int[10];

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Storing multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Displaying the table
        System.out.println("\nMultiplication Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}