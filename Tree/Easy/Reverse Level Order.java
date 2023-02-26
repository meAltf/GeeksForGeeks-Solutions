/******************************************************************************************************************************************************

Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

---------------------------------------------------------------------------------------

Example 1:

Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

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

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
       ArrayList<Integer> ans = new ArrayList<>();
       
       Queue<Node> nodeToAdd = new LinkedList<>();
            nodeToAdd.add(node);
       
       while(!nodeToAdd.isEmpty()){
           
           Node front = nodeToAdd.poll();
           ans.add(front.data);
           
           if(front.right != null) nodeToAdd.add(front.right);
           
           if(front.left != null)  nodeToAdd.add(front.left);
           
       }
       
      Collections.reverse(ans);
       return ans;
    }
}  
