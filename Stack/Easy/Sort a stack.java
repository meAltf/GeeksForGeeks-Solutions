/******************************************************************************************************************************************************

Given a stack, the task is to sort it such that the top of the stack has the greatest element.

---------------------------------------------------------------------------------------

Example 1:

Input:
Stack: 3 2 1
Output: 3 2 1
Example 2:

Input:
Stack: 11 2 32 3 41
Output: 41 32 11 3 2

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.

		int arr[] = new int[s.size()];
		int i=0;
		
		//fill stack value in array until stack is not empty
		 while(s.size() != 0)
		    arr[i++] = s.pop();
		
		//sort the array
		java.util.Arrays.sort(arr);
		
		//fill the array value in stack until reached array's length
		for( i=0; i<arr.length; i++){
		    s.push(arr[i]);
		}
		
		return s;
		
	}
}
