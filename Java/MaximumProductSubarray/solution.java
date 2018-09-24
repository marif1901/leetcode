// Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

// Example 1:

// Input: [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

public class Solution {
    public int maxProduct(int[] nums) {
        int l=nums.length;
        if(nums==null || l==0) return 0;
        int max_p=Integer.MIN_VALUE,p=1;
        for(int i=0;i<l;i++)
        {
            p*=nums[i];
            max_p=Math.max(max_p,p);
            if(p==0) p=1;
        }
        p=1;
        for(int j=l-1;j>=0;j--)
        {
            p*=nums[j];
            max_p=Math.max(max_p,p);
            if(p==0) p=1;
        }
        return max_p;
    }
}