// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

// Your algorithm's runtime complexity must be in the order of O(log n).

// If the target is not found in the array, return [-1, -1].

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result=new int[2];
        int temp=0,k=0,h=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                temp++;
                if(temp==1)
                    {k++;
                    result[0]=i;}
                else
                    {h++;
                    result[1]=i;}
            }
        }
        if(k==0 && h==0)
           {result[0]=-1;result[1]=-1;}
        else if(k>0 && h==0)
            {result[1]=result[0];
            }
            return result;
    }
}