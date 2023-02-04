/******************************************************************************************************************************************************

Given two numbers represented by two different arrays A and B. The task is to find the sum array.
The sum array is an array representation of addition of two input arrays.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 3, M = 3
A[] = {5, 6, 3}
B[] = {8, 4, 2}
Output: 1 4 0 5
Explanation: As 563 + 842 = 1405.

Example 2:

Input:
N = 6, M = 4 
A[] = {2, 2, 7, 5, 3, 3}
B[] = {4, 3, 3, 8}
Output: 2 3 1 8 7 1
Explanation: As 227533 + 4338 = 231871.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java


class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
            int i=a.length-1,j=b.length-1;
            
            int sum=0,carry=0;
            
            while(i>=0&&j>=0){
                
            sum=a[i]+b[j]+carry;
            ans.add(sum%10);
            carry=sum/10;
            i--;
            j--;
            }
            
            while(i>=0){
            sum=a[i]+carry;
            ans.add(sum%10);
            carry=sum/10;
            i--;
            }
            
            while(j>=0){
            sum=b[j]+carry;
            ans.add(sum%10);
            carry=sum/10;
            j--;
            }
            
            if(carry!=0){
            ans.add(carry);
            }
            
            Collections.reverse(ans);
            return ans;
            }
}
