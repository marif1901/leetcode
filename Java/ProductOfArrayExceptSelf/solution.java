// Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input:  [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).


public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len =nums.length;
        int [] result= new int[len];
        if (nums==null || nums.length <1) return result;
        int[] temp =new int[len];
        int [] temp1=new int [len];
        temp[0]=1; temp1[len-1]=1;
        for (int i=1;i<len && len-i>=1;i++)
        {
            temp[i]=nums[i-1]*temp[i-1];
            temp1[len-1-i]=nums[len-i]*temp1[len-i];
        }
        for (int j=0;j<len;j++)
        {
            result[j]=temp[j]*temp1[j];
        }
        return result;
        
    }
}