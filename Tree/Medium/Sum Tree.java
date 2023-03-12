/******************************************************************************************************************************************************

Given a Binary Tree. Return true if, for every node X in the tree other than the leaves, its value is equal to the sum of its left subtree's value
and its right subtree's value. Else return false.

An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.

---------------------------------------------------------------------------------------

Example 1:

Input:
    3
  /   \    
 1     2

Output: 1
Explanation:
The sum of left subtree and right subtree is
1 + 2 = 3, which is the value of the root node.
Therefore,the given binary tree is a sum tree.
Example 2:

Input:

          10
        /    \
      20      30
    /   \ 
   10    10

Output: 0
Explanation:
The given tree is not a sum tree.
For the root node, sum of elements
in left subtree is 40 and sum of elements
in right subtree is 30. Root element = 10
which is not equal to 30+40.


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


/* A Binary Tree node
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
class Solution
{
	boolean isSumTree(Node root)
	{
             // Your code here
            
        int sum=0;

        if(root==null) return true;

        if(root.left==null && root.right==null) return true;

        isSumTree(root.left);

        isSumTree(root.right);
    
        if(root.left!=null) sum += root.left.data;

        if(root.right!=null) sum += root.right.data;

        if(root.data!=sum) return false;

        root.data+=sum;
        return true;

	}
}
