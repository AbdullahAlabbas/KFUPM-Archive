package Lab07;

public class AVLTreeDriver {
    public static void main(String[] args) {
        //========================= TASK01=========================================
        System.out.println("\n\nTASK1");
        AVLTree<Integer> tree = new AVLTree();
        tree.insertAVL(5);
        tree.insertAVL(2);
        tree.insertAVL(7);
        tree.insertAVL(1);
        tree.insertAVL(4);
        tree.insertAVL(6);
        tree.insertAVL(9);
        tree.insertAVL(3);
        tree.insertAVL(16);
        System.out.println("DOUBLE RIGHT-LEFT ROTATION EXAMPLE: \n" +
                "Insert 15 in the following AVL tree:");
        tree.printTree();
        tree.insertAVL(15);
        tree.balance();
        tree.printTree();
        //================================ TASK02 ================================
        System.out.println("\n\nTASK2");
        AVLTree<Integer> tree2 = new AVLTree();
        tree2.insertAVL(7);
        tree2.insertAVL(2);
        tree2.insertAVL(15);
        tree2.insertAVL(1);
        tree2.insertAVL(3);
        tree2.insertAVL(10);
        tree2.insertAVL(17);
        tree2.insertAVL(5);
        tree2.insertAVL(9);
        tree2.insertAVL(13);
        tree2.insertAVL(18);
        tree2.insertAVL(11);
        System.out.println("Delete 1 in the following AVL tree:");
        tree2.deleteAVL(1);

        tree2.balance();
        tree2.printTree();
        //=============================== TASK03 =====================================
        System.out.println("\n\nTASK3");
        AVLTree<Integer> tree3 = new AVLTree<>();
        tree3.insertAVL(32);
        tree3.insertAVL(26);
        tree3.insertAVL(54);
        tree3.insertAVL(14);
        tree3.insertAVL(30);
        tree3.insertAVL(44);
        tree3.insertAVL(27);
        System.out.println("3.What is the maximum integer key that when inserted in the AVL tree below will cause a single right rotation");
        tree3.printTree();
        tree3.insertAVL(43);

        System.out.println("\n\n");
        tree3.balance();
        tree3.printTree();

        System.out.println("The answer is 43 and the test for Task3 verify that.. ");

        //================================= TASK04 =====================================
        AVLTree<Integer> tree4 = new AVLTree<>();
        tree4.insertAVL(32);
        tree4.insertAVL(26);
        tree4.insertAVL(54);
        tree4.insertAVL(14);
        tree4.insertAVL(30);
        tree4.insertAVL(44);
        tree4.insertAVL(27);
        System.out.println("\n\nTASK4");
        System.out.println("4.What is the minimum integer key that when inserted in the AVL tree\n"+" below will cause a double left-right rotation?");
        tree4.printTree();
        tree4.insertAVL(45);
        tree4.balance();
        tree4.printTree();
        System.out.println("The answer is 45 and the program verify this");
    }
}