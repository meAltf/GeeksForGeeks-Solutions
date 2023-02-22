/******************************************************************************************************************************************************

Given a number N, the task is to count minimum steps to minimize it to 1 according to the following criteria:

If N is divisible by 2 then you may reduce N to N/2.
If N is divisible by 3 then you may reduce N to N/3.
Otherwise, Decrement N by 1.

---------------------------------------------------------------------------------------

Example 1:

Input: N = 10
Output: 3
Explanation: 10 - 1 = 9 / 3 = 3 / 3 = 1
Example 2:
Input: N = 1
Output: 0
Explanation: N is 1

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


class Solution{

	public int minSteps(int n) 
	{ 
	    // Your code goes here
	    
	    //base case
	    if(n==1) return 0;
	    
	    int[] dp = new int[n+1];
	    
	    dp[1] = 0;
	    
	    for(int i=2; i<=n; i++){
	        
	        int ans1 = Integer.MAX_VALUE;
	        int ans2 = Integer.MAX_VALUE;
	        int ans3 = Integer.MAX_VALUE;
	        
	        ans1 = dp[i-1];
	        if(i%2 == 0) ans2 = dp[i/2];
	        if(i%3 == 0) ans3 = dp[i/3];
	        
	        dp[i] = Math.min(ans1, Math.min(ans2, ans3))+1;
	    }
	    
	    return dp[n];
	} 
}
