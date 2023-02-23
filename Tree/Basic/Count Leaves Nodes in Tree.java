/******************************************************************************************************************************************************

Given a Binary Tree of size N, You have to count leaves in it. For example, there are two leaves in following tree

        1
     /      \
   10      39
  /
5


---------------------------------------------------------------------------------------

Example 1:


Input:
Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3
Explanation: 
Three leaves are 3 , 5 and 1.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         
        if(node == null) return 0;
        
        if(node.left == null && node.right == null) return 1;
        
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
