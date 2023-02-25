/******************************************************************************************************************************************************

Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. 
The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

---------------------------------------------------------------------------------------

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

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
}*/
class Tree
{
    private void leftViewHelper(Node root, ArrayList<Integer> res, int level){
        
        if(root == null) return;
        
        if(res.size() == level) res.add(root.data);
        
        leftViewHelper(root.left, res, level+1);
        leftViewHelper(root.right, res, level+1);
        
    }
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result = new ArrayList<Integer>();
      
      leftViewHelper(root, result, 0);
      
      return result;
      
    }
}
