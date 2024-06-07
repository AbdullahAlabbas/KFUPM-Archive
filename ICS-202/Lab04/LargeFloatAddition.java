package Lab04;
import java.util.Stack;
import java.util.Scanner;

public class LargeFloatAddition {
    static String addLargeFloats(String firstFloat, String secondFloat) {
        // Find the position of the decimal point in each float number
        int decimalIndex1 = firstFloat.indexOf('.');
        int decimalIndex2 = secondFloat.indexOf('.');

        // Ensure both floats have the same number of digits to the right of the decimal point
        int decimalPlaces1 = firstFloat.length() - decimalIndex1 - 1;
        int decimalPlaces2 = secondFloat.length() - decimalIndex2 - 1;

        if (decimalPlaces1 != decimalPlaces2) {
            throw new IllegalArgumentException("Floats must have the same number of decimal places.");
        }

        // Remove the decimal points to work with integer parts
        String integerPart1 = firstFloat.substring(0, decimalIndex1) + firstFloat.substring(decimalIndex1 + 1);
        String integerPart2 = secondFloat.substring(0, decimalIndex2) + secondFloat.substring(decimalIndex2 + 1);

        // Pad the integer parts with leading zeros if needed
        int maxLength = Math.max(integerPart1.length(), integerPart2.length());
        integerPart1 = padWithZeros(integerPart1, maxLength);
        integerPart2 = padWithZeros(integerPart2, maxLength);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();

        // Push digits of the integer parts onto stacks
        for (int k = 0; k < maxLength; k++) {
            stack1.push(integerPart1.charAt(k) - '0');
            stack2.push(integerPart2.charAt(k) - '0');
        }

        int sum = 0, carry = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            sum = (carry + stack1.pop() + stack2.pop());
            resultStack.push(sum % 10);
            carry = sum / 10;
        }

        // Handle any remaining digits in stack1
        while (!stack1.isEmpty()) {
            sum = (carry + stack1.pop());
            resultStack.push(sum % 10);
            carry = sum / 10;
        }

        // Handle any remaining digits in stack2
        while (!stack2.isEmpty()) {
            sum = (carry + stack2.pop());
            resultStack.push(sum % 10);
            carry = sum / 10;
        }

        // If there's a carry, add it to the result
        if (carry > 0) {
            resultStack.push(carry);
        }

        // Build the result string with the decimal point
        StringBuilder result = new StringBuilder();
        int decimalIndex = maxLength - decimalPlaces1;

        while (!resultStack.isEmpty()) {
            if (decimalIndex == 0) {
                result.append('.');
            }
            result.append(resultStack.pop());
            decimalIndex--;
        }

        return result.toString();
    }

    // Helper function to pad a string with leading zeros to match a given length
    private static String padWithZeros(String str, int length) {
        StringBuilder padded = new StringBuilder();
        int zerosToAdd = length - str.length();
        for (int i = 0; i < zerosToAdd; i++) {
            padded.append('0');
        }
        padded.append(str);
        return padded.toString();
    }

    public static void main(String[] args) {
        System.out.println("Note: Enter numbers that have equal number of digits to the right of decimal point.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating point number: ");
        String firstFloat = scanner.nextLine();
        System.out.print("Enter the second floating point number: ");
        String secondFloat = scanner.nextLine();

        String sum = addLargeFloats(firstFloat, secondFloat);
        System.out.println("Sum = " + sum);
    }
}
