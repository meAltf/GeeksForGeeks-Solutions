/******************************************************************************************************************************************************

Given a Binary Search Tree and a node value X, find if the node with value X is present in the BST or not.

---------------------------------------------------------------------------------------

Example 1:

Input:         2
                \
                 81 
               /    \ 
             42      87 
              \       \ 
               66      90 
              / 
            45
X = 87
Output: 1
Explanation: As 87 is present in the
given nodes , so the output will be
1.
Example 2:

Input:      6
             \ 
              8 
             / \ 
            7   9
X = 11
Output: 0
Explanation: As 11 is not present in 
the given nodes , so the output will
be 0.


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        
        if(root == null) return false;
        
        if(root.data ==x) return true;
        
        if(x < root.data) return search(root.left, x);
        
        return search(root.right, x);
    }
}
