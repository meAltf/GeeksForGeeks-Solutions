/******************************************************************************************************************************************************
------------------------
Level- Hard
-----------------------
Given a AVL tree and N values to be inserted in the tree. Write a function to insert a given value into the tree.

---------------------------------------------------------------------------------------
Example 1:

N = 3
Values to be inserted = {5,1,4}

Input:      
Value to be inserted = 5
Output:
    5

Input :      
Value to be inserted = 1
Output:
    5
   /
  1

Input :      
Value to be inserted = 4
Output:
  5                     4
 /   LR rotation       / \
1   ----------->      1   5
 \
 4


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    int height;
};
*/
class Solution
{ static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }
    
    static int calculateBalanceFactor(Node root) {
        if (root == null) {
            return 0;
        }
        
        return height(root.left) - height(root.right);
    }
    
    Node rotateRight(Node x) {
        if (x == null) {
            return x;
        }
        
        Node y = x.left;
        Node yR = y.right;
        
        // Perform rotation
        x.left = yR;
        y.right = x;
        
        // Update heights --> order of height updation is important
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        
        return y;
    }
    
    Node rotateLeft(Node x) {
        if (x == null) {
            return x;
        }
        
        Node y = x.right;
        Node yL = y.left;
        
        // Perform Rotation
        x.right = yL;
        y.left = x;
        
        // Update heights
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        
        return y;
    }
    
    
    public  Node insertToAVL(Node root, int data) {
        /* I. Apply Normal BST Insertion */
        
        // Base Case
        if (root == null) {
            return new Node(data);
        }
        
        if (data < root.data) {
            root.left = insertToAVL(root.left, data);
        } else if (data > root.data) {
            root.right = insertToAVL(root.right, data);
        } else { // data == root.data => duplicates are nt allowed
            return root;
        }
        
        /* II. Update current node's height */
        root.height = 1 + Math.max(height(root.left), height(root.right));
        
        /* III. Calculate the Balance Factor of the current node */
        int balance = calculateBalanceFactor(root);
        
        /* IV. Check for cases of rotation */
        
        // Left Imbalance
        if (balance > 1) {
            // Right GrandChild is Greater --> Left Right Imbalance
            if (data > root.left.data) {
                root.left = rotateLeft(root.left);
            }
            // Common step for both LL and LR
            return rotateRight(root);
        }
        
        // Right Imbalance
        if (balance < -1) {
            // Left Grandhild is Lesser --> Right Left Imbalance
            if (data < root.right.data) {
                root.right = rotateRight(root.right);
            }
            // Common step for both RR and RL
            return rotateLeft(root);
        }
        
        return root;
    }
}  
