// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Note: The algorithm should run in linear time and in O(1) space.

// Example 1:

// Input: [3,2,3]
// Output: [3]
// Example 2:

// Input: [1,1,1,3,3,2,2,2]
// Output: [1,2]


public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<Integer>();
        int a=0,b=1,counta=0,countb=0;
        for(int j=0;j<nums.length;j++)
        {
            if (nums[j]==a)
                counta++;
            else if(nums[j]==b)
                countb++;
            else if (counta==0)
                {a=nums[j];counta++;}
            else if(countb==0)
                {b=nums[j];countb++;}
            else 
                {counta--;countb--;}
        }
        int ca=0,cb=0;
        for (int h=0;h<nums.length;h++)
        {
            if (nums[h]==a) ca++;
            else if (nums[h]==b) cb++;
        }
        if (ca>nums.length/3 )
            result.add(a);
        if(cb>nums.length/3)
            result.add(b);
        return result;
    }
}