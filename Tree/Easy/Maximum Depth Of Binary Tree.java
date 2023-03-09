/******************************************************************************************************************************************************

Given a binary tree, find its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

---------------------------------------------------------------------------------------

Example 1:

Input:
            1
          /   \
         3     2
        /
       4           

Output: 3
Explanation:
Maximum depth is between nodes 1 and 4 since
maximum depth is defined as  the number of
nodes along the shortest path from the root
node down to the farthest leaf node.

Example 2:

Input:
             10
          /     \
        20       30
          \        \  
          40        60
                   /
                  2 

Output: 4

Explanation:
Maximum depth is between nodes 10 and 2 . 
Hence the path length from 10 to 2 is 4.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/*
// A Binary Tree node
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
  public static int maxDepth(Node root) {
    // code here
    if (root == null) {
        return 0;
    }
   
    return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));

  }
}
     
