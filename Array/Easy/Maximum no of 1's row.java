/******************************************************************************************************************************************************

Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 3, M = 4
Mat[] = {{0 1 1 1},
         {0 0 1 1},
         {0 0 1 1}}
Output: 0
Explanation: Row 0 has 3 ones whereas
rows 1 and 2 have just 2 ones.

Example 2:

Input: 
N = 2, M = 2
Mat[] = {{0 1},
         {1 1}}
Output: 1
Explanation: Row 1 has 2 ones whereas
row 0 has just a single one. 

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

//User function Template for Java

class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int result = 0;
        int index = 0;
        
        for(int i=0; i<Mat.length; i++){
            
            int onesNum = 0;
            for(int j=0; j<Mat[0].length; j++){
                
                if(Mat[i][j] == 1) onesNum++;
                
                if(result < onesNum){
                    result = onesNum;
                    index = i;
                }
            }
        }
        return index;
    }
}
