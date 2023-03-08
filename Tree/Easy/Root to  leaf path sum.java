/******************************************************************************************************************************************************

Given a binary tree and an integer S, check whether there is root to leaf path with its sum as S.

---------------------------------------------------------------------------------------

Example 1:

Input:
Tree = 
            1
          /   \
        2      3
S = 2

Output: 0

Explanation:
There is no root to leaf path with sum 2.
Example 2:

Input:
Tree = 
            1
          /   \
        2      3
S = 4

Output: 1

Explanation:
The sum of path from leaf node 3 to root 1 is 4.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


/*
// A Binary Tree node
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

class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int S) {
        // Your code here
        
        if(root == null) return false;
        
        if(root.data == S && root.left == null && root.right == null) return true;
        
        boolean sum1 = hasPathSum(root.left, S-root.data);
        boolean sum2 = hasPathSum(root.right, S-root.data);
        
        return sum1 || sum2;
    }
}
