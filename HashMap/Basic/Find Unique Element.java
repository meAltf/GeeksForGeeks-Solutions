/******************************************************************************************************************************************************

Given an array of size n which contains all elements occurring in multiples of K, except one element which doesn't occur in multiple of K. Find that unique element.

---------------------------------------------------------------------------------------

Example 1:

Input : 
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output : 
5
Explanation:
Every element appears 3 times except 5.
 

Example 2:

Input  : 
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java



class Solution {
    
    public int findUnique(int a[], int n, int k)
    {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            
        }
        
        for(int i:map.keySet()){
            if(map.get(i)%k!=0){
                return i;
            }
        }
        return -1;
    }
}
