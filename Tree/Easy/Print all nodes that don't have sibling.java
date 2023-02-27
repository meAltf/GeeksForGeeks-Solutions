/******************************************************************************************************************************************************

Given a Binary Tree of size N, find all the nodes which don't have any sibling. You need to return a list of integers containing all the nodes that
don't have a sibling in sorted order.

Note: Root node can not have a sibling so it cannot be included in our answer.

---------------------------------------------------------------------------------------

Example 1:

Input :
       37
      /   
    20
    /     
  113 

Output: 20 113
Explanation: 20 and 113 dont have any siblings.

Example 2:

Input :
       1
      / \
     2   3 

Output: -1
Explanation: Every node has a sibling.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/*  A Binary Tree nodea
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
    private void noSiblingHelper(Node node, ArrayList<Integer>result){
        if(node == null) return;
        
        if(node.left !=null && node.right == null) result.add(node.left.data);
        
        if(node.left == null && node.right != null) result.add(node.right.data);
        
        noSiblingHelper(node.left, result);
        noSiblingHelper(node.right, result);
        
    }
    
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        
        noSiblingHelper(node,ans);
        
        if(ans.size()==0){
            ans.add(-1);
            return ans;
        }
        
        Collections.sort(ans);
        return ans;
        
    }
}
