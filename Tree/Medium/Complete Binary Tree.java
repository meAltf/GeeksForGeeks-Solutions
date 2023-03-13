/******************************************************************************************************************************************************

Given a Binary Tree, write a function to check whether the given Binary Tree is Complete Binary Tree or not.
A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, 
and all nodes should be as much close to left as possible.

---------------------------------------------------------------------------------------

Example 1:
Input:
       1
      / \
     2   3
Output:
Complete Binary Tree
Example 2:

Input:
              1
            /   \
          2      3
           \    /  \
            4  5    6
Output:
Not Complete Binary Tree

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG
{
	boolean isCompleteBT(Node root)
    {
          //add code here.
          
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        
        boolean foundNull = false;
        
        while(!q.isEmpty()){
            Node temp = q.poll();
            
            if(temp==null){
                foundNull=true;
                continue;
            }
            else if(foundNull==true)
                return false;
                
            q.add(temp.left);
            q.add(temp.right);
        }
        return true;
	} 
}
