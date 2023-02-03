/****************************************************************************************************************************************

Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while maitaining the order of non-zero elements.

----------------------------------------------------------------------------------------------

Example 1:

Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.

Example 2:

Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.

------------------------------------------------------------------------------------------------


*****************************************************************************************************************************************/

//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        
        int count =0;
        
        for(int i=0; i<n;i++){
            
            //check array element is not equal to zero
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        
        //check if count is less than length of array, means zeros are present in array then insert it
        while( count < n){
            arr[count] = 0;
            count++;
        }
    }
}
