package Lab04;
public class QueueAsArrayDriver {
    public static void main(String[] args) {
        QueueAsArray<Integer> queue = new QueueAsArray<>(8);

        // Insert elements into the min-priority queue
        queue.enqueue(11);
        queue.enqueue(33);
        queue.enqueue(22);
        queue.enqueue(44);
        queue.enqueue(55);
        queue.enqueue(77);
        queue.enqueue(99);
        queue.enqueue(88);

        System.out.print("The min priority-queue is: ");
        System.out.println(queue);

        // Dequeue the first two elements
        Integer firstDequeued = queue.dequeue();
        Integer secondDequeued = queue.dequeue();

        System.out.println("First element to be dequeued: " + firstDequeued);
        System.out.println("Second element to be dequeued: " + secondDequeued);

        System.out.print("The modified min priority-queue is: ");
        System.out.println(queue);
    }
}
