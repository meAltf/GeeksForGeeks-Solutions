/******************************************************************************************************************************************************

Given a number N, find the total sum of digits of all the numbers from 1 to N.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 5
Output:
15
Explanation:
Sum of digits of number from 1 to 5:
1 + 2 + 3 + 4 + 5 = 15
Example 2:

Input:
N = 12
Output
51
Explanation:
Sum of all digits from 1 to 12 is:
1+2+3+4+5+6+7+8+9+(1+0)+(1+1)+(1+2) = 51

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution{
    static int sumOfDigits(int N){
        //code here
        int s=0;
        for(int i=1;i<=N;i++)
        {
            if(i<10)
            s=s+i;
            else
            {
                for(int j=i;j>0;j/=10)
                s=s+j%10;
            }
        }
        return s;
    }
}
