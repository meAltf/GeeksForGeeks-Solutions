/********************************************************************************************************

Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.

---------------------------------------------------

Example 1:

Input:
LinkedList: 25->36->47->58->69->80
data: 19
Output: 19 25 36 47 58 69 80

Example 2:

Input:
LinkedList: 50->100
data: 75
Output: 50 75 100

--------------------------------------------------

*********************************************************************************************************/

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        
        Node temp = new Node(key);
        
        //base case
        if(head1 == null){
            return temp;
        }
        
        if(key < head1.data){
            temp.next = head1;
            return temp;
        }
        
        Node curr = head1;
        
        while(curr.next != null && key > curr.next.data){
            curr= curr.next;
        }
        
        //make connection before use
        temp.next = curr.next;
        curr.next = temp;
        
        return head1;
    }
}
