/*******************************************************************************************************************

Create a link list of size N according to the given input literals. Each integer input is accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the beginning of the link list. If it is 1, insert the integer at the end of the link list. 
Hint: When inserting at the end, make sure that you handle NULL explicitly.

EXAMPLES-

LinkedList: 9->0->5->1->6->1->2->0->5->0
Output: 5 2 9 5 6

Input:
LinkedList: 5->1->6->1->9->1
Output: 5 6 9

********************************************************************************************************************/




/******************************************************

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

*******************************************************/



class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node newNode = new Node(x);
        if(head==null){
            newNode.next=head;
            head=newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node newNode = new Node(x);
        if(head==null){
            
            return newNode;
        } 
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            
            temp.next = newNode;
            newNode.next = null;
            
        return head;
    }
     
}
