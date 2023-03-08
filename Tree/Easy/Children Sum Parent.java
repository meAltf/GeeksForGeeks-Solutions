/******************************************************************************************************************************************************

Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.

---------------------------------------------------------------------------------------


Example 1:

Input:
     10
    /
  10 
Output: 1
Explanation: Here, every node is sum of
its left and right child.
Example 2:

Input:
       1
     /   \
    4     3
   /  \
  5    N
Output: 0
Explanation: Here, 1 is the root node
and 4, 3 are its child nodes. 4 + 3 =
7 which is not equal to the value of
root node. Hence, this tree does not
satisfy the given conditions.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null ||(root.left==null && root.right==null)){
            return 1;
        }
        int sum=0;
        if(root.left==null){
            sum=root.right.data;
        }
        if(root.right==null){
            sum=root.left.data;
        }
        if(root.left!=null && root.right!=null){
            sum=root.right.data+root.left.data;
        }
        if(root.data!=sum){
            return 0;
        }
        if(isSumProperty(root.left)==1 && isSumProperty(root.right)==1){
            return 1;
        }else{
            return 0;
        }
    }
}
