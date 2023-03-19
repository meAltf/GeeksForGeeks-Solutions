/******************************************************************************************************************************************************
----------------------------
Level- Easy
----------------------------
Given a Binary search tree. Your task is to complete the function which will return the Kth largest element without doing
any modification in Binary Search Tree.

---------------------------------------------------------------------------------------

Example 1:

Input:
      4
    /   \
   2     9
k = 2 
Output: 4

Example 2:

Input:
       9
        \ 
          10
K = 1
Output: 10

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    
    private void inorder(Node root, ArrayList<Integer>list){
        
        if(root ==null) return;
        
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right,list);
    }
    
    
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null) return 0;
        
        inorder(root, list);
        
        return list.get(list.size()-K);
        
    }
}
