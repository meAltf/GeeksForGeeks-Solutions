/******************************************************************************************************************************************************

Given a binary tree, find its height.

---------------------------------------------------------------------------------------

Example 1:

Input:
     1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3   

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node == null) return 0;
        
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
