/********************************************************************************************************************

Given a positive integer, N. Find the factorial of N.
 
------------------------------------------------------------------

Example 1:

Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
Example 2:

Input:
N = 4
Output:
24
Explanation:
4*3*2*1 = 24

---------------------------------------------------------------------

*************************************************************************************************************************/

class Solution{
    static long factorial(int n){
        // code here
        
        if(n==0)
            return 1;
        
        long smallAns = factorial(n-1);
        
        return n*smallAns;
    }
}
