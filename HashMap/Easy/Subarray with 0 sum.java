/******************************************************************************************************************************************************
-------------------
Level- Easy
----------------------
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

---------------------------------------------------------------------------------------

Example 1:

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
Example 2:

Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

Approach-1 [Brute-Force]
--------------------------

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        for(int i=0; i<arr.length; i++){
            
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                
                sum += arr[j];
                if(sum == 0) return true;
            }
        }
        
        return false;
    }
}


-------------------------
Approach-2 [Optimize]
-------------------------
  
  class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        Set<Integer> storeValue = new HashSet<>();
        
        int sum = 0;
        for(int element : arr){
            
            storeValue.add(sum);
            sum += element;
            
            if(storeValue.contains(sum)) return true;
        }
        
        return false;
    }
}
  
  
