/******************************************************************************************************************************************************

Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

---------------------------------------------------------------------------------------

Example 1:

Input:
6
4 3 1 10 2 6

Output: 
6 2 10 1 3 4

Explanation: 
After reversing the given
elements of the queue , the resultant
queue will be 6 2 10 1 3 4.
Example 2:

Input:
4
4 3 2 1 

Output: 
1 2 3 4

Explanation: 
After reversing the given
elements of the queue , the resultant
queue will be 1 2 3 4.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        
        //base case
        if(q.size() ==0) return q;
        
        int temp = q.poll();
        
        rev(q);
        
         q.add(temp);
        
        return q;
    }
}
