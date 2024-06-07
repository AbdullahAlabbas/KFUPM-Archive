package Lab10;

public class TestHashTable {
    public static void main(String[] args) {
        HashTable<Integer> hashTable = new HashTable<>(13);
        // Insert elements
        insertAndPrint(hashTable, 18);
        insertAndPrint(hashTable, 26);
        insertAndPrint(hashTable, 18); // duplicate
        insertAndPrint(hashTable, 35);
        insertAndPrint(hashTable, 9);
        insertAndPrint(hashTable, 26); // duplicate

        // Find elements
        findAndPrint(hashTable, 15);
        findAndPrint(hashTable, 48);

        // Delete elements
        deleteAndPrint(hashTable, 35);
        insertAndPrint(hashTable, 9); // duplicate
        deleteAndPrint(hashTable, 40); // not in table

        findAndPrint(hashTable, 9);

        insertAndPrint(hashTable, 64);
        insertAndPrint(hashTable, 47);

        findAndPrint(hashTable, 35);

        insertAndPrint(hashTable, 21);
        deleteAndPrint(hashTable, 26);
        insertAndPrint(hashTable, 39);

        System.out.println("Final state of the hash table:");
        System.out.println(hashTable);
    }

    private static void insertAndPrint(HashTable<Integer> table, int value) {
        if (table.insert(value)) {
            System.out.println(value + " inserted.");
        } else {
            System.out.println(value + " is duplicate element. Not inserted.");
        }
        System.out.println(table);
    }

    private static void deleteAndPrint(HashTable<Integer> table, int value) {
        if (table.delete(value)) {
            System.out.println(value + " successfully deleted.");
        } else {
            System.out.println(value + " not deleted because it is not in the table.");
        }
        System.out.println(table);
    }

    private static void findAndPrint(HashTable<Integer> table, int value) {
        int index = table.find(value);
        if (index != -1) {
            System.out.println(value + " found at index " + index + ".");
        } else {
            System.out.println(value + " not found.");
        }
    }
}
