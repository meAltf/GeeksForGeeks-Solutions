/******************************************************************************************************************************************************

Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same.

---------------------------------------------------------------------------------------

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence

Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first
occurrence

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        
        ArrayList<Character> al =new ArrayList<>();

        for(int i=0; i<S.length(); i++){

            if(!al.contains(S.charAt(i))){

                al.add(S.charAt(i));

            }

        }

        String ans ="";

        for(int i =0; i<al.size(); i++){

            ans+=al.get(i);

        }

        return ans;
    }
}
