/******************************************************************************************************************************************************

Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.

---------------------------------------------------------------------------------------

Example 1:

Input: S = "GEEKS FOR GEEKS"
Output: "SKEGROF"

Example 2:

Input: S = "I AM AWESOME"
Output: "EMOSWAI"

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        //replace all spaces using replace(" ", "");
        //first store all distinct characters of string in ArrayList 
        //then Reverse the string
        
        s = s.replace(" ", "");
        
        ArrayList<Character> arr = new ArrayList<>();
        
        for(int i=s.length()-1; i>=0; i--){
            
            if(!arr.contains(s.charAt(i))){

                arr.add(s.charAt(i));
            }
        }
        
        String str = "";
        for(int i=0; i<arr.size(); i++){
            
            str = str + arr.get(i);
        }
        
        return str;
    }
}
