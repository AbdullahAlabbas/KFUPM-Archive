package Lab02;
// public class SLL_Driver {
//     public static void main(String[] args) {
//         // Create a new singly linked list and populate it with elements
//         SLL<Integer> myList = new SLL<>();
//         myList.addToTail(7);
//         myList.addToTail(5);
//         myList.addToTail(3);
//         myList.addToTail(50);
//         myList.addToTail(7);
//         myList.addToTail(9);

public class SLL_Driver {
    public static void main(String[] args) {
        // Create a new singly linked list and populate it with mixed data types
        SLL<Object> mixedList = new SLL<>();
        mixedList.addToTail(10);
        mixedList.addToTail("Hello");
        mixedList.addToTail(3.14);
        mixedList.addToTail("World");
        mixedList.addToTail(42);
        
        // Print the original list
        System.out.println("Original Mixed list: " + mixedList);

        // Test insertBefore method
        mixedList.insertBefore(2, "Goodbye");
        System.out.println("After inserting 'Goodbye' before index 2: " + mixedList);

        // Test delete method
        Object deletedElement = mixedList.delete(1);
        System.out.println("Element deleted from index 1: " + deletedElement);
        System.out.println("After deleting element from index 1: " + mixedList);

        // Test insertAfterSecondOccurrence method
        mixedList.insertAfterSecondOccurrence(99, "Hello");
        System.out.println("After inserting 99 after the second occurrence of 'Hello': " + mixedList);
    }
}
