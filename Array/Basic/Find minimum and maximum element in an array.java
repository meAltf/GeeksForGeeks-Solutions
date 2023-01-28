/**************************************************************************************************************************

Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 -------------------------------------------------------------

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789

-------------------------------------------------------------------


******************************************************************************************************************************/


class Solution{
    static int isPrime(int N){
        // code here
        
        if(N==1){
            return 0;
        }
        
        int i=2;
        
        while(i*i<=N){
            if(N%i == 0){
                return 0;
            }
            i++;
        }
        
        
        // for(int i=2; i<N; i++){
            
        //     if(N%i == 0){
        //         return 0;
        //     }
            
        // }
        
        return 1;
    }
}
