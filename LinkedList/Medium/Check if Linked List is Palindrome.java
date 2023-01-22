/*****************************************************************************************************************************************

Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1----true

Input:
N = 4
value[] = {1,2,3,4}
Output: 0----false


********************************************************************************************************************************************/

/****************************************

Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

************************************/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        
        int start = 0;
        int end = arr.size() - 1;
        while(start < end){
            if(arr.get(start) != arr.get(end)){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }    
}
