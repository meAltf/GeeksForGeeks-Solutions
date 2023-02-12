/******************************************************************************************************************************************************

Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.

---------------------------------------------------------------------------------------

Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[m+i+1];
        }
        
        int i=0,j=0,k=l;
        
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
}
