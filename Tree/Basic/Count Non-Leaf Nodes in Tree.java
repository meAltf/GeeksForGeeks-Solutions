/******************************************************************************************************************************************************

Given a Binary Tree of size N, your task is to complete the function countNonLeafNodes(), that should return the count of all the non-leaf nodes of the given binary tree.

---------------------------------------------------------------------------------------

Example:

Input: 
Image
Output:
2
Explanation:
Nodes 1 and 2 are the only non leaf nodes.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

//function should return the count of total number of non leaf nodes in the tree.
class Solution
{
    
	int countNonLeafNodes(Node root) {
	    //code here
	    
	    if(root == null) return 0;
	    
	    if(root.left == null && root.right == null) return 0;
	    
	    return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
	}
}
