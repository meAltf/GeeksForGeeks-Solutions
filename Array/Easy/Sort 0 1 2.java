/*****************************************************************************************************************************************

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

----------------------------------------------------------------------------------------------------------

Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

----------------------------------------------------------------------------------------------------------


*****************************************************************************************************************************************/

class Solution
{
    public static void sort012(int arr[], int m)
    {
        // code here 
        
        int n = arr.length-1;  //because we want to store 2's element at last index of array
		//create a variable to take care of sort elements from initial...
		int nSort = 0;
		int i=0;
		
		while(i <= n) {
			
			if(arr[i] == 0) {
				int tempZero = arr[nSort];
				arr[nSort] = arr[i];
				arr[i] = tempZero;
				nSort++;
				i++;
				
			}else if(arr[i] == 2) {
				int tempTwo = arr[n];
				arr[n] = arr[i];
				arr[i] = tempTwo;
				n--;
				
			}else {
				i++;
			}
		}
    }
}
