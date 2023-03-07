/******************************************************************************************************************************************************
------------------------
LEVEL- EASY
--------------------------

Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes at any level.
For example, the maximum width of the following tree is 4 as there are 4 nodes at the 3rd level.

          1
       /     \
     2        3
   /    \    /    \
  4    5   6    7
    \
      8

---------------------------------------------------------------------------------------

Example 1:

Input:
       1
     /    \
    2      3
Output: 2
On the first level there is only
one node 1
On the second level there are
two nodes 2, 3 clearly it is the 
maximum number of nodes at any level

Example 2:

Input:
        10
      /     \
    20      30
   /    \
  40    60
Output: 2
There is one node on level 1(10)
There is two node on level 2(20, 30)
There is two node on level 3(40, 60)
Hence the answer is 2


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


// User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        if(root == null) return 0;
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int maxCount = Integer.MIN_VALUE;
        
        
        while(!queue.isEmpty()){
            int count = 0;
            int queueSize = queue.size();
            
            for(int i=0; i<queueSize; i++){
                
                Node front = queue.poll();
                count++;
            
                if(front.left != null){
                    queue.add(front.left);
                }
                
                if(front.right != null){
                    queue.add(front.right);
                }
            }
            
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
