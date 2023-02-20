/******************************************************************************************************************************************************

Given an array arr of N integers that might contain duplicates, find the element whose last appearance is earliest.

---------------------------------------------------------------------------------------

Example 1:

Input : arr[] = {10, 30, 20, 10, 20}
Output : 30
Explanation:
Below are indexes of last
appearances of all elements (0 based
indexes). 10 last occurs at index 3
30 last occurs at index 1. 20 last
occurs at index 4 The element whose
last appearance earliest is 30.
 

Example 2:

Input : arr[] = {10, 20, 30, 40, 10}
Output : 20

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Check{
    
    static int lastSeenElement(int arr[], int n) 
    { 
        // Complete the function 
        
       HashMap<Integer,Integer> map  = new HashMap<>();
       
       for(int i = 0;i < n;i++)
       {
           map.put(arr[i],i);
       }
       
       int min= Integer.MAX_VALUE;
       for(int i = 0; i < n ;i++)
       {
           
           min = Math.min(map.get(arr[i]),min);
       }
       
       return arr[min];
    } 
}

