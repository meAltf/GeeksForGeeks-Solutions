/******************************************************************************************************************************************************

Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:

Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        //create to HashMap to store
        HashMap<Integer,Integer> map=new HashMap<>();
    
            int count=0;
            for(int i=0;i<n;i++){
                
                int diff = k-arr[i];
                
                if(map.containsKey(diff)){
                    count+= map.get(diff);
                }
                
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }else{
                    map.put(arr[i],1);
                }
            }
            
            return count;
    }
}
