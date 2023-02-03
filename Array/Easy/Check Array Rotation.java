/**********************************************************************************************************************************************

Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

-------------------------------------------------------------------------------------------------------------------

Example 1:

Input:
N = 5
Arr[] = {5, 1, 2, 3, 4}
Output: 1
Explanation: The given array is 5 1 2 3 4. 
The original sorted array is 1 2 3 4 5. 
We can see that the array was rotated 
1 times to the right.

Example 2:

Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}
Output: 0
Explanation: The given array is not rotated.

-------------------------------------------------------------------------------------------------------------------

***************************************************************************************************************************************************/

// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int rotationNum = 0;
	    
	    for(int i=0; i<n-1; i++){
	        
	        if(arr[i] > arr[i+1]) return i+1;
	    }
	    
	    return rotationNum;
    }
}
