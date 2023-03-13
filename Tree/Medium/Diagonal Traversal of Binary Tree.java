/******************************************************************************************************************************************************

Given a Binary Tree, print the diagonal traversal of the binary tree.

Consider lines of slope -1 passing between nodes. Given a Binary Tree, print all diagonal elements in a binary tree belonging to same line.
If the diagonal element are present in two different subtress then left subtree diagonal element should be taken first and then right subtree. 

---------------------------------------------------------------------------------------
Example 1:

Input :
            8
         /     \
        3      10
      /   \      \
     1     6     14
         /   \   /
        4     7 13
Output : 8 10 14 3 6 7 13 1 4
Explanation:
unnamed
Diagonal Traversal of binary tree : 
 8 10 14 3 6 7 13 1 4


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           if(root == null) return null;
           
           Queue<Node> queue = new LinkedList<>();
           queue.add(root);
           
           ArrayList<Integer> diagonalNode = new ArrayList<>();
           
           while(!queue.isEmpty()){
               
               Node front = queue.poll();
               
               while(front != null){
                   
                   diagonalNode.add(front.data);
                   
                   if(front.left != null) queue.add(front.left);
                   
                   front = front.right;
               }
           }
           return diagonalNode;
      }
}
