// Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// Example 1:

// Given nums = [1,1,1,2,2,3],

// Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

// It doesn't matter what you leave beyond the returned length.

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if (nums.length<=2) return len;
        int count=1,k=1;
        for (int i=1;i<len;i++)
        {
            if (nums[i]==nums[i-1])
                k++;
            else if(nums[i]!=nums[i-1])
                k=1;
            if(k>2)
                continue;
            nums[count]=nums[i];
            count++;
        }
        return count;
        /*easy solution /*int i = 0;
                        for (int n : nums)
                        if (i < 2 || n > nums[i-2])
                            nums[i++] = n;
                        return i;*/
    }
}