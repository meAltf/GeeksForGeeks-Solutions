/******************************************************************************************************************************************************

Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
Explaination: 3 occurs three times.


Example 2:

Input:
N = 7
Arr[] = {5, 7, 2, 7, 5, 2, 5}
Output: 5
Explaination: 5 occurs three times.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        
        //simply Use XOR operation property
        
      int ans =0;
      
      for(int i=0; i<n; i++){
          ans = ans^arr[i];
      }
      return ans;
    }
}
