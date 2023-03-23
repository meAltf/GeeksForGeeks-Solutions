/******************************************************************************************************************************************************

Given an integer array coins[ ] of size N representing different denominations of currency and an integer sum, 
find the number of ways you can make sum by using different combinations from coins[ ].  
Note: Assume that you have an infinite supply of each type of coin. 

---------------------------------------------------------------------------------------

Example 1:

Input:
sum = 4 , 
N = 3
coins[] = {1,2,3}
Output: 4
Explanation: Four Possible ways are:
{1,1,1,1},{1,1,2},{2,2},{1,3}.
Example 2:

Input:
Sum = 10 , 
N = 4
coins[] ={2,5,3,6}
Output: 5
Explanation: Five Possible ways are:
{2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} 
and {5,5}.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java

class Solution {
    
    private long helper(int arr[],int index,int sum,long[][] dp){
        
        if(index>=arr.length) return 0;
        if(sum == 0) return 1;
        if(sum<0) return 0;
        
        if(dp[index][sum]!=-1) return dp[index][sum];
        
        long take = helper(arr,index,sum-arr[index],dp);
        long not_take = helper(arr,index+1,sum,dp);
        
        return dp[index][sum] = take+not_take;
    }
    
    public long count(int coins[], int N, int sum) {
        
        long[][] dp = new long[N+1][sum+1];
        
        for(int i=0;i<=N;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j] = -1;
            }
        }
        return helper(coins,0,sum,dp);
    }
    
}
