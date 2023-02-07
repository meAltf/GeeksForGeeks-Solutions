/******************************************************************************************************************************************************

Given an array Arr of N positive integers. Find the maximum possible value of K such that the array has at-least K elements that are greater than or equal to K.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 6
Arr[] = {2, 3, 4, 5, 6, 7}
Output: 4
Explanation: 4 elements [4, 5, 6, 7] 
are greater than equal to 4.

Example 2:

Input:
N = 4
Arr[] = {1, 2, 3, 4}
Output: 2
Explanation: 3 elements [2, 3, 4] are 
greater than equal to 2.


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    int findMaximumNum(int[] arr, int n) {
        // code here
        
       int max = n;
        
       Arrays.sort(arr);
       
       for(int i=0; i<n; i++){
           
           if(arr[i] < max){
               max--;
           }
       }
       return max;
    }
}
