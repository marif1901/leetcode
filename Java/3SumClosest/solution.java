// Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

// Example:

// Given array nums = [-1, 2, 1, -4], and target = 1.

// The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){

            int head=i+1, tail=nums.length-1;
            while(head<tail){
            int sum=nums[i]+nums[head]+nums[tail];
            if(sum==target) return target;
            result=(Math.abs(result-target)> Math.abs(sum-target))? sum : result;
            if(sum<target) {
                head++;
            }
            else {
                tail--;
            }
        }
    }
    return result;
    }
}