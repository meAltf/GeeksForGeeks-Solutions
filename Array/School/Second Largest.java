/****************************************************************************************************************************************


Given an array Arr of size N, print second largest distinct element from an array.


---------------------------------------------------------------------

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34

Explanation: The largest element of the 
array is 35 and the second largest element
is 34.

Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5

Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.


*******************************************************************************************************************************************/


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        int firstLargest = -1;
        int secondLargest = -1;
        
        for(int i=0; i<n; i++){
            
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            
            if(arr[i] > secondLargest && arr[i] < firstLargest){
                secondLargest = arr[i];
            }
            
        }
        
        return secondLargest;
    }
}
