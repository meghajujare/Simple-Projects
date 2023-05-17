import java.util.*;

public class GPA_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = in.nextInt();

        int totalScore = 0;
        double totalGPA = 0.0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for subject " + i + ": ");
            int score = in.nextInt();

            System.out.print("Enter the credit hours for subject " + i + ": ");
            int creditHours = in.nextInt();

            totalScore += score;
            totalGPA += calculateGPA(score) * creditHours;
        }

        double averageGrade = (double) totalScore / numSubjects;
        double averageGPA = totalGPA / numSubjects;

        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Average GPA: " + averageGPA);

        in.close();
    }

    private static double calculateGPA(int score) {
        if (score >= 90) {
            return 4.0;
        } else if (score >= 80) {
            return 3.0;
        } else if (score >= 70) {
            return 2.0;
        } else if (score >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
