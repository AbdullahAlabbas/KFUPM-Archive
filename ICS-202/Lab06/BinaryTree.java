package Lab06;
import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class BinaryTree<T extends Comparable<T>> {
    BTNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(BTNode root) {
        root = null;
    }

    public void purge() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(T key) {
        if (root == null) {
            root = new BTNode(key);
            return;
        }

        BTNode temp;
        Queue<BTNode> q = new LinkedList<BTNode>();
        q.add(root);

        // Do level order traversal until we find the first empty left or right child.
        while (!q.isEmpty()) {
            temp = q.poll();

            if (temp.left == null) {
                temp.left = new BTNode(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new BTNode(key);
                break;
            } else
                q.add(temp.right);
        }
    }

    // delete by copying last node
    public void deleteByCopying(T data) {
        if (root == null)
            throw new UnsupportedOperationException("Tree is empty!");
        else if (root.left == null && root.right == null) {
            if (root.data.equals(data))
                root = null;
            else
                throw new NoSuchElementException(data + " not in the tree.");
            return;
        }

        Queue<BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        BTNode keyNode = null;
        BTNode currentNode = null;
        BTNode parentNode = root;
        boolean found = false;
        while (!queue.isEmpty()) {
            currentNode = queue.poll();

            if (currentNode.data.equals(data)) {
                if (!found) {
                    keyNode = currentNode;
                    found = true;
                }
            }

            if (currentNode.left != null) {
                queue.add(currentNode.left);
                parentNode = currentNode;
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
                parentNode = currentNode;
            }
        }

        if (!found)
            throw new NoSuchElementException(data + " not in tree.");

        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            System.out.print(currentNode.data + "  ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
                parentNode = currentNode;
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
                parentNode = currentNode;
            }
        }

        keyNode.data = currentNode.data;
        if (parentNode.left == currentNode)
            parentNode.left = null;
        else if (parentNode.right == currentNode)
            parentNode.right = null;
    }

    public void levelOrderTraversal() { // BreadthFirstTraversal
        levelOrderTraversal(root);
    }

    // BreadthFirst Traversal
    protected void levelOrderTraversal(BTNode root) {
        if (root == null)
            return;
        Queue<BTNode> queue = new LinkedList<BTNode>();
        BTNode node = root;
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            visit(node);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public void levelOrderTraversalByLevels() {
        levelOrderTraversalByLevels(root);
    }

    protected void levelOrderTraversalByLevels(BTNode<T> root) {
        Queue q = new LinkedList();
        int levelNodes = 0;
        if (root == null)
            return;

        q.add(root);
        while (!q.isEmpty()) {
            levelNodes = q.size();
            while (levelNodes > 0) {
                BTNode n = (BTNode) q.remove();
                System.out.print(" " + n.data);
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
                levelNodes--;
            }
            System.out.println("");
        }
    }

    protected void visit(BTNode<T> p) {
        System.out.print(p.data + " ");
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    protected void inorderTraversal(BTNode node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        visit(node);
        inorderTraversal(node.right);
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    protected void postorderTraversal(BTNode node) {
        if (node == null)
            return;

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        visit(node);
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    protected void preorderTraversal(BTNode node) {
        if (node == null)
            return;

        visit(node);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public boolean search(T key) {
        if (root == null)
            return false;
        Queue<BTNode> queue = new LinkedList<BTNode>();
        BTNode node = root;
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (key.equals(node.data))
                return true;
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return false;
    }


    public void printTree() {
        printTree(root, "", true);
    }

    // Print the binary tree
    protected void printTree(BTNode currPtr, String indent, boolean last) {
        if (indent.equals(""))
            System.out.print("t");
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            System.out.println(currPtr.data);
            printTree(currPtr.left, indent, false);
            printTree(currPtr.right, indent, true);
        }
    }

    //******************************************************************************

    public boolean subtreesHaveEqualNumberOfNodes() {
        // starting from the root.
        return subtreesHaveEqualNumberOfNodes(root);
    }
    
    private boolean subtreesHaveEqualNumberOfNodes(BTNode<T> root) {
    
        // Base case: If the current subtree is empty (null), it has equal
        // numbers of nodes in its left and right subtrees.
        if (root == null) {
            return true;
        }
    
        // Calculate the number of nodes in the left and right subtrees.
        int leftSubtreeSize = getNumberOfNodes(root.left);
        int rightSubtreeSize = getNumberOfNodes(root.right);
    
        // Compare the sizes of the left and right subtrees.
        if (leftSubtreeSize != rightSubtreeSize) {
            // If the sizes are not equal, the current subtree doesn't have
            // an equal number of nodes in its left and right subtrees.
            return false;
        }
    
        // Recursively check the left and right subtrees.
        // If both subtrees have equal sizes, this subtree is also valid.
        return subtreesHaveEqualNumberOfNodes(root.left) && subtreesHaveEqualNumberOfNodes(root.right);
    }
    

    private int getNumberOfNodes(BTNode<T> root) {
        if (root == null) {
            return 0;
        }
        return 1 + getNumberOfNodes(root.left) + getNumberOfNodes(root.right);
    }


    public int numOneChildNodes() {
        
        // If the tree is empty (root is null), throw an exception.
        if (this.root == null) {
            throw new UnsupportedOperationException("The tree is empty.");
        }
        
        // Start the counting process by calling the private method on the root node.
        return numOneChildNodes(root);
    }
    
    private int numOneChildNodes(BTNode<T> node) {
        // Private recursive method to count the number of nodes with only one child.
    
        // Base case: If the current node is null, there are no one-child nodes here.
        if (node == null) {
            return 0;
        }
    
        int numOneChildNodes = 0;
    
        // Check if the current node has only one child (left or right).
        if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
            // If it has only one child, increment the count.
            numOneChildNodes++;
        }
    
        // Recursively count one-child nodes in the left and right subtrees.
        numOneChildNodes += numOneChildNodes(node.left);
        numOneChildNodes += numOneChildNodes(node.right);
    
        // Return the total count of one-child nodes in the subtree rooted at 'node'.
        return numOneChildNodes;
    }
    
}
