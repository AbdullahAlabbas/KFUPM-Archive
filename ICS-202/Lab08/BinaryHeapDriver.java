package Lab08;
import java.util.Arrays;

import LabTest2.BinaryHeap;

public class BinaryHeapDriver {
    public static void main(String[] args) {
        Integer[] array = {10, 2, 8, 9, 1, 6, 3, 4, 0, 5};

        // Test bottom-up heap construction
        BinaryHeap<Integer> binaryHeapBottomUp = new BinaryHeap<>(array);
        System.out.println("For bottom-up heap construction:");
        System.out.println("The original array is: " + Arrays.toString(array));
        System.out.println("The min-heap is: " + binaryHeapBottomUp);
        System.out.println("The sorted array is: " + Arrays.toString(binaryHeapBottomUp.heapSort()));

        // Comment the bottom-up statement and test top-down heap construction
        BinaryHeap<Integer> binaryHeapTopDown = new BinaryHeap<>(array);
        binaryHeapTopDown.buildHeapTopDown();
        System.out.println("\nFor top-down heap construction (commented the bottom-up statement in the BinaryHeap constructor):");
        System.out.println("The original array is: " + Arrays.toString(array));
        System.out.println("The min-heap is: " + binaryHeapTopDown);
        System.out.println("The sorted array is: " + Arrays.toString(binaryHeapTopDown.heapSort()));
    }
}
