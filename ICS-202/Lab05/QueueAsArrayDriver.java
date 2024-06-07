package Lab05;
import java.util.Random;

public class QueueAsArrayDriver {
    public static void main(String[] args) {
        QueueAsArray<Integer> queue = new QueueAsArray<>(5);

        // Generate and enqueue random numbers
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100); 
            queue.enqueue(randomNumber);
        }

        // Print the queue
        System.out.println("The queue is: " + queue);

        // Dequeue elements and print them
        System.out.println("First dequeued element is: " + queue.dequeue());
        System.out.println("Second dequeued element is: " + queue.dequeue());

        // Print the queue after two node deletions
        System.out.println("After two node deletion the queue is: " + queue);

        // Print the element at the queue front
        System.out.println("Element at queue front is: " + queue.peek());
    }
}
