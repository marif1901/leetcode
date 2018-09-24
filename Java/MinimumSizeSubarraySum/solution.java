// Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

// Example: 

// Input: s = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: the subarray [4,3] has the minimal length under the problem constraint.


public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int l=nums.length;
        if(nums==null || l==0 ) return  0;
        int front=0,back=0,min=Integer.MAX_VALUE;
        while(front<l)
        {
            s-=nums[front++];
            while(s<=0)
            {
                min=Math.min(min,front-back);
                s+=nums[back++];
            }
        }
        return min==Integer.MAX_VALUE ? 0:min;
    }
}
