package Lab03;



public class DLLNode<T> {
    public T info;
    public DLLNode<T> next, prev;
    public DLLNode() {
        next = null; prev = null;
    }
    public DLLNode(T el) {
        info = el; next = null; prev = null;
    }
    public DLLNode(T el, DLLNode<T> n, DLLNode<T> p) {
        info = el; next = n; prev = p; 
    }
}
