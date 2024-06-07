package Lab05;
// Java program to implement a queue using an array 
public class QueueAsArray<T> { 
    private int front, rear, capacity; 
    private T[] queue; 
  
    public QueueAsArray(int capacity) { 
        front = rear = -1; 
        this.capacity = capacity; 
        queue = (T[]) new Object[capacity]; 
    } 
    
    public boolean isEmpty(){
       return front == -1;
    }
    
    public boolean isFull(){
      return rear == capacity - 1;
    }
  
    // function to insert an element at the rear of the queue 
    public void enqueue(T data)  { 
        if (isFull())
            throw new UnsupportedOperationException("Queue is full!"); 
        if(isEmpty())
           front++;
           
           rear++; 
           queue[rear] = data; 
    } 
  
    // public T dequeue() { 
    //     if (isEmpty()) 
    //         throw new UnsupportedOperationException("Queue is empty!"); 
    //     T temp = queue[front];    
    //     if (rear == 0) {  
    //         rear = front = -1;
    //     }
    //     else{
    //         for(int i = 0; i <= rear - 1; i++) { 
    //             queue[i] = queue[i + 1]; 
    //         } 
    //         rear--;  
    //     }
    //     return temp; 
    // }


    public T dequeue() {
        // Check if the queue is empty, and throw an exception if so
        if (isEmpty()) {
            throw new UnsupportedOperationException("Queue is empty!");
        }
    
        // Call the helper method to perform the recursive dequeue
        return dequeueRecursive(0);
    }
    
    private T dequeueRecursive(int index) {
        if (index == rear) {
            // Base case: we've reached the last element in the queue
            T temp = queue[index];
            rear = front = -1;
            return temp;
        } else {
            // Recursive case: shift the element at 'index' to the left
            queue[index] = queue[index + 1];
            return dequeueRecursive(index + 1);
        }
    }
    

       
    public boolean search(T e){
        if (isEmpty()) 
            throw new UnsupportedOperationException("Queue is empty!"); 
            
        for(int i = 0; i <= rear; i++) 
            if(e.equals(queue[i]))
               return true;
               
        return false;
  }
  
  public String toString()  { 
        if (isEmpty()) 
            throw new UnsupportedOperationException("Queue is empty!"); 
         
        String str = "";  
        for (int i = 0; i <= rear; i++) { 
            str = str + queue[i] + "   "; 
        } 
        
        return str;
    } 
  
    public  T peek() { 
        if (isEmpty())
             throw new UnsupportedOperationException("Queue is empty!"); 
 
        return queue[front];  
    } 
} 