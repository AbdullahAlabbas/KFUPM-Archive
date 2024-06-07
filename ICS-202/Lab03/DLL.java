package Lab03;
public class DLL<T> {
    DLLNode<T> head;
    DLLNode<T> tail;
  
    public DLL() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void setToNull() {
        head = tail = null;
    }
    public T firstEl() {
        if (head != null)
             return head.info;
        else return null;
    }
    public void addToHead(T el) {
        if (head != null) {
             head = new DLLNode<T>(el,head,null);
             head.next.prev = head;
        }
        else head = tail = new DLLNode<T>(el);
    }
    public void addToTail(T el) {
        if (tail != null) {
             tail = new DLLNode<T>(el,null,tail);
             tail.prev.next = tail;
        }
        else head = tail = new DLLNode<T>(el);
    }
    public T deleteFromHead() {
        if (isEmpty()) 
             return null;
        T el = head.info;
        if (head == tail)   // if only one node on the list;
             head = tail = null;
        else {              // if more than one node in the list;
             head = head.next;
             head.prev = null;
        }
        return el;
    }
    public T deleteFromTail() {
        if (isEmpty()) 
             return null;
        T el = tail.info;
        if (head == tail)   // if only one node on the list;
             head = tail = null;
        else {              // if more than one node in the list;
             tail = tail.prev;
             tail.next = null;
        }
        return el;
    }
    public void printAll() { 
        for (DLLNode<T> tmp = head; tmp != null; tmp = tmp.next)
             System.out.print(tmp.info + " ");
        System.out.println();
    }
    public T find(T el) {
        DLLNode<T> tmp;
        for (tmp = head; tmp != null && !tmp.info.equals(el); tmp = tmp.next);
        if (tmp == null)
             return null;
        else return tmp.info;
    }

    public void printReverse() {
        // Start from the tail and move towards the head
        DLLNode<T> tmp = tail;
        while (tmp != null) {
            System.out.print(tmp.info + " ");
            tmp = tmp.prev; // Move to the previous node
        }
        System.out.println();
    }


    

    
    public void delete7() {
        if (isEmpty()) 
            return;
        
        DLLNode<T> current = head; // Start at the head of the list
        int count = 1; // Initialize a count to keep track of the nodes visited
        boolean forward = true; // Initialize a flag to indicate the traversal direction (forward or backward)
    
        while (count < 7) { // Loop until the count reaches 7 (to find the seventh node)
            if (forward) { 
                if (current.next != null) { 
                    current = current.next; 
                } else {
                    forward = false; // If there is no next node, change direction to backward
                    if (current != null) { 
                        current = current.prev; 
                    }
                }
            } else {
                if (current.prev != null) {
                    current = current.prev; 
                } else {
                    forward = true; // If there is no previous node, change direction to forward
                    if (current != null) { 
                        current = current.next; 
                    }
                }
            }
            count++; 
        }
    
        if (current != null) { 
            if (current == head) { 
                deleteFromHead(); 
            } else if (current == tail) { 
                deleteFromTail(); 
            } else { 
                current.prev.next = current.next; // Update the next pointer of the previous node
                current.next.prev = current.prev; // Update the previous pointer of the next node
            }
        }
    }
    
    public void insertAlternate(DLL<T> newList) {
        DLLNode<T> currentThis = head;
        DLLNode<T> currentNew = newList.head;
    
        while (currentThis != null && currentNew != null) {
            // Save references to next nodes in both lists
            DLLNode<T> nextThis = currentThis.next;
            DLLNode<T> nextNew = currentNew.next;
    
            // Insert the element from newList after the current element in this list
            currentThis.next = currentNew;
            currentNew.prev = currentThis;
            currentNew.next = nextThis;
    
            // Move to the next elements in both lists
            currentThis = nextThis;
            currentNew = nextNew;
        }
    
        // If one list has extra elements, append them to the end of the invoking list
        if (currentNew != null) {
            // Attach the remaining elements from newList to the end of this list
            tail.next = currentNew;
            currentNew.prev = tail;
            // Update the tail to the new tail
            tail = newList.tail;
        }
    }
        


        public void deleteChunk(int i, int j) {
            if (i < 1 || j < i || head == null) {
                return;
            }

            DLLNode<T> current = head;
            int count = 1;

            // Traverse to the i'th node
            while (count < i && current != null) {
                current = current.next;
                count++;
            }

            // If i is greater than the number of nodes in the list
            if (current == null) {
                return;
            }

            DLLNode<T> prev = current.prev;

            // Traverse to the j'th node
            while (count < j && current != null) {
                current = current.next;
                count++;
            }

            // If j is greater than the number of nodes in the list
            if (current == null) {
                return;
            }

            DLLNode<T> next = current.next;

            // Delete all nodes between i'th and j'th nodes
            while (count >= i && count <= j && current != null) {
                DLLNode<T> temp = current;
                current = current.next;
                temp = null;
                count++;
            }

            // Update the links of the remaining nodes
            if (prev != null) {
                prev.next = current;
            } else {
                head = current;
            }

            if (current != null) {
                current.prev = prev;
            } else {
                tail = prev;
            }

        }
    
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<Integer>();
        list.addToHead(7);
        list.addToHead(18);
        list.addToHead(3);
        list.addToHead(2);
        list.addToHead(8);
        list.addToHead(11);
        list.addToHead(5);
        list.printAll();

        list.deleteChunk(4,7);
        list.printAll();
    }
}

