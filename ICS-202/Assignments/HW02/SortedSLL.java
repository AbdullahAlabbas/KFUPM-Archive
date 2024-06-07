package HW02;
public class SortedSLL<T extends Comparable<T>> extends SLL<T>{

    // Insert an element 'e' into the sorted singly linked list while maintaining sorted order.
    public void insert(T e){
        SLLNode<T> newNode = new SLLNode<>(e);

        // If the list is empty, insert the new element as both the head and the tail.
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // If the item to be inserted is smaller than the current head, make it the new head.
        if (e.compareTo(head.info) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // If the item to be inserted is greater than or equal to the current tail, make it the new tail.
        if (e.compareTo(tail.info) >= 0) {
            tail.next = newNode;
            tail = newNode;
            return;
        }

        // Insert the new element at the appropriate position within the list.
        SLLNode<T> current = head;
        while (current.next != null && current.next.info.compareTo(e) < 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Merge another sorted singly linked list 'list' into the current list while maintaining sorted order.
    public void merge(SortedSLL<T> list){

        // If the 'list' is empty, there is nothing to merge.
        if (list.head == null) {
            return;
        }

        // If the current list is empty, set it to 'list' and empty 'list'.
        if (head == null) {
            head = list.head;
            tail = list.tail;
            list.head = list.tail = null;
            return;
        }

        SLLNode<T> current1 = head;
        SLLNode<T> current2 = list.head;
        SLLNode<T> prev = null;

        while (current1 != null && current2 != null) {
            // Compare the elements in both lists and merge them into sorted order.
            if (current1.info.compareTo(current2.info) <= 0) {
                prev = current1;
                current1 = current1.next;
            } else {
                // When the element in 'list' is smaller, insert it into the current list.
                if (prev == null) {
                    list.head = current2.next;
                    current2.next = current1;
                    head = current2;
                    prev = current2;
                    current2 = list.head;
                } else {
                    prev.next = current2;
                    list.head = current2.next;
                    current2.next = current1;
                    prev = current2;
                    current2 = list.head;
                }
            }
        }

        // If 'current1' is exhausted but 'current2' isn't, append the remaining elements from 'list'.
        if (current1 == null && current2 != null) {
            if (prev == null) {
                head = list.head;
            } else {
                prev.next = current2;
            }
            tail = list.tail;
        }

        // Empty the second list ('list') after merging.
        list.head = list.tail = null;
    }
}
