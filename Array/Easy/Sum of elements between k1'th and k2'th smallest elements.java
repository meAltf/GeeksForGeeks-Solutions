/******************************************************************************************************************************************************

Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements between K1th and K2th smallest elements of the array. 
It may be assumed that (1 <= k1 < k2 <= n).

---------------------------------------------------------------------------------------

Example 1:

Input:
N  = 7
A[] = {20, 8, 22, 4, 12, 10, 14}
K1 = 3, K2 = 6
Output:
26
Explanation:
3rd smallest element is 10
6th smallest element is 20
Element between 10 and 20 
12,14. Their sum = 26.

Example 2:

Input
N = 6
A[] = {10, 2, 50, 12, 48, 13}
K1= 2, K2 = 6
Output:
73

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java


class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        Arrays.sort(A);
        
        long sum = 0;
        
        for(long i=K1;i<K2-1;i++){
           sum+=A[(int)i];
        }
        return sum;
    }
    
}
