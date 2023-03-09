/******************************************************************************************************************************************************

Given a binary tree of size N+1, your task is to complete the function tiltTree(), that return the tilt of the whole tree. 
The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values.
Null nodes are assigned tilt to be zero. Therefore, tilt of the whole tree is defined as the sum of all nodes’ tilt.

---------------------------------------------------------------------------------------


Examples 1:

Input: 
       1
      / \
     2   3
Output: 1
Explanation:
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1
Example 2:

Input:
        4 
       / \
      2   9 
     / \   \
    3   5   7 
Output: 15 
Explanation:
Tilt of node 3 : 0 
Tilt of node 5 : 0 
Tilt of node 7 : 0
Tilt of node 2 : |3-5| = 2 
Tilt of node 9 : |0-7| = 7 
Tilt of node 4 : |(3+5+2)-(9+7)| = 6 
Tilt of binary tree : 0 + 0 + 0 + 2 + 7 + 6 = 15

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
    
    int sum = 0;
    
    public int tiltTree(Node root){
      
       sum(root);
       
       return sum;
    }
    
    private int sum(Node root){
        
      if(root == null) return 0;
       
       int left = sum(root.left);
       int right = sum(root.right);
       
       sum += Math.abs(left-right);
       
       return left+right+root.data;
          
    }
}
