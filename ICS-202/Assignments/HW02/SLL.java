package HW02;

public class SLL<T> {
    protected SLLNode<T> head, tail;
    public SLL() {
        head = tail = null;
    }

    public void addToTail(T e){
        SLLNode newNode = new SLLNode<T>(e);
        if(head == null)
            head = tail = newNode;
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    public void addToHead(T e) {
        SLLNode<T> newNode = new SLLNode<T>(e, head);
        if(head == null)
            tail = newNode;
        head = newNode;
    }

    public String toString(){
        if (head == null)
            return "[]";
        String out = "[";
        SLLNode<T> p = head;
        while (p.next != null){
            out += p.info + " ";
            p = p.next;
        }
        out += p.info + "]";
        return out;
    }
}