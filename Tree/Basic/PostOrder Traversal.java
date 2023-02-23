/******************************************************************************************************************************************************

Given a binary tree, find the Postorder Traversal of it.
For Example, the postorder traversal of the following tree is:
5 10 39 1

        1
     /     \
   10     39
  /
5


---------------------------------------------------------------------------------------

Example 1:

Input:
        19
     /     \
    10      8
  /    \
 11    13
Output: 11 13 10 8 19
Example 2:

Input:
          11
         /
       15
      /
     7
Output: 7 15 11


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java



//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    
    private static void postorderHelper(Node root,ArrayList<Integer> output){
        
        if(root==null) return;
        
        postorderHelper(root.left,output);
        
        postorderHelper(root.right,output);
        
        output.add(root.data);
        
    }
    
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> output= new ArrayList<>();
        
        postorderHelper(root,output);
        
        return output;
    }
}
