/******************************************************************************************************************************************************

This is a functional problem. Your task is to return the product of array elements under a given modulo.
The modulo operation finds the remainder after the division of one number by another. For example, K(mod(m))=K%m= remainder obtained when K is divided by m.

---------------------------------------------------------------------------------------

Example:

Input:
1
4
1 2 3 4

Output:
24


----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//User function Template for Java

/*  
     arr[] is the array
     n = number of element in array
     mod = modulo value;
*/
class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        
        long prod = 1;
        
        for(int i=0; i<n; i++){
            
            prod = (prod*arr[i])%mod;
            
        }
        
        return prod;
    }
}
