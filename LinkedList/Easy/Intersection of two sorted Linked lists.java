/***********************************************************************************************************************

Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. 
The new linked list should be made with its own memory the original lists should not be changed.
Note: The linked list elements are not necessarily distinct.

-------------------------------------------------------------------------

Example 1:

Input:
L1 = 1->2->3->4->6
L2 = 2->4->6->8

Output: 2 4 6
Explanation: For the given first two
linked list, 2, 4 and 6 are the elements
in the intersection.

Example 2:

Input:
L1 = 10->20->40->50
L2 = 15->40

Output: 40

------------------------------------------------------------------------

*************************************************************************************************************************/

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node dummy=null;

        Node tail=null;

       

        // code here.

        Node p=head1,q=head2;

        while(p!=null && q!=null)

        {

            if(p.data==q.data){

                //push(p.data);

                 Node temp=new Node(p.data);

        if(dummy==null){

            dummy=temp;

            tail=temp;

        }

        else{

            tail.next=temp;

            tail=temp;

        }

                p=p.next;

                q=q.next;

            }

           else if(p.data<q.data){

                p=p.next;

            }

            else{

                q=q.next;

            }

        }

        return dummy;
    }
}
