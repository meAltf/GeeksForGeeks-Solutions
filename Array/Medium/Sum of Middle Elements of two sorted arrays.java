/******************************************************************************************************************************************************

Given 2 sorted arrays Ar1 and Ar2 of size N each. Merge the given arrays and find the sum of the two middle elements of the merged array.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 5
Ar1[] = {1, 2, 4, 6, 10}
Ar2[] = {4, 5, 6, 9, 12}
Output: 11
Explanation: The merged array looks like
{1,2,4,4,5,6,6,9,10,12}. Sum of middle
elements is 11 (5 + 6).
 

Example 2:

Input:
N = 5
Ar1[] = {1, 12, 15, 26, 38}
Ar2[] = {2, 13, 17, 30, 45}
Output: 32
Explanation: The merged array looks like
{1, 2, 12, 13, 15, 17, 26, 30, 38, 45} 
sum of middle elements is 32 (15 + 17).

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        
       ArrayList<Integer>arr = new ArrayList<>();
       
       for(int i = 0; i<n; i++){
           arr.add(ar1[i]);
           arr.add(ar2[i]);
       }
       
       Collections.sort(arr);
       
       return arr.get(n)+arr.get(n-1);
    }
}
