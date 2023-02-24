/******************************************************************************************************************************************************

Given a Binary Tree of size N. The task is to complete the function sumLeaf(), that should return the sum of all the leaf nodes of the given binary tree.

---------------------------------------------------------------------------------------

Example:
Input:
2
2
1 2 L 1 3 R
5
10 20 L 10 30 R 20 40 L 20 60 R 30 90 L

Output:
5
190

Explanation:
Testcase 1: Leaf nodes in the tree are 2 and 3, and their sum is 5.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class GfG
{
    public int SumofLeafNodes(Node root)
    {
        // your code here
        if(root == null) return 0;
        
        if(root.left == null && root.right == null) return root.data;
        
        return  SumofLeafNodes(root.left) + SumofLeafNodes(root.right);
    }
}
