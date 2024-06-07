package HW01;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is equal to the target
            if (arr[mid] == target) {
                comparisons++; // Increment comparisons for the final comparison
                return comparisons; // Target found
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }

            comparisons++; // Increment comparisons for this iteration
        }

        return comparisons; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = 43 + i;
        }

        int target1 = 43;
        int target2 = 60;
        int target3 = 93;

        int comparisons1 = binarySearch(arr, target1);
        int comparisons2 = binarySearch(arr, target2);
        int comparisons3 = binarySearch(arr, target3);

        System.out.println("Comparisons for target 43: " + comparisons1);
        System.out.println("Comparisons for target 60: " + comparisons2);
        System.out.println("Comparisons for target 93: " + comparisons3);
    }
}
