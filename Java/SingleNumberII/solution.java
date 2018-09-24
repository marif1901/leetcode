// Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

// Note:

// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

// Example 1:

// Input: [2,2,3,2]
// Output: 3
// Example 2:

// Input: [0,1,0,1,0,1,99]
// Output: 99


public class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<32;i++)
        {
            int a=0;
            for(int m:nums)
            {
                a+= (m& 1);
            }
            if(i==31)
                {if(a%3==0) return result;
                    else return result+(1<<31);
                }
            else
                result+=Math.pow(2,i)*(a%3);
            
            for(int j=0;j<nums.length && i<31;j++) nums[j]>>=1;
        }
        return (result);
    }
}