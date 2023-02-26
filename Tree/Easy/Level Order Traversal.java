/******************************************************************************************************************************************************

Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.

---------------------------------------------------------------------------------------


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
       
       Queue<Node> nodeToAdd = new LinkedList<>();
            nodeToAdd.add(node);
       
       while(!nodeToAdd.isEmpty()){
           
           Node front = nodeToAdd.poll();
           ans.add(front.data);
           
           if(front.left != null) nodeToAdd.add(front.left);
           
           if(front.right != null)  nodeToAdd.add(front.right);
           
       }
       return ans;
    }
}

