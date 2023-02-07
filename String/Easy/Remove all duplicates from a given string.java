/******************************************************************************************************************************************************

Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. 
The order of remaining characters in the output should be same as in the original string.

---------------------------------------------------------------------------------------

Example 1:

Input:
Str = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate
characters such as e, k, g, s, we have
string as "geksfor".

Example 2:

Input:
Str = HappyNewYear
Output: HapyNewYr
Explanation: After removing duplicate
characters such as p, e, a, we have
string as "HapyNewYr".

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        
       ArrayList<Character> li=new ArrayList<>();
       
        for(int i=0;i<str.length();i++){
            
            if(!li.contains(str.charAt(i))){
                
                li.add(str.charAt(i));
            }
        }
        
        String res="";
        
        for(int i=0;i<li.size();i++){
            
            res+=li.get(i);
        }
        return res;
    }
}
