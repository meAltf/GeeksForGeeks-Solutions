/******************************************************************************************************************************************************

Given a number d, representing the number of digits of a number. Find the total count of positive integers which have at-least one zero in them and consist d or 
less digits.

---------------------------------------------------------------------------------------

Example 1:

Input: d = 2
Output: 9 
Explanation: There are total 9 
positive integers which have 
at-least one zero in them 
and consist 2 or less digits.
Example 2:

Input: d = 3
Output: 180
Explanation: There are total 180
positive integers which have
at-least one zero in them
and consist 3 or less digits.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************


//User function Template for Java
class Solution {
    static long findCountUpto(long d){
        // code here
        long ans = 0;
       
        
        for(int di=2; di<=d; di++){
            ans = ((long)Math.pow(10,di-1) -1) + ans *9;
        }
        return ans;
        
    }
}
