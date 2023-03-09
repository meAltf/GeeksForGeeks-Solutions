/******************************************************************************************************************************************************

Given a binary tree, find the depth of the deepest odd level leaf node in a binary tree. If there is no leaf at odd level then return 0.
Consider that level starts with 1. Depth of a leaf node is number of nodes on the path from root to leaf (including both leaf and root).

---------------------------------------------------------------------------------------

Example 1:

Input: 
          1
        /    \
       2      3
      / \    / \
     4   5  6   7
Output: 3
Explanation: In the above tree 4,5,6 and 7 are
odd level leaf nodes at depth 3.So the answer is 3.
Example 2:

Input: 
     1
    / \
    2   4
Output: 0

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
    public static int depthOfOddLeaf(Node root)
    {
        //code here
        return util(root, 1);
    }
    
    private static int util(Node node, int level){
        if(node == null){
            return 0;
        }
        
        if(node.left == null && node.right == null && (level % 2) != 0){
            return level;
        }
        
        return Math.max(util(node.left, level+1), util(node.right, level+1));
    }
}
