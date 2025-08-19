import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Taking marks input
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validation: marks should be between 0 and 100
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks;
        }

        // Calculations
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks = " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage = " + averagePercentage + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}
