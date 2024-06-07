package Lab07;
public class AVLTree<T extends Comparable<T>> extends BST<T> {
	
   protected int height;
	
	public AVLTree() {
		super();
		height = -1;
	}
	
	public AVLTree(BTNode<T> root) {
		super(root);
		height = -1;
	}
	
	public void purge(){
		super.purge();
	}
	
	public int getHeight() {
		return getHeight(root);
	}
	
	private int getHeight(BTNode<T> node) {
      if(node == null)
         return -1;
      else
         return 1 + Math.max(getHeight(node.left), getHeight(node.right));
   }
	
   private AVLTree<T> getLeftAVL() {
      AVLTree<T> leftsubtree = new AVLTree<T>(root.left);
      return leftsubtree;
   }

   private AVLTree<T> getRightAVL() {
      AVLTree<T> rightsubtree = new AVLTree<T>(root.right);
      return rightsubtree;
    }
    
	protected int getBalanceFactor() {
      if(isEmpty())
         return 0;
      else
         return getRightAVL().getHeight() - getLeftAVL().getHeight();
    }
    
    public void insertAVL(T el)  {
      super.insert(el);
      this.balance();
    }
    
    public void deleteAVL(T el) {
      // Check if the AVL tree is empty.
      if (isEmpty()) {
          System.out.println("The AVL tree is empty..");
          return;
      }
  
      BTNode<T> node = root;  // Start from the root.
      BTNode<T> parent = new BTNode<>();  // Initialize a parent node as an empty node.
  
      // Traverse the tree to find the node with the given element (el).
      while (node != null && node.data != el) {
          parent = node;
          if (node.data.compareTo(el) > 0) {
              node = node.left;
          } else {
              node = node.right;
          }
      }
  
      // If the element is not found in the AVL tree, print a message and return.
      if (node == null) {
          System.out.println("The element is not in the AVL tree");
          return;
      }
  
      // If the node to delete has no children, remove it from the tree.
      if (node.left == null && node.right == null) {
          if (parent == null) {
              root = null;  // The node to delete is the root node.
          } else {
              // Remove the node from the parent's subtree.
              if (node == parent.left) {
                  parent.left = null;
              } else {
                  parent.right = null;
              }
          }
          return;
      }
  
      // If the node to delete has only one child, replace it with its child.
      BTNode<T> child = (node.left == null) ? node.right : node.left;
  
      // If the node to delete is the root node, set the root to its child.
      if (parent == null) {
          root = child;
          return;
      }
  
      // Otherwise, replace the node in the parent's subtree with its child.
      if (node == parent.left) {
          parent.left = child;
      } else {
          parent.right = child;
      }
  }
  
    
    protected void balance()
    {
      if(!isEmpty())
      {
         getLeftAVL().balance();
    	   getRightAVL().balance();

         adjustHeight();
        
         int balanceFactor = getBalanceFactor();
        
         if(balanceFactor == -2) {
			System.out.println("Balance factor = " + balanceFactor);
			System.out.println("Balancing node with el: "+root.data);
			
			
			if(getRightAVL().getBalanceFactor() == 0 && getLeftAVL().getBalanceFactor() == -1)    /// special case
				  rotateRight();                                
            else if(getLeftAVL().getBalanceFactor() <= 0)     
			      rotateRight();
            else
               rotateLeftRight();
         }
		
         else if(balanceFactor == 2) {
			System.out.println("Balance factor = " + balanceFactor);
            System.out.println("Balancing node with el: "+root.data);
			
			if(getRightAVL().getBalanceFactor() == 0)         /// special case that cannot be done
				  rotateLeft();                                /// by double rotations
            else if(getRightAVL().getBalanceFactor() > 0)   
               rotateLeft();
            else
               rotateRightLeft();
         }
      }
   }
    
   protected void adjustHeight()
   {
      if(isEmpty())
         height = -1;
      else
         height = 1 + Math.max(getLeftAVL().getHeight(), getRightAVL().getHeight());   
   }
    
   protected void rotateRight() {
      System.out.println("RIGHT ROTATION"); 
  
      // Perform the right rotation operation.
      BTNode<T> tempNode = root.right;     // Store a reference to the original right child.
      root.right = root.left;              // Update the right child with the original left child.
      root.left = root.right.left;         // Update the left child with the original right child's left child.
      root.right.left = root.right.right;  // Update the right child's left child with the right child's right child.
      root.right.right = tempNode;         // Update the right child's right child with the original right child.
  
      T val = (T) root.data;               // Swap data between the current root and its right child.
      root.data = root.right.data;
      root.right.data = val;
  
      getRightAVL().adjustHeight();        // Recalculate and update the height of the right subtree.
      adjustHeight();                      // Recalculate and update the height of the current node.
  }
  
    
   protected void rotateLeft() {
 	  System.out.println("LEFT ROTATION");
      BTNode<T> tempNode = root.left;
      root.left = root.right;
      root.right = root.left.right;
      root.left.right = root.left.left;
      root.left.left = tempNode;
            
      T val = (T) root.data;
      root.data = root.left.data;
      root.left.data = val;
            
      getLeftAVL().adjustHeight();
      adjustHeight();
	}
	
	protected void rotateLeftRight()
   {
      System.out.println("Double Rotation...");
 	  getLeftAVL().rotateLeft();
      getLeftAVL().adjustHeight();
      this.rotateRight();
      this.adjustHeight();
  }

  protected void rotateRightLeft() {
   System.out.println("Double Rotation..."); 

   getRightAVL().rotateRight();              // Perform a right rotation on the right subtree.
   getRightAVL().adjustHeight();              // Update the height of the modified right subtree.

   // Left Rotation on the current node.
   this.rotateLeft();                         // Perform a left rotation on the current node.
   this.adjustHeight();                       // Update the height of the current node.
}

   public void levelOrderTraversal(){
	   levelOrderTraversal(root);
   }
      
}