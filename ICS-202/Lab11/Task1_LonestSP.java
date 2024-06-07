package Lab11;
import java.util.Scanner;

public class Task1_LonestSP {

    // Method to find the longest prefix which is also a suffix
    public static String findLongestPrefixSuffix(String str) {
        int n = str.length();

        // Searching for the longest prefix which is also a suffix
        for (int len = n / 2; len > 0; len--) {
            String prefix = str.substring(0, len);
            String suffix = str.substring(n - len);

            // Checking if they are equal and non-overlapping
            if (prefix.equals(suffix)) {
                return prefix; // Return the longest prefix-suffix found
            }
        }

        return ""; // No such prefix-suffix found
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String longestPrefixSuffix = findLongestPrefixSuffix(str);




    if (longestPrefixSuffix.length() == 0) {
            System.out.println("No non-overlapping suffix that is also a prefix.");
        }
else{
        // Find and display the longest prefix which is also a suffix
        System.out.println("Longest prefix which is also a suffix: " + longestPrefixSuffix + " and it's length is: " + longestPrefixSuffix.length());
    }}
}
