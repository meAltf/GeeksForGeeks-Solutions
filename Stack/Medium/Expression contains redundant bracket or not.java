/******************************************************************************************************************************************************
------------------
Level- Medium
------------------
Given a string of balanced expression, find if it contains a redundant parenthesis or not. A set of parenthesis are redundant 
if the same sub-expression is surrounded by unnecessary or multiple brackets. Print Yes if redundant, else No.
Note: Expression may contain + , - , *, and / operators. Given expression is valid and there are no white spaces present.


---------------------------------------------------------------------------------------

Example 1:

Input:
exp = ((a+b))
Output:
Yes
Explanation:
((a+b)) can reduced to (a+b).
Example 2:

Input:
exp = (a+b+(c+d))
Output:
No
Explanation:
(a+b+(c+d)) doesn't have any redundant or multiple
brackets.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    public static int checkRedundancy(String str) {
        // code here
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch==')'){
                
                if(st.peek()=='('){
                    return 1;
                    
                }else{
                    int k = 0;
                    while(st.peek()!='('){
                        k++;
                        st.pop();
                    }
                    
                    if(k==1){
                        return 1;
                    }
                    
                    st.pop();       //pop opening parenthesis
                }
            }
            else{
                st.push(ch);
            }
        }
        return 0;
    }
}
