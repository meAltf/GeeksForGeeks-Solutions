/******************************************************************************************************************************************************

Given a Binary Tree, write a function to check whether the given Binary Tree is a prefect Binary Tree or not. A Binary tree is Perfect Binary Tree
in which all internal nodes have two children and all leaves are at same level.

---------------------------------------------------------------------------------------

Example 1:

Input: 
          7
      /  \
     4    9
Output: YES
Explanation: 
As the root node 7 has two children and 
two leaf nodes 4 and 9 are at same level 
so it is a perfect binary tree.
Example 2:

Input: 
                   7
              /   \
             3     8
           /   \     \
          2     5     10
        /
       1
Output: NO

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class Solution{
    public boolean isPerfect(Node root){
        //code here
        
        if(root==null) return true;
         if(root.left==null&&root.right==null) return true;
         
         if(root.left==null||root.right==null) return false;
         
         if(root.left.left!=null&&root.right.right==null) return false;
         
         if(root.left.left==null&&root.right.right!=null) return false;
         
         if(root.left!=null && root.right!=null){
             
            return isPerfect(root.left) && isPerfect(root.right);
        }
        
        return false;
         
    }
}
