package Lab10;

public class HashTable<T> {
    private Entry<T>[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new Entry[size];
        for (int i = 0; i < size; i++) {
            table[i] = new Entry<>(null, "E");
        }
    }

    public boolean insert(T dataObject) {
        int hash = dataObject.hashCode() % size;
        int slot = findNextAvailableSlot(hash);
        if (slot != -1) {
            table[slot] = new Entry<>(dataObject, "O");
            return true;
        }
        return false;
    }

    public boolean delete(T dataObject) {
        int location = find(dataObject);
        if (location != -1) {
            table[location].setStatus("D");
            return true;
        }
        return false;
    }

    public int find(T dataObject) {
        int hash = dataObject.hashCode() % size;
        int originalHash = hash;
        do {
            if (table[hash].getStatus().equals("O") && table[hash].getDataObject().equals(dataObject)) {
                return hash;
            }
            hash = (hash + 1) % size;
        } while (hash != originalHash && !table[hash].getStatus().equals("E"));
        return -1;
    }

    private int findNextAvailableSlot(int currentSlot) {
        int originalSlot = currentSlot;
        do {
            if (table[currentSlot].getStatus().equals("E") || table[currentSlot].getStatus().equals("D")) {
                return currentSlot;
            }
            currentSlot = (currentSlot + 1) % size;
        } while (currentSlot != originalSlot);
        return -1; // No available slot
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("  ").append(i).append(": ").append(table[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
