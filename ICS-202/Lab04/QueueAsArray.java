package Lab04;
public class QueueAsArray<T extends Comparable<T>> {
    private int size;
    private T[] queue;

    public QueueAsArray(int capacity) {
        size = 0;
        queue = (T[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public void enqueue(T data) {
        if (isFull()) {
            throw new UnsupportedOperationException("Queue is full!");
        }

        int i = size;
        
        // Find the correct position to insert the new element in sorted order
        while (i > 0 && data.compareTo(queue[i - 1]) < 0) {
            queue[i] = queue[i - 1]; // Shift elements to the right
            i--;
        }

        queue[i] = data; // Insert the new element at the correct position
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Queue is empty!");
        }

        T result = queue[0]; // Get the front element

        // Shift elements to the left to fill the gap created by dequeueing
        for (int i = 1; i < size; i++) {
            queue[i - 1] = queue[i];
        }

        size--; // Decrease the size

        return result; // Return the dequeued element
    }

    public T peek() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Queue is empty!");
        }

        return queue[0]; // Return the front element
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Queue is empty!");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(queue[i]).append(" "); // Build a string representation of the queue
        }

        return sb.toString();
    }
}
