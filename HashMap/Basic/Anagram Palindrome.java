/******************************************************************************************************************************************************

Given a string S, Check if characters of the given string can be rearranged to form a palindrome.
Note: You have to return 1 if it is possible to convert the given string into palindrome else return 0. 

---------------------------------------------------------------------------------------

Example 1:

Input:
S = "geeksogeeks"
Output: Yes
Explanation: The string can be converted
into a palindrome: geeksoskeeg

Example 2:

Input: 
S = "geeksforgeeks"
Output: No
Explanation: The given string can't be
converted into a palindrome.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Sol
{
    int isPossible (String s)
    {
        // your code here
        
        int[] m = new int[256];
    	for (int i = 0; i < s.length (); ++i)
    		m[(int)(s.charAt(i))]++;
    		
		
	    int odd_freq = 0;
    	for (int i = 0; i < 256; ++i)
    	{
    		if (m[i] % 2 == 1)
    			odd_freq++;
    		if (odd_freq > 1) return 0;
    	}
    	return 1;
    }
}
