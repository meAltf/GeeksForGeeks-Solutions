/******************************************************************************************************************************************************

Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

---------------------------------------------------------------------------------------

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.

Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        for (int i = 0; i < n - 1; i++) {
            
            HashSet<Integer> s = new HashSet<Integer>();
            
            for (int j = i + 1; j < n; j++) {
                
                int x = -(arr[i] + arr[j]);
                
                if (s.contains(x))  return true;
                else    s.add(arr[j]);
            }
        }
        return false;
    }
}
