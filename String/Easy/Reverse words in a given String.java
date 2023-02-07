/******************************************************************************************************************************************************

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

---------------------------------------------------------------------------------------

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String input)
    {
        // code here
        
        int end=input. length() ;
        int i=input. length()-1;
        String output="" ;
        while(i>=0){ 
            if(input.charAt(i)=='.')
               { output =output + input. substring(i + 1,end)+ "."; 
                end=i ; 
               }
             i--; } 
               output+=input.substring(i+1,end);
               return output;

    }
}
