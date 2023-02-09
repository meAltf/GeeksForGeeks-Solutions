/******************************************************************************************************************************************************

Given three strings S, oldW and newW. Find all occurrences of the word oldW in S and replace them with word newW.

---------------------------------------------------------------------------------------

Example 1:

Input: 
S = "xxforxx xx for xx"
oldW = "xx"
newW = "Geeks"
Output: 
"geeksforgeeks geeks for geeks" 
Explanation: 
Replacing each "xx" with
"Geeks" in S.

Example 2:

Input: 
S = "india is the xx country"
oldW = "xx"
newW = "best"
Output: 
"india is the best country"
Explanation: 
Replacing each "xx" with
"best" in S.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java
class Solution {
    static String replaceAll(String str, String oldW, String newW) {
        // code here
        
        String ans = str.replaceAll(oldW, newW);
        return ans;
        
        
    }
}
