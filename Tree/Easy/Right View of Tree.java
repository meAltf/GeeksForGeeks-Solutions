/******************************************************************************************************************************************************

Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

---------------------------------------------------------------------------------------

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2
Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java


/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    
    private void rightViewHelper(Node root, ArrayList<Integer> result, int level){
        
        if(root == null) return;
        
        if(result.size() == level) result.add(root.data);
        
        rightViewHelper(root.right, result, level+1);
        rightViewHelper(root.left, result, level+1);
        
        
    }
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        
         
        
        rightViewHelper(node, ans,0);
        
        return ans;
    }
}
