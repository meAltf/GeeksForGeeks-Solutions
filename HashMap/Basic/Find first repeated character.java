/******************************************************************************************************************************************************

Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of 
second occurrence is smallest. S contains only lowercase letters.

---------------------------------------------------------------------------------------

Example 1:

Input: S="geeksforgeeks"
Output: e
Explanation: 'e' repeats at third position.
 

Example 2:

Input: S="hellogeeks"
Output: l
Explanation: 'l' repeats at fourth position.
 

Example 3:

Input: S="abc"
Output: -1
Explanation: There is no repeated character.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        
        char[] arr =s.toCharArray();
        
        HashMap<Character,Integer> ans=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(ans.containsKey(arr[i])){
                ans.put(arr[i],ans.get(arr[i])+1);
                
                return ""+arr[i];
            }
            else{
                ans.put(arr[i],1);
            }
        }
        return "-1";
    }
} 
