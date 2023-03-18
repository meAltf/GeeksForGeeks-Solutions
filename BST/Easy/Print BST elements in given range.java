/******************************************************************************************************************************************************

Given a Binary Search Tree and a range [low, high]. Find all the numbers in the BST that lie in the given range.
Note: Element greater than or equal to root go to the right side.

---------------------------------------------------------------------------------------

Example 1:

Input:
       17
     /    \
    4     18
  /   \
 2     9 
l = 4, h = 24
Output: 4 9 17 18 
Example 2:

Input:
       16
     /    \
    7     20
  /   \
 1    10
l = 13, h = 23
Output: 16 20 

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution
{   
    
    private static void helper(Node root, int low, int high, ArrayList<Integer> result){
        
        if(root == null) return;
        
        if(root.data < low){
            helper(root.right, low, high,result);
        }else if(root.data > high){
            helper(root.left, low, high, result);
        }else{
            helper(root.left, low, high, result);
            result.add(root.data);
            helper(root.right, low, high, result);
        }
    }
    
    
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        helper(root, low,high, ans);
        
        return ans;
    }
    
}
