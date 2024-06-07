package LabTest;
public class Quiz01_st202156190 {

    public static void main(String[] args) {


        SLL<String> list1 = new SLL<String>();
        list1.addToTail("a");
        list1.addToTail("b");
        list1.addToTail("c");
        list1.addToTail("d");
        list1.addToTail("e");
        list1.addToTail("f");

        System.out.print("list1: ");
        list1.printAll();
        System.out.println();

        SLL<String> list2 = new SLL<String>();
        list2.addToTail("x");
        list2.addToTail("y");
        list2.addToTail("z");
        list2.addToTail("p");
        list2.addToTail("q");
        list2.addToTail("r");

        System.out.print("list2: ");
        list2.printAll();
        System.out.println();


        SLL<String> evenList1 = new SLL<String>();
        evenList1 = list1.getEvenList();

        System.out.print("evenList1: ");
        evenList1.printAll();
        System.out.println();

        SLL<String> evenList2 = new SLL<String>();
        evenList2 = list2.getEvenList();

        System.out.print("evenList2: ");
        evenList2.printAll();
        System.out.println();

        SLL<String> mergedList = new SLL<String>();
        mergedList = evenList1.mergeList(evenList2);

        System.out.print("mergedList: ");
        mergedList.printAll();
        System.out.println();


        SLL<String> lst = new SLL<String>();
        lst.addToTail("q");
        lst.addToTail("w");
        lst.addToTail("e");
        lst.addToTail("r");

                System.out.print("first list to compare:");
                lst.printAll();

                SLL<String> lst2 = new SLL<String>();
        lst2.addToTail("q");
        lst2.addToTail("w");
        lst2.addToTail("e");
        lst2.addToTail("r");


        System.out.print("second list to compare:");

        lst2.printAll();
        System.out.println();
        System.out.println(lst.equals(lst2));



        

    }
    
}
