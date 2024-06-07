package LabTest2;

public class Quiz02_st202156190 {
    public static void main(String[] args) {
        BST<Integer> tree1 = new BST<>();
        tree1.insert(8);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(2);
        tree1.insert(7);

        System.out.println("Deepest Leaf: " + tree1.deepestLeaf()); 
        System.out.println("Shallowest Leaf: " + tree1.shallowestLeaf());
        

    }
}
