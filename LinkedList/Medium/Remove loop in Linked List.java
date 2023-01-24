/*********************************************************************************************

Given a linked list of N nodes such that it may contain a loop.

A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.

Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.


--------------------------------------------------------------------------

Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1

Example 2:

Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: 1
--------------------------------------------------------------------------


**********************************************************************************************/

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        Node temp=head;
        
        HashMap<Node,Integer> map=new HashMap<>();
        
        while(temp.next!=null){
            
            if(map.containsKey(temp.next)){
                
                temp.next=null;
                break;
                
            }else{
                
                map.put(temp,0);
            }
            
            temp=temp.next;
        }
    }
}
