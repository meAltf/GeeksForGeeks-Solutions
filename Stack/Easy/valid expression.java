/******************************************************************************************************************************************************

Given a string S, composed of different combinations of '(' , ')', '{', '}', '[', ']'. The task is to verify the validity of the arrangement.

An input string is valid if:

         1. Open brackets must be closed by the same type of brackets.
         2. Open brackets must be closed in the correct order.

---------------------------------------------------------------------------------------

Example 1:

Input:
S = ()[]{}
Output: 1
Explanation: The arrangement is valid.
 

Example 2:

Input:
S = ())({}
Output: 0
Explanation: Arrangement is not valid.
Example 3:

Input:
S = ([)]
Output: 0
Explanation: Arrangement is not valid.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        Stack<Character> j = new Stack<>();
        for(int i = 0 ; i<s.length(); i++){
            if(j.empty()){
                j.push(s.charAt(i));
            }
            else if((j.peek()== '(') && (s.charAt(i) == ')') || (j.peek()== '[') && (s.charAt(i) == ']') || (j.peek()== '{') && (s.charAt(i) == '}' )){
                j.pop();
            }
            else{
                j.push(s.charAt(i));
            }
        }
        if(j.size() == 0){
            return true;
        }
        else return false;
    }
} 
