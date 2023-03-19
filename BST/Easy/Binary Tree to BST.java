/******************************************************************************************************************************************************
-----------------------
Level- Easy
-----------------------
Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.

--------------------------------------------------------------------------------------- 

Example 1:

Input:
      1
    /   \
   2     3
Output: 1 2 3

Example 2:

Input:
          1
       /    \
     2       3
   /        
 4       
Output: 1 2 3 4
Explanation:
The converted BST will be

        3
      /   \
    2     4
  /
 1

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       ArrayList<Integer> list=new ArrayList<>();
       inOrder(root,list);
       Collections.sort(list);
       
       return solve(list, 0, list.size()-1);
    }
    
    void inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }
    
    Node solve(ArrayList<Integer> list, int left, int right){
        if(left > right){
            return null;
        }
        
        int mid=(left+right)/2;
        Node node=new Node(list.get(mid));
        
        node.left=solve(list,left,mid-1);
        node.right=solve(list,mid+1,right);
        
        return node;
    }
}
