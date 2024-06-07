package HW02;

public class Main {
    public static void main(String[] args) {
        SortedSLL<Integer> sortedList = new SortedSLL<>();

        sortedList.insert(5);
        sortedList.insert(2);
        sortedList.insert(8);
        sortedList.insert(1);
        sortedList.insert(6);

        System.out.println("Sorted List after insertions:");
        System.out.println(sortedList.toString());

        SortedSLL<Integer> anotherSortedList = new SortedSLL<>();
        anotherSortedList.insert(3);
        anotherSortedList.insert(7);
        anotherSortedList.insert(4);

        System.out.println("Second sorted List after insertions: ");
        System.out.println(anotherSortedList.toString());

        sortedList.merge(anotherSortedList);

        System.out.println("Merged Sorted List:");
        System.out.println(sortedList.toString());

        System.out.println(sortedList.tail.info);
    }

}
