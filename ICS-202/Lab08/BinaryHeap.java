package Lab08;
import java.util.Arrays;
public class BinaryHeap<T extends Comparable<T>> 
{
	private T[] array;
	private int size;
	private int capacity;
	
	public BinaryHeap(){
		this(50);
	}
	
    public BinaryHeap(int capacity)
    {
		this.capacity = capacity;
		size = 0;
      array = (T[]) new Comparable[this.capacity + 1];
    }
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
   
    public boolean isFull()
    {
        return size == array.length - 1;        
    }
    
    public BinaryHeap(T[] comparable) 
    {
    	this(comparable.length);
    	 
    	for(int i = 0; i < comparable.length; i++)
    	   array[i + 1] = comparable[i];
    	   
    	size = comparable.length;   
    	
    	buildHeapTopDown(); //part of  Task01
		//buildHeapBottomUp();
	}
	
	 void buildHeapBottomUp()
	{
        // Task01
            // Start from the middle of the array and move towards the beginning
        for (int i = size / 2; i > 0; i--) {
             // For each element at index 'i', we ensure that the heap property is maintained.
            percolateDown(i);
        }
	}
	
	 void buildHeapTopDown()
	{
      // Task02
      // no need for comments, the oppisite for buildHeapBottomUp()
      for (int i = 1; i <= size; i++) { // the value of i is 2 because the root is at index 1 and we can makt it 1 if we want to but it will be the same
        percolateUp(i);
    }
   }	
	
   private void percolateDown(int index) {
    // Task01
    T value = array[index]; // Store the value at the current index.
    int child;
    while (2 * index <= size) {
        child = 2 * index; // Find the left child of the current index.

        if (child < size && array[child].compareTo(array[child + 1]) > 0) {
            // If there is a right child, and it is smaller than the left child,
            // move to the right child.
            child++;
        }

        if (value.compareTo(array[child]) <= 0) {
            break;
        }

        // Otherwise, swap the current element with the smaller child.
        array[index] = array[child];
        index = child;
    }

    // Restore the original element's value to its correct position in the heap.
    array[index] = value;
}

	
	private void percolateUp(int index){

       T value = array[index];
       while (index > 1 && value.compareTo(array[index / 2]) < 0) {
           array[index] = array[index / 2];
           index = index / 2;
       }
       array[index] = value;
	}
	

	public void purge()
    {
        while(size > 0)                   
            array[size--] = null;     
    }

    public void enqueue(T comparable)
    {
        int index = ++size; 
        
        // percolate up via a hole
        while(index > 1 && array[index / 2].compareTo(comparable) > 0)
        {
            array[index] = array[index / 2];
            index = index / 2 ;
    	}

        array[index] = comparable;
    }

    public T findMin()           
    {
            return array[1];
    }

    public T  dequeueMin()
    {
        T  minItem = array[1];
        array[1] = array[size];                          
        size--; 
        percolateDown(1);
        return minItem;
    }
    
    public T[] heapSort() {
    	T[] x = (T[]) new Comparable[size];             
    	int total = size;  
    	for(int i = 0; i < total; i++) {
    		x[i] = dequeueMin();    		
    	}
    	return x;
    }
    public String toString(){
      if(size == 0)
        return "[ ]";
        
      String str = "[";
      int k;
      for(k = 1; k <= array.length - 2; k++)
        str += array[k] + ", ";
        
      str += array[k] + "]";
      
      return str;
    	
    }
}