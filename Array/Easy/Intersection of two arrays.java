/*****************************************************************************************************************************************

Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 


----------------------------------------------------------------------------------------------------------


Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays.

Example 2:

Input:
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 6}
b[] = {3, 4, 5, 6, 7} 

Output: 4

Explanation: 
3 4 5 and 6 are the elements 
in the intersection of two arrays.


----------------------------------------------------------------------------------------------------------


*****************************************************************************************************************************************/

class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        HashSet<Integer> ans = new HashSet<>();
        
        int i=0, j=0;
        
        while(i < n && j < m){
            
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]) i++;
            else if(a[i] > b[j]) j++;
        }
        return (ans.size());
    }
};
