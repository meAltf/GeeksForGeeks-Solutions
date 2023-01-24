/*******************************************************************************************************

Given a linked list, delete N nodes after skipping M nodes of a linked list until the last of the linked list.

---------------------------------------------------------------------------------

Example:

Input:
2
8
2 1
9 1 3 5 9 4 10 1
6
6 1
1 2 3 4 5 6 

Output: 
9 1 5 9 10 1
1 2 3 4 5 6

Explanation:
Deleting one node after skipping the M nodes each time, we have list as 9-> 1-> 5-> 9-> 10-> 1.

---------------------------------------------------------------------------------


*********************************************************************************************************/


//User function Template for Java

/*
delete n nodes after m nodes
The input list will have at least one element  
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        if(head==null)
            return;
        if(M==0)
            return;
        if(N==0)
            return;
        
        Node curr=head;
        Node temp=null;

        while(curr!=null){

        for(int Mcount=1; Mcount<M && curr!=null; Mcount++){
            curr=curr.next;
        }

        if(curr==null){
            return;
        }

        temp=curr.next;

        for(int Ncount=1; Ncount<=N && temp!=null; Ncount++){

            temp=temp.next;
        }

        curr.next=temp;
        curr=temp;
        }

        return;
        
    }
}
