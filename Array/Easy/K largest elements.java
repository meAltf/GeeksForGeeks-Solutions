/******************************************************************************************************************************************************

Given an array of N positive integers, print k largest elements from the array. 

---------------------------------------------------------------------------------------
Example 1:

Input:
N = 5, k = 2
arr[] = {12,5,787,1,23}
Output: 787 23
Explanation: First largest element in
the array is 787 and the second largest
is 23.
Example 2:

Input:
N = 7, k = 3
arr[] = {1,23,12,9,30,2,50}
Output: 50 30 23
Explanation: Three Largest element in
the array are 50, 30 and 23.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        Arrays.sort(arr);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=n-1; i>=n-k; i--){
            
            result.add(arr[i]);
        }
        
        return result;
    }
}
