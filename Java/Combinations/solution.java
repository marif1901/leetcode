// Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

// Example:

// Input: n = 4, k = 2
// Output:
// [
//   [2,4],
//   [3,4],
//   [2,3],
//   [1,2],
//   [1,3],
//   [1,4],
// ]


public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(n<k) return result;
        int[] x=new int[n];
        combine(0,x,k,result);
        return result;
    }
    public void combine(int index,int[] x,int count,List<List<Integer>> result)
    {
        if(index >x.length-1) return ;
        x[index]=1;
        count--;
        if(count==0)
        {
            List<Integer> temp=new ArrayList<Integer>();
            for(int g=0;g<=index;g++)
            {
                if(x[g]==1)
                    temp.add(g+1);
            }
            result.add(temp);
        }
        else 
            combine(index+1,x,count,result);
        if(index<=x.length-2)
            {
                x[index]=0;
                combine(index+1,x,++count,result);
            }
    }
}