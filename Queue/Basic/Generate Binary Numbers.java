/******************************************************************************************************************************************************

Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 2
Output: 
1 10
Explanation: 
Binary numbers from
1 to 2 are 1 and 10.

Example 2:

Input:
N = 5
Output: 
1 10 11 100 101
Explanation: 
Binary numbers from
1 to 5 are 1 , 10 , 11 , 100 and 101.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here 
        
        ArrayList<String>al = new ArrayList<>();
        
        for(int i=1;i<=N;i++){
            String str = "";
            int temp = i;
            while(temp>0){
                int rem = temp%2;
                str = rem+str;
                temp /= 2;
            }
            al.add(str);
        }
        
        return al;
    }
    
}
