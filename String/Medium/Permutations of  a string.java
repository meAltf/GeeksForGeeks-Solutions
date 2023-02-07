/******************************************************************************************************************************************************

Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

---------------------------------------------------------------------------------------

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .

Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

class Solution {
    public List<String> find_permutation(String s) {
        // Code here
        
        List<String> list = new ArrayList<>();
        permut(s,"",list);
        Collections.sort(list);
        return list;
    }
    
    public void permut(String s,String ans,List<String> list)
    {
        
        if(s.length()==0)
        {
            if(!list.contains(ans))
            list.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String ss=s.substring(0,i)+s.substring(i+1);
            permut(ss,ans+ch,list);
        }
    }
}
