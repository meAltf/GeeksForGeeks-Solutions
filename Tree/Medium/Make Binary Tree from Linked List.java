/******************************************************************************************************************************************************

Given a Linked List Representation of Complete Binary Tree. The task is to construct the Binary tree.
Note : The complete binary tree is represented as a linked list in a way where if root node is stored at position i, its left, and right children
are stored at position 2*i+1, 2*i+2 respectively.
 
---------------------------------------------------------------------------------------


Example 1:

Input:
N = 5
K = 1->2->3->4->5
Output: 1 2 3 4 5
Explanation: The tree would look like
      1
    /   \
   2     3
 /  \
4   5
Now, the level order traversal of
the above tree is 1 2 3 4 5.
Example 2:

Input:
N = 5
K = 5->4->3->2->1
Output: 5 4 3 2 1
Explanation: The tree would look like
     5
   /  \
  4    3
 / \
2    1
Now, the level order traversal of
the above tree is 5 4 3 2 1.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/


class GfG 
{
    //Function to make binary tree from linked list.
    
    private static Tree makeTree(ArrayList<Integer> list, int i){
        
        if(i >= list.size()) return null;
        
        Tree newNode = new Tree(list.get(i));
        
        newNode.left =  makeTree(list, 2*i+1);
        
        newNode.right = makeTree(list, 2*i+2);
        
        return newNode;
    }
    
    public static Tree convert(Node head, Tree node) {
        // add code here
        
        if(head == null) return null;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(head != null){
            list.add(head.data);
            head = head.next;
        }
        
        return makeTree(list,0);
    }
}  
