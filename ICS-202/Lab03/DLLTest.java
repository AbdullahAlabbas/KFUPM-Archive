package Lab03;
// public class DLLTest {
// 	public static void main(String[] args) {
// 		DLL<String> test = new DLL<String>();
// 		for(int i = 0; i < 5; i++)
// 			test.addToTail("a" + i);

// public class DLLTest {
//     public static void main(String[] args) {
//         DLL<Character> test = new DLL<Character>();

//         // Add some characters to the list
//         test.addToTail('A');
//         test.addToTail('B');
//         test.addToTail('C');
//         test.addToTail('D');
//         test.addToTail('E');

//         System.out.println("Initial List:");
//         test.printAll();

//         System.out.println("Reversed List:");
//         test.printReverse();
//     }
// }

public class DLLTest {
    public static void main(String[] args) {
        DLL<Integer> test = new DLL<Integer>();
        test.addToTail(10);
        test.addToTail(12);
        test.addToTail(14);
        test.addToTail(16);
        test.addToTail(18);
        test.addToTail(20);
        test.addToTail(22);

        // DLLNode<Integer> tail = test.tail;
        // DLLNode<Integer> p = tail.prev;
        // test.printAll();
        // System.out.println(p.info);

        // while (p.prev != null) {
        //     p = p.prev;
        //     System.out.println(p.info);
        //     p.info = p.info - 1;
        // }

        test.printAll();
        DLLNode<Integer> p = test.head;
        System.out.println(p.info);

        System.out.println("====");

        while (p.next != null) {
        p.next = p.next.next;
        p.next.prev = p;
        p = p.next;
        }       
        test.printAll();



    }
}