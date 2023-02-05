/******************************************************************************************************************************************************

Given an array A of N integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n 1.
You are allowed to rearrange the elements of the array.
Note: Since output could be large, hence module 109+7 and then print answer.

---------------------------------------------------------------------------------------

Example 1:

Input : Arr[] = {5, 3, 2, 4, 1}
Output : 40
Explanation:
If we arrange the array as 1 2 3 4 5 then 
we can see that the minimum index will multiply
with minimum number and maximum index will 
multiply with maximum number. 
So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40

Example 2:

Input : Arr[] = {1, 2, 3}
Output : 8

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java


class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        
        int mod = 1000000007;
     
        Arrays.sort(arr);
        
        long ans = 0;
        
        for(int i=0;i<n;i++)
            ans = (ans + ((long)arr[i]*i)%mod )%mod;
        
        return (int)ans;
    }   
}
