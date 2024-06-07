package Lab11;
import java.util.Scanner;

public class Task3_PSuffix {

    static void generatePrefixSuffixTable(String s) {


        for (int i = 1; i <= s.length(); i++) {
            String substring = s.substring(0, i);
            System.out.println("Substring: " + substring);
            System.out.println("-------------------------------");

            for (int j = 1; j < substring.length(); j++) {
                String prefix = substring.substring(0, j);
                String suffix = substring.substring(substring.length() - j);

                System.out.print("Proper prefix: " + prefix + ", Proper suffix: " + suffix);

                if (prefix.equals(suffix)) {
                    System.out.print(" *" + prefix.length());
                }

                System.out.println();
            }
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the pattern: ");
        String S = scanner.nextLine();
        scanner.close();

        generatePrefixSuffixTable(S);
    }
}
