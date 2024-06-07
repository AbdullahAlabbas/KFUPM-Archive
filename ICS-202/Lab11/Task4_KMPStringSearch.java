package Lab11;

import java.util.Scanner;

public class Task4_KMPStringSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read text and pattern from user
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the pattern to search for: ");
        String pattern = scanner.nextLine();

        // Search for the pattern in the text
        int[] result = searchKMP(text, pattern);

        // Display the result
        if (result.length == 0) {
            System.out.println("Pattern not in text.");
        } else {
            System.out.print("Pattern found at these text starting indexes: ");
            for (int index : result) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    public static int[] searchKMP(String text, String pattern) {
        int M = pattern.length();
        int N = text.length();

        // create lps[] that will hold the longest prefix suffix values for pattern
        int[] lps = new int[M];
        int j = 0;  // index for pattern[]

        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(pattern, M, lps);

        int i = 0;  // index for text[]
        int[] result = new int[N];
        int resIndex = 0;

        while (i < N) {
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                result[resIndex++] = (i - j);
                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return java.util.Arrays.copyOf(result, resIndex);
    }

    static void computeLPSArray(String pattern, int M, int[] lps) {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0;  // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else  // (pattern[i] != pattern[len])
            {
                if (len != 0) {
                    len = lps[len - 1];

                    // Also, note that we do not increment i here
                } else  // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
