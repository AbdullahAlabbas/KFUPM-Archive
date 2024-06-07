package HW02;

public class SLLNode<T> {
    protected T info;
    protected SLLNode<T> next;

    public SLLNode() {
        this(null, null);
    }

    public SLLNode(T e) {
        this(e, null);
    }

    public SLLNode(T e, SLLNode<T> ptr) {
        info = e;
        next = ptr;
    }
}