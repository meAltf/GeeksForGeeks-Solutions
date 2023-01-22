/****************************************************************************************************************************************


Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

Note: H is the height of the tree and this space is used implicitly for the recursion stack.

Example 1:

Input:
      1
    /  \
   3    2
Output:
3 1 2 
2 1 3 
Explanation: DLL would be 3<=>1<=>2


Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:  DLL would be 
40<=>20<=>60<=>10<=>30.


*******************************************************************************************************************************************/

//User function Template for Java

/*********************************** 

class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}
***********************************/

//This function should return head to the DLL(Doubly Linked List) 

class Solution
{
    Node head = null, prev = null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
    
	    //Your code here	
	    if(root == null) return null;
	    
	    bToDLL(root.left);
	    if(head == null) {
      
	        head = root;
	        prev = root;
	    } else {
      
	        root.left = prev;
	        prev.right = root;
	        prev = root;
	    }
	    bToDLL(root.right);
	    return head;
    }
}
