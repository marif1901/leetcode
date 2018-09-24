// Given a sorted integer array without duplicates, return the summary of its ranges.

// Example 1:

// Input:  [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
// Example 2:

// Input:  [0,2,3,4,6,8,9]
// Output: ["0","2->4","6","8->9"]
// Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result= new ArrayList<String>();
        if (nums==null || nums.length ==0) return result;
        String s ="";
        int len=nums.length;
        int back=0,front=0;
        for (int i=1;i<len;i++)
        {
            if(nums[i]-nums[i-1]==1) front =i;
            else 
               {
                   if(front-back>=1)
                        result.add(s+nums[back]+"->"+nums[front]);
                    else
                        result.add(s+nums[back]);
                   back=i;front =i;s="";
               }
        }
        if(front!=back)
            result.add(s+nums[back]+"->"+nums[front]);
        if (front ==back) 
            result.add(s+nums[back]);
        return result;
    }
}