/******************************************************************************************************************************************************

Given a special Binary Tree whose leaf nodes are connected to form a circular doubly linked list. Find the height of this special Binary Tree.

---------------------------------------------------------------------------------------

Example 1:

Input:
        1
      /   \
     2     3
    /
   4
Output: 3
â€‹Explanation: There are 3 edges and 4
nodes in spiral tree where leaf nodes
4 and 3 are connected in circular
doubly linked list form. Thus the
height of spiral tree is 3.
Example 2:

Input:
        1
      /   \
     2     3
    / \
   4   5
  /
 6
Output: 4
----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Tree
{
    // Return the height of the given special binary tree
    public static int findTreeHeight(Node root)
        {
            if(root==null){
                return 0;
            }
            if(root.left!=null && (root.left.right==root || root.left.left==root)){
                return 1;
            }
            if(root.right!=null && (root.right.left==root || root.right.right==root)){
                return 1;
            }
            return 1+Math.max(findTreeHeight(root.left),findTreeHeight(root.right));
        }
}
