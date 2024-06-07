package Lab10;
public class Entry<T> {
    private T dataObject;
    private String status; // "E" for empty, "D" for deleted, "O" for occupied

    public Entry(T dataObject, String status) {
        this.dataObject = dataObject;
        this.status = status;
    }

    public T getDataObject() {
        return dataObject;
    }

    public void setDataObject(T dataObject) {
        this.dataObject = dataObject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int hash() {
        return dataObject.hashCode();
    }

    @Override
    public String toString() {
        return "[" + dataObject + " '" + status + "']";
    }
}
