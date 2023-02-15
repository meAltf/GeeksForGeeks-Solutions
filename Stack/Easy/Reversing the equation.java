/******************************************************************************************************************************************************

Given a mathematical equation using numbers/variables and +, -, *, /. Print the equation in reverse.

---------------------------------------------------------------------------------------

Example 1:

Input:
S = "20-3+5*2"
Output: 2*5+3-20
Explanation: The equation is reversed with
numbers remaining the same.
â€‹Example 2:

Input: 
S = "a+b*c-d/e"
Output: e/d-c*b+a
Explanation: The equation is reversed with
variables remaining the same.


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution
{
   
    String reverseEqn(String s)
    {
        // your code here
        
        String result = "", str = "";
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '/' || s.charAt(i) == '*')
            {
                result = s.charAt(i) + str + result;
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        
        result = str + result;
        
        return result;
    }
}
