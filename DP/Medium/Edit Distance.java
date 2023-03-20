/******************************************************************************************************************************************************
--------------------------
Level- Medium
--------------------------
Given two strings s and t. Return the minimum number of operations required to convert s to t.
The possible operations are permitted:

Insert a character at any position of the string.
Remove any character from the string.
Replace any character from the string with any other character.

---------------------------------------------------------------------------------------

Example 1:

Input: 
s = "geek", t = "gesek"
Output: 1
Explanation: One operation is required 
inserting 's' between two 'e's of s.
Example 2:

Input : 
s = "gfg", t = "gfg"
Output: 
0
Explanation: Both strings are same.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        
        // Find the lengths of both strings
		int m = s.length();
		int n = t.length();

		int[][] dp = new int[m + 1][n + 1];

		// Initializing dp for iterative approach

		//column filling
		for (int i = n; i >= 0; i--)
			dp[m][i] = n - i;

		//row filling
		for (int i = m; i >= 0; i--)
			dp[i][n] = m - i;


		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {

				if (s.charAt(i) == t.charAt(j)) {
					
					dp[i][j] = dp[i + 1][j + 1];
				} else {

					int ans1 = 1 + dp[i + 1][j + 1];
					int ans2 = 1 + dp[i][j + 1];
					int ans3 = 1 + dp[i + 1][j];

					dp[i][j] = Math.min(ans1, Math.min(ans2, ans3));
				}
			}
		}
		return dp[0][0];
    }
}
