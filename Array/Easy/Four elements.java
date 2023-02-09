/******************************************************************************************************************************************************

Given an array A of N integers. You have to find whether a combination of four elements in the array whose sum is equal to a given value X exists or not.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 6
A[] = {1, 5, 1, 0, 6, 0}
X = 7
Output:
1

Explantion:
1, 5, 1, 0 are the four elements which makes sum 7.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Compute
{
    boolean find4Numbers(int A[], int n, int X) 
    {
        
        //first sort the array
        Arrays.sort(A);

        for(int i=0; i<n-2; i++){
            
            for(int j=i+1; j<n-1; j++){
                
                int start = j+1;
                int end = n-1;

                //Binary search using find the third and fourth element simultaneously
                while(end > start){
                    
                    int sum = A[i] + A[j] + A[start] + A[end];
                    
                    if(sum == X)
                        return true;
                        
                    else if(sum > X)
                        end--;
                        
                    else
                        start++;
                }
            }
        }
        
        return false;
        
    }
}
