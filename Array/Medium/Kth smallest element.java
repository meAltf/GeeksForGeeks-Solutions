/******************************************************************************************************************************************************

Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.

Note :-  l and r denotes the starting and ending index of the array.

---------------------------------------------------------------------------------------
Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        Arrays.sort(arr);
        
        int temp = 0;
        
        for(int i=0; i<k; i++){
            
            temp = arr[i];
        }
        
        return temp;
    } 
}
