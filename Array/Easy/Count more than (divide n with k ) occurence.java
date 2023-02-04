/******************************************************************************************************************************************************

Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 8
arr[] = {3,1,2,2,1,2,3,3}
k = 4
Output: 2
Explanation: In the given array, 3 and
 2 are the only elements that appears 
more than n/k times.

Example 2:

Input:
N = 4
arr[] = {2,3,3,2}
k = 3
Output: 2
Explanation: In the given array, 3 and 2 
are the only elements that appears more 
than n/k times. So the count of elements 
are 2.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        
        int count=0;
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            
            else
            {
                mp.put(arr[i],1);
            }
        }
        
        for(Integer i:mp.values())
        {
            if(i>(n/k))
            {
                count++;
            }
        }
        
        
        return count;
        
    }
}
