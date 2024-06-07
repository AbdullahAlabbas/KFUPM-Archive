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
            System.out.println("The AVL tree is empty. Nothing to delete.");
            return;
        }

        // Initialize the current node as the root and keep track of its parent.
        BTNode<T> current = root;
        BTNode<T> parent = null;

        // Traverse the tree to find the node with the given element (el).
        while (current != null && !current.data.equals(el)) {
            parent = current;
            if (current.data.compareTo(el) > 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // If the element is not found in the AVL tree, print a message and return.
        if (current == null) {
            System.out.println("Exception: Word not found.");
            return;
        }

        // If the node to delete has no children, remove it from the tree.
        if (current.left == null && current.right == null) {
            if (parent == null) {
                // The node to delete is the root node.
                root = null;
            } else {
                // Remove the node from the parent's subtree.
                if (current == parent.left) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
            return;
        }

        // If the node to delete has only one child, replace it with its child.
        BTNode<T> child = (current.left == null) ? current.right : current.left;

        // If the node to delete is the root node, set the root to its child.
        if (parent == null) {
            root = child;
            return;
        }

        // Otherwise, replace the node in the parent's subtree with its child.
        if (current == parent.left) {
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

        // Step 1: Store a reference to the original right child.
        BTNode<T> tempNode = root.right;

        // Step 2: Update the right child with the original left child.
        root.right = root.left;

        // Step 3: Update the left child with the original left child's right child.
        root.left = root.left.right;

        // Step 4: Update the right child's left child with the original right child.
        root.right.left = tempNode;

        // Step 5: Swap data between the current root and its right child.
        T val = root.data;
        root.data = root.right.data;
        root.right.data = val;

        // Step 6: Recalculate and update the height of the right subtree.
        getRightAVL().adjustHeight();

        // Step 7: Recalculate and update the height of the current node.
        adjustHeight();
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

        // Step 1: Right Rotation on the right subtree.
        getRightAVL().rotateRight();  // Perform a right rotation on the right subtree.
        getRightAVL().adjustHeight();  // Update the height of the modified right subtree.

        // Step 2: Left Rotation on the current node.
        this.rotateLeft();  // Perform a left rotation on the current node.
        this.adjustHeight();  // Update the height of the current node.
    }


    public void levelOrderTraversal(){
	   levelOrderTraversal(root);
   }


   public BTNode<T> getRootNode() {
    return this.root; // Assuming 'root' is the name of the root node variable in AVLTree class
}

}