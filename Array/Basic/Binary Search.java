/***********************************************************************************************************

Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

-------------------------------------------------------------------------
Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

-----------------------------------------------------------------------

****************************************************************************************************************/


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0;
        int end = n-1;
        
        while(start<=end){
            
            int mid = (start+end)/2;
            
            if(arr[mid]>k){
                
                end = mid-1;
                
            } else if(arr[mid]<k){
                
                start = mid +1;
                
            } else {
                
                return mid;
            }
        }
        return -1;
    }
}
