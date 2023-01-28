/*******************************************************************************************************************

Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

--------------------------------------------------------
Example 1:

Input: N = 1
Output: YES
Explanation:1 is equal to 2 
raised to 0 (20 = 1).
Example 2:

Input: N = 98
Output: NO
Explanation: 98 cannot be obtained
by any power of 2.

--------------------------------------------------------

**********************************************************************************************************************/

//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n==0){
        return false;
        }
    
        //We use a counter variable to count number of set bits.
        int count = 0;
        while(n>0)
        {
            //Increment of counter variable if we get 1 as the rightmost bit.
            count+=(n&1);
            //Right Shift n to remove the rightmost bit.
            n>>=1;
        }
        //returning true if number of set bits is 1 otherwise false.
        return count==1;
        }
        
    
}
