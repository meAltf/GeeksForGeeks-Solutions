/******************************************************************************************************************************************************

Implement a Queue using two stack s1 and s2.

---------------------------------------------------------------------------------------

Example 1:

Input:
enqueue(2)
enqueue(3)
dequeue()
enqueue(4)
dequeue()
Output: 2 3
Explanation:
enqueue(2) the queue will be {2}
enqueue(3) the queue will be {3 2}
dequeue() the poped element will be 2 
the stack will be {3}
enqueue(4) the stack will be {4 3}
dequeue() the poped element will be 3.  
Example 2:

Input:
enqueue(2)
dequeue()
dequeue()
Output: 2 -1

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    
	    while(input.size() > 1)
	    {
	        output.push(input.pop());
	    }
	    int val = input.pop();
	    
	    while(output.size() > 0)
	    {
	        input.push(output.pop());
	    }
	    return val;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	     input.push(x);
    }
}
