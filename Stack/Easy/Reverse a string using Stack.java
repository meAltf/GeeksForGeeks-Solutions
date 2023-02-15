/******************************************************************************************************************************************************

You are given a string S, the task is to reverse the string using stack.

---------------------------------------------------------------------------------------

Example 1:


Input: S="GeeksforGeeks"
Output: skeeGrofskeeG

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    
    public String reverse(String S){
        //code here
        
        Stack<Character>st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        String str="";
        while(!st.empty()){
            str+=st.peek();
            st.pop();
        }
        return str;
    }

}
