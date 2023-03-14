/******************************************************************************************************************************************************

Given a binary tree. Find the postorder traversal of the tree without using recursion.

---------------------------------------------------------------------------------------
Example 1

Input:
           1
         /   \
        2     3
      /  \
     4    5

Output: 4 5 2 3 1
Explanation:
Postorder traversal (Left->Right->Root) of 
the tree is 4 5 2 3 1.
Example 2

Input:

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        if(root == null) return result;
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            
            Node curr = stack.pop();
            
            result.add(0,curr.data);
            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
            
        }
        //Collections.reverse(result);
        return result;
    }
}
