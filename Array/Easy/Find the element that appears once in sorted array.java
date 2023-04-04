/******************************************************************************************************************************************************

Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice. 

---------------------------------------------------------------------------------------
Example 1:

Input:
N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that 
appears exactly once.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

Approach-1 ______O(n)
-----------------------
  

//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int ans = 0;
        
        for(int i=0; i<n; i++) ans = ans^arr[i];
        
        return ans;
    }
}


_______________________
Approach-2  O(logn)
_______________________

//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int start = 0, end = arr.length - 1;
        
    	while(start <= end) {
    		
    		int mid = (start + end) / 2;
    		
    		if(mid % 2 == 1) {
    			
    			if(mid > 0 && arr[mid] == arr[mid - 1]) start = mid + 1;
    			
    			else end = mid - 1;
    			
    		}else {
    			
    			if(mid < arr.length - 1 && arr[mid] == arr[mid + 1]) start = mid + 1;
    			
    			else end = mid - 1;
    		}
    	}
    	
    	return arr[start];
    }
}
