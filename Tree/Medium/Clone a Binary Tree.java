/******************************************************************************************************************************************************

Given a special binary tree having random pointers along with the usual left and right pointers. Clone the given tree.

---------------------------------------------------------------------------------------

Example 1:

Input:

Output: 1
Explanation: The tree was cloned successfully.


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

/*Complete the function below
Node is as follows:
class Tree{
	int data;
	Tree left,right,random;
	Tree(int d){
		data=d;
		left=null;
		right=null;
		random=null;
	}
}*/
class Solution{
    public Tree cloneTree(Tree tree){
       // add code here.
       
       if(tree == null) return null;
       
       Tree root = new Tree(tree.data);
       
       root.random = tree.random;
       
       root.left = cloneTree(tree.left);
       root.right = cloneTree(tree.right);
       
       return root;
    }
}
