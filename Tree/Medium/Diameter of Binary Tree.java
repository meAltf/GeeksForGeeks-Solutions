/******************************************************************************************************************************************************

The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. 
The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded 
(note that there is more than one path in each tree of length nine, but no path longer than nine nodes). 

---------------------------------------------------------------------------------------

Example 1:

Input:
       1
     /  \
    2    3
Output: 3
Example 2:

Input:
         10
        /   \
      20    30
    /   \ 
   40   60
Output: 4

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    
    private int height(Node root){
        if(root == null) return 0;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        if(leftHeight > rightHeight) return leftHeight+1;
        
        return rightHeight +1;
    }
    
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        
        if(root == null) return 0;
        
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;
        
        int diameter = Math.max(diameter1, Math.max(diameter2, diameter3));
        
        return diameter;
        
    }
}
