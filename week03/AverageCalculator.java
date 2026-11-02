
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        double score1, score2, score3;

        // Get and validate the first score
        do {
            System.out.print("Enter first score (0-100): ");
            score1 = input.nextDouble();

            if (score1 < 0 || score1 > 100) {
                System.out.println("Invalid score! Enter a value between 0 and 100.");
            }
        } while (score1 < 0 || score1 > 100);

        // Get and validate the second score
        do {
            System.out.print("Enter second score (0-100): ");
            score2 = input.nextDouble();

            if (score2 < 0 || score2 > 100) {
                System.out.println("Invalid score! Enter a value between 0 and 100.");
            }
        } while (score2 < 0 || score2 > 100);

        // Get and validate the third score
        do {
            System.out.print("Enter third score (0-100): ");
            score3 = input.nextDouble();

            if (score3 < 0 || score3 > 100) {
                System.out.println("Invalid score! Enter a value between 0 and 100.");
            }
        } while (score3 < 0 || score3 > 100);

        double total = score1 + score2 + score3;
        double average = total / 3;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        input.close();
    }
}
