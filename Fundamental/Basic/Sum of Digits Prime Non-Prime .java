/******************************************************************************************************************************************************

Given a number N, you need to write a program that finds the sum of digits of the number till the number becomes a single digit and then check whether the number
is Prime/Non-Prime.

---------------------------------------------------------------------------------------

Example 1:

Input:
N=5602
Output:
0
Explanation:
1st step=5+6+0+2=13
2nd step=1+3=4
Since 4 is not prime, so answer is 0.

Example 2:

Input:
N=12
Output:
1
Explanation:
1st step=1+2=3
Since, 3 is prime, so answer =1.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution
          {
 public int digitSum(int num)
 {
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
     return sum;
    }
	int digitPrime(int N){
	     while(digitSum(N)>9){
	       N=digitSum(N);
	    }
	    int val=digitSum(N);
	    if(val==2||val==3||val==5||val==7){
	        return 1;
	    }
	  return 0;
	}
}
