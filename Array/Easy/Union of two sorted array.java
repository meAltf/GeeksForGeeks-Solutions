/******************************************************************************************************************************************************

Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.

---------------------------------------------------------------------------------------

Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5.

Example 2:

Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5.

Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 1 2
Explanation: Distinct elements including 
both the arrays are: 1 2.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
    
        HashSet<Integer> set=new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
        {
            set.add(arr1[i]);
        }
        
        for(int i=0;i<m;i++)
        {
            set.add(arr2[i]);
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(set);
        
        Collections.sort(list);
        
        return list;
        
    }
}
