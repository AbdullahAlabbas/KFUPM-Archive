package Lab06;
public class BST_Driver {
    public static void main(String[] args) {

        // To be completed by students

        // Generate the tree.
        BST<String> tree = new BST<>();
        tree.insert("D");
        tree.insert("B");
        tree.insert("A");
        tree.insert("C");
        tree.insert("F");
        tree.insert("H");
        tree.insert("G");
        tree.insert("J");

        try {
            String str = tree.getPathToLeafNode("G");
            System.out.println("Path from root to node G is: " + str);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        } 
        System.out.println();
        System.out.println("The BST is: ");
        tree.printTree();



        System.out.print("Preorder traversal: ");
        tree.preorderTraversal();
        System.out.print("\nInorder traversal: ");
        tree.inorderTraversal();
        System.out.print("\nLevel order traversal: ");
        tree.levelOrderTraversal();
        System.out.print("\nPostorder traversal: ");
        tree.postorderTraversal();
        System.out.println("\nLevel order traversal by levels: ");
        tree.levelOrderTraversalByLevels();
        System.out.println("The level of node G is: "+ (tree.getNodeLevel("G")-1));
        tree.deleteByCopying("D");
        tree.printTree();



    }
}
