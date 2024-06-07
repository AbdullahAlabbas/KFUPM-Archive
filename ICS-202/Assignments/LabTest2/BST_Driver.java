package LabTest2;
public class BST_Driver
{
	public static void main(String[] args) {
       
      // To be completed by students

      // Generate the tree. 

      BST<Integer> bst = new BST<Integer>();
      BTNode<Integer> node1 = new BTNode<Integer>(1);
      BTNode<Integer> node2 = new BTNode<Integer>(2);
      BTNode<Integer> node3 = new BTNode<Integer>(3);
      BTNode<Integer> node4 = new BTNode<Integer>(4);
      BTNode<Integer> node5 = new BTNode<Integer>(5);
      bst.insert(node1);
      bst.insert(node2);
      bst.insert(node3);
      bst.insert(node4);
      bst.insert(node5);
      bst.printTree();
      
      // Display the generated tree
      
      
      //	Call search() and show output of search result (if exist, and how many instances)


      //	Call deleteOneInstanceIfMultiple() and show effect on the tree

      
      //	Call deleteByCopying() for an item with one instance and show your code generate exception message



   }
}