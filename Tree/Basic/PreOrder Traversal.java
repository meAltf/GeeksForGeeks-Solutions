/******************************************************************************************************************************************************

Given a binary tree, find its preorder traversal.

---------------------------------------------------------------------------------------

Example 1:

Input:
        1      
      /          
    4    
  /    \   
4       2
Output: 1 4 4 2 
Example 2:

Input:
       6
     /   \
    3     2
     \   / 
      1 2
Output: 6 3 1 2 2 

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    private static void preorderHelper(Node root,ArrayList<Integer> output){
        
        if(root==null) return;
        
        output.add(root.data);
        
        preorderHelper(root.left,output);
        
        preorderHelper(root.right,output);
        
    }
    
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        
        ArrayList<Integer> output= new ArrayList<>();
        
        preorderHelper(root,output);
        
        return output;
    }

}
