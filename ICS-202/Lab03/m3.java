package Lab03;

public class m3 {
    public static void main(String[] args) {
        DLL<String> list1 = new DLL<>();
        DLL<String> list2 = new DLL<>();
    

            list1.addToTail("A");           
            list1.addToTail("B");
            list1.addToTail("C");            list1.addToTail("D");
            list1.addToTail("E");


            list2.addToTail("X");         
            list2.addToTail("Y");
            list2.addToTail("Z");

        
    
        System.out.println("List 1:");
        list1.printAll();
        System.out.println("List 2:");
        list2.printAll();
    
        // Insert elements from list2 alternately into list1
        list1.insertAlternate(list2);
    
        System.out.println("After inserting alternately:");
        list1.printAll();
    }
    
    
}
