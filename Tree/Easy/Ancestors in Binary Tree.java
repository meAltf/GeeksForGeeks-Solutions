/******************************************************************************************************************************************************

Given a Binary Tree and a target key, you need to find all the ancestors of the given target key.

              1
            /   \
          2      3
        /  \
      4     5
     /
    7
Key: 7
Ancestor: 4 2 1

---------------------------------------------------------------------------------------

Example 1:

Input:
        1
      /   \
     2     3
target = 2
Output: 1
Example 2:

Input:
         1
       /   \
      2     3
    /  \   /  \
   4    5 6    8
  /
 7
target = 7
Output: 4 2 1

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution
{
    private static boolean ancestors(Node root, int target, ArrayList<Integer> arrList) {
        
        if ( root == null ) return false;
        if ( root.data == target ) return true;
        
        if ( ancestors(root.left, target, arrList) || ancestors(root.right, target, arrList) ) {
            arrList.add(root.data);
            return true;
        }
        
        return false;
    }
    
    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        // add your code here
        ArrayList<Integer> arrList = new ArrayList<>();
        ancestors(root, target, arrList);
        return arrList;
    }
}
