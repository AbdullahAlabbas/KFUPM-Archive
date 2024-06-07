package Lab11;
import java.util.Scanner;

public class Task2_BruteForce {

    // Method to perform brute force string matching
    public static void bruteForceStringMatch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        boolean found = false;

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;

            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == patternLength) {
                System.out.println(text);
                System.out.println(" ".repeat(i) + pattern);
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter text and pattern
        System.out.print("Enter a text string T: ");
        String text = scanner.nextLine();
        System.out.print("Enter a pattern string P: ");
        String pattern = scanner.nextLine();

        // Perform brute force string matching
        bruteForceStringMatch(text, pattern);
    }
}
