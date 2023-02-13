/******************************************************************************************************************************************************

You are given a stack St. You have to reverse the stack using recursion.

---------------------------------------------------------------------------------------


Example 1:

Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
Example 2:

Input:
St = {4,3,9,6}
Output:
{6,9,3,4}


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution
{ 
        static void reverse(Stack<Integer> s)
        {
            // add your code here
            
        ArrayList<Integer> arr=new ArrayList<>();
        
    	while(s.size()!=0){
    	    arr.add(s.pop());
    	}
    	
    	for(int i =0 ;i<arr.size();i++){
    	    s.push(arr.get(i));
    	}
            
        }
}
