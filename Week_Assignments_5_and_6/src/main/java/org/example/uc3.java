// File: wpp63.java
import java.util.Scanner;

public class uc3 {
    public static void main(String[] args) {
        int number;
        int[] multiplicationResult = new int[4]; // for 6,7,8,9

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Calculating multiplication (6 to 9)
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // Displaying results
        System.out.println("\nMultiplication Table from 6 to 9:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}