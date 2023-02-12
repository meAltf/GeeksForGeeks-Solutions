/******************************************************************************************************************************************************

Gievn two numbers A and B, the task is to find f(AB). f(n) which takes a positive integer n as input and does the following:

f(n):

if n < 10

    return n

else return f( sum_of_digits(n) 

---------------------------------------------------------------------------------------

Example 1:

Input: A = 6, B = 6
Output: 9
Explanation: 
f(66) = f(46656) = f(27) = f(9) = 9
Example 2:

Input: A = 7, B = 3
Output: 1
Explanation: 
f(73) = f(343) = f(10) = f(1) = 1

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Solution
{
    public static int digSum(int n)
	{
		if (n == 0)
			return 0;
		return (n % 9 == 0) ? 9 : (n % 9);
	}

    public int SumofDigits(int A, int B){
        int sum = digSum(A);

		int rem = B % 6;

		if ((sum == 3 || sum == 6) && B > 1)
			return 9;

		else if (B == 1)
			return sum;

		else if (B == 0)
			return 1;

		else if (rem == 0)
			return digSum((int)Math.pow(sum, 6));

		else
			return digSum((int)Math.pow(sum, rem));
    }
}
