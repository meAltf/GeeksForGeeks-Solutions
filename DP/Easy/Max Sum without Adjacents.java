/******************************************************************************************************************************************************

Given an array Arr of size N containing positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 6
Arr[] = {5, 5, 10, 100, 10, 5}
Output: 110
Explanation: If you take indices 0, 3
and 5, then Arr[0]+Arr[3]+Arr[5] =
5+100+5 = 110.
Example 2:

Input:
N = 4
Arr[] = {3, 2, 7, 10}
Output: 13
Explanation: 3 and 10 forms a non
continuous  subsequence with maximum
sum.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        
        //special case
        if(n==0) return 0;
        
        if(n==1) return arr[0];
        
        int[] dp = new int[n];
        
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        for(int i=2; i<n; i++){
            
            dp[i] = Math.max(dp[i-1], (arr[i] + dp[i-2]));
        }
        
        return dp[n-1];
    }
}
