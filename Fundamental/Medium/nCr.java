/******************************************************************************************************************************************************

Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 109+7.

---------------------------------------------------------------------------------------

Example 1:

Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 

Example 2:

Input: n = 2, r = 4
Output: 0
Explaination: r is greater than n.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


// User function Template for Java

class Solution{
    static int nCr(int n, int k){
         long C[] = new long[k + 1];
 
        // nC0 is 1
        C[0] = 1;
 
        for (int i = 1; i <= n; i++) {
            // Compute next row of pascal
            // triangle using the previous row
            for (int j = Math.min(i, k); j > 0; j--)
                C[j] = (C[j] + C[j - 1])%1000000007;
        }
        return (int)(C[k]%1000000007);
    }
}
        
