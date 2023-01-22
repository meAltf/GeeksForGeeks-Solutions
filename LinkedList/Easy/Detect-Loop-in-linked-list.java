/****************************************************************************************************************************

Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

Example 1:

Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output: True

Example 2:

Input:
N = 4
value[] = {1,8,3,4}
x = 0
Output: False

********************************************************************************************************************************/



/*************************************************************************

Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

**************************************************************************/


class Solution {
  
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next !=null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            return true;
        }
        
        return false;
    }
}
