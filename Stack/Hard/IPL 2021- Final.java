/******************************************************************************************************************************************************

IPL 2021 Finals are here and it is between the most successful team of the IPL Mumbai Indians and the team striving to garb their first trophy Royal Challengers Banglore.
Rohit Sharma, captain of the team Mumbai Indians has the most experience in IPL finals, he feels lucky if he solves a programming question before the IPL finals. 
So, he asked the team's head coach  Mahela Jayawardene for a question. Question is, given a string S consisting only of opening and closing parenthesis 'ie '('  and ')', 
the task is to find out the length of the longest valid parentheses substring.

NOTE: The length of the smallest valid substring ( ) is 2.

---------------------------------------------------------------------------------------

Example 1:

Input: S = "(()("
Output: 2
Explanation: The longest valid 
substring is "()". Length = 2.
Example 2:

Input: S = "()(())("
Output: 6
Explanation: The longest valid 
substring is "()(())". Length = 6.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution {
    static int findMaxLen(String s) {
        int ans = 0;
        
        // pushing indexes in stack -> start with -1
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();
                
                if(st.size() > 0){
                    int length = i - st.peek();
                    ans = Math.max(length , ans);
                }
                else{
                    // pushing itself
                    st.push(i);
                }
            }
        }
        return ans;
      }
   }
