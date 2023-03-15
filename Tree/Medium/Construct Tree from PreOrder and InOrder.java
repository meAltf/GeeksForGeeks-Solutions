/******************************************************************************************************************************************************

Given 2 Arrays of Inorder and preorder traversal. The tree can contain duplicate elements. Construct a tree and print the Postorder traversal. 

---------------------------------------------------------------------------------------
Example 1:

Input:
N = 4
inorder[] = {1 6 8 7}
preorder[] = {1 6 7 8}
Output: 8 7 6 1
Example 2:

Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


class Solution
{
    
    private static Node buildTreeHelper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd){
        
        if(preStart > preEnd || inStart > inEnd) return null;
        
        int rootVal = preOrder[preStart];
        
        Node root = new Node(rootVal);
        
        //find root element from inOrder array
        int k=0;
        for(int i=inStart; i<= inEnd; i++){
            if(rootVal == inOrder[i]){
                k=i;
                break;
            }
        }
        
        root.left = buildTreeHelper(preOrder, preStart+1, preStart+(k-inStart), inOrder, inStart, k-1);
        root.right = buildTreeHelper(preOrder, preStart+(k-inStart)+1, preEnd, inOrder, k+1, inEnd);
        
        return root;
    }
    
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        
        int preStart = 0;
        int preEnd = n-1;
        int inStart = 0;
        int inEnd = n-1;
        
        return buildTreeHelper(preorder, preStart, preEnd, inorder, inStart, inEnd);
    }
}
