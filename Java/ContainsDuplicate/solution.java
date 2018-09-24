// Given an array of integers, find if the array contains any duplicates.

// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

// Example 1:

// Input: [1,2,3,1]
// Output: true
// Example 2:

// Input: [1,2,3,4]
// Output: false
// Example 3:

// Input: [1,1,1,3,3,4,3,2,4,2]
// Output: true

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<=1) return false;
        Arrays.sort(nums);
        for(int i=0,j=1;i<nums.length-1 && j<nums.length;i++,j++)
        {
            if (nums[i]==nums[j]) return true;
        }
        return false;
    }
}