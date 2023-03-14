/******************************************************************************************************************************************************

Given a Binary Tree of N edges. The task is to convert this to a Circular Doubly Linked List(CDLL) in-place.
The left and right pointers in nodes are to be used as previous and next pointers respectively in converted CDLL. 
The order of nodes in CDLL must be same as Inorder of the given Binary Tree. 
The first node of Inorder traversal (left most node in BT) must be head node of the CDLL.

---------------------------------------------------------------------------------------
Example 1:

Input:
      1
    /   \
   3     2
Output:
3 1 2 
2 1 3
Explanation: After converting tree to CDLL
when CDLL is is traversed from head to
tail and then tail to head, elements
are displayed as in the output.
Example 2:

Input:
     10
   /    \
  20    30
 /  \
40  60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:After converting tree to CDLL,
when CDLL is is traversed from head to
tail and then tail to head, elements
are displayed as in the output.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
    static Node head;
    static Node prev = null;
    Node bTreeToClist(Node root)
    {
        inOrder(root);
        prev.right = head;
        head.left = prev;
        prev = null;
        return head;
    }
    
    void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        
        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        inOrder(root.right);
    }
    
}
 
