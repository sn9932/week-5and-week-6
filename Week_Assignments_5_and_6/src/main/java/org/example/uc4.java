// File: wpp64.java
import java.util.Scanner;

public class uc4 {
    public static void main(String[] args) {
        int[][] marks = new int[3][3]; // 3 students, 3 subjects
        double[] percentage = new double[3];
        char[] grade = new char[3];

        Scanner sc = new Scanner(System.in);

        // Input marks
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }

        // Calculate percentage and grade
        for (int i = 0; i < 3; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else {
                grade[i] = 'F';
            }
        }

        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) +
                    " -> Percentage: " + percentage[i] +
                    "%, Grade: " + grade[i]);
        }

        sc.close();
    }
}