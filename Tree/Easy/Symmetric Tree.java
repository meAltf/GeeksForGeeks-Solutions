/******************************************************************************************************************************************************

Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.

---------------------------------------------------------------------------------------

Example 1:

Input:
         5
       /   \
      1     1
     /       \
    2         2
Output: True
Explanation: Tree is mirror image of
itself i.e. tree is symmetric
Example 2:

Input:
         5
       /   \
      10     10
     /  \     \
    20  20     30
Output: False

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
// complete this function
// return true/false if the is Symmetric or not
class GfG
{
    private static boolean isSymmetricHelper(Node root1, Node root2){
        if(root1 == null && root2==null) return true;
        
        if (root1 != null && root2 != null && root1.data == root2.data) 
            return (isSymmetricHelper(root1.left, root2.right) 
                    && isSymmetricHelper(root1.right, root2.left)); 
            
        return false;
        
    }
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root == null) return true;
        
        return isSymmetricHelper(root, root);
        
        
    }
}
