/******************************************************************************************************************************************************

Given an array arr[] of n numbers. The task is to print only those numbers whose digits are from set {1,2,3}.

---------------------------------------------------------------------------------------

Example 1:

Input:
n = 3
arr[] = {4,6,7}
Output: -1
Explanation: No elements are there in the 
array which contains digits 1, 2 or 3.

Example 2:

Input:
n = 4
arr[] = {1,2,3,4}
Output: 1 2 3
Explanation: 1, 2 and 3 are the only 
elements in the array which conatins 
digits as 1, 2 or 3.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/


//Function to find all the numbers with only 1,2 and 3 in their digits.
public static void findAll()
{
    //Your code here  hm
    for(int i=1;i<1000001;i++){
        if(isSafe(i)){
            mp.put(i,1);
        }
    }
}
static boolean isSafe(int i){
    int x = 0;
    while(i!=0){
        x = i%10;
        if(x==0 || x==4 || x==5 || x==6 || x==7 || x==8 || x==9){
            return false;
        }
        i=i/10;
    }
    return true;
}
  
