/******************************************************************************************************************************************************

Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.

---------------------------------------------------------------------------------------

Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
Example 2:

Input:
n = 5, X = 10
arr[] = [1 2 4 3 6]
Output:
1
Explanation:
The triplet {1, 3, 6} in 
the array sums up to 10.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int x) { 
        
        Arrays.sort(arr);
        
        int left, right;

        for(int i=0;i<n;i++){
            
            left=i+1;
            right=arr.length-1;
            
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==x){
                    return true;
                    
                }else if(sum<x){
                    left++;
                    
                }else {
                    right--;
                }
            }
        }
     return false;
    } 
}
