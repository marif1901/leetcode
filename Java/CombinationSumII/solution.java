// Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

// Each number in candidates may only be used once in the combination.

// Note:

// All numbers (including target) will be positive integers.
// The solution set must not contain duplicate combinations.
// Example 1:

// Input: candidates = [10,1,2,7,6,1,5], target = 8,
// A solution set is:
// [
//   [1, 7],
//   [1, 2, 5],
//   [2, 6],
//   [1, 1, 6]
// ]
// Example 2:

// Input: candidates = [2,5,2,1,2], target = 5,
// A solution set is:
// [
//   [1,2,2],
//   [5]
// ]

public class Solution {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates.length==0 || candidates==null) return result;
        Arrays.sort(candidates);
        int sum=0;
        int [] x= new int [candidates.length];
        for (int i:candidates) sum+=i;
        SumOfSubset(candidates,target,0,0,sum,x,result);
        return result;
    }
    public void SumOfSubset(int[] a,int t,int s,int k,int r,int[] x,List<List<Integer>> result)
    {
        
        if (k>a.length-1) return;
        x[k]=1;
        if (s+a[k]==t) Add(a,k,result,x);
        if(k==a.length-1) return ;
        else if (s+a[k]+a[k+1]<=t) 
            SumOfSubset(a,t,s+a[k],k+1,r-a[k],x,result);
        if((s+r-a[k] >=t) && (s+a[k+1]) <=t)
        {
            x[k]=0;
            SumOfSubset(a,t,s,k+1,r-a[k],x,result);
        }
    }
    public void Add(int[] a,int k,List<List<Integer>> result,int[] x)
    {
        List<Integer> sub=new ArrayList<Integer>();
        for (int j=0;j<=k;j++)
        {
            if (x[j]==1)
                sub.add(a[j]);
        }
        if(!result.contains(sub))
            result.add(sub);
    }
}