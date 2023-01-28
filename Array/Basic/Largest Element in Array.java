/****************************************************************************************************************************

Given an array A[] of size n. The task is to find the largest element in it.

-----------------------------------------------------

Example 1:

Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.
 

Example 2:

Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output:
5
Explanation:
The largest element of given array is 5.

------------------------------------------------------

******************************************************************************************************************************/

//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n)
    {
        
       Arrays.sort(arr);
       
       return arr[n-1];
    }
}
