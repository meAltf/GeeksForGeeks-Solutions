/******************************************************************************************************************************************************

Given a Binary Search Tree. The task is to find the minimum valued element in this given BST.

---------------------------------------------------------------------------------------
Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
Example 2:

Input:
             9
              \
               10
                \
                 11
Output: 9

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        
        if(node == null) return -1;
        
        int min = Integer.MAX_VALUE;
        
        while(node.left != null) node = node.left;
        
        return node.data;
        
    }
}
