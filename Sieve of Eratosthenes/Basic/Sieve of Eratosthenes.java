/******************************************************************************************************************************************************
Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 10

Output:
2 3 5 7

Explanation:
Prime numbers less than equal to N 
are 2 3 5 and 7.
Example 2:

Input:
N = 35

Output:
2 3 5 7 11 13 17 19 23 29 31

Explanation:
Prime numbers less than equal to 35 are
2 3 5 7 11 13 17 19 23 29 and 31.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution{
    
    private static boolean isPrime(int n){
        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
     return true;
    }
    
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=2; i<=N; i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }
}
