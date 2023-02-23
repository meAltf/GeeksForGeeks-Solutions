/******************************************************************************************************************************************************

Given a Binary Tree, find the In-Order Traversal of it.

---------------------------------------------------------------------------------------

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

Example 2:

Input:
        10
     /      \ 
    20       30 
  /    \    /
 40    60  50
Output: 40 20 60 10 50 30

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    
    private static void inorderHelper(Node root,ArrayList<Integer> output){
        
        if(root==null) return;
        
        inorderHelper(root.left,output);
        
        output.add(root.data);
        
        inorderHelper(root.right,output);
        
    }
    
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        
        ArrayList<Integer> output= new ArrayList<>();
        
        inorderHelper(root,output);
        
        return output;
    }
}
