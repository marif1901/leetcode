// Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

// Note:

// The solution set must not contain duplicate quadruplets.

// Example:

// Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

// A solution set is:
// [
//   [-1,  0, 0, 1],
//   [-2, -1, 1, 2],
//   [-2,  0, 0, 2]
// ]

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i ++) {
            for (int j = i + 1; j < nums.length - 2; j ++) {
                int head = j + 1;
                int tail = nums.length - 1;
                while (head < tail) {
                    int tempSum = nums[i] + nums[j] + nums[head] + nums[tail];
                    if (tempSum == target) {
                        List<Integer> item = new ArrayList<Integer>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[head]);
                        item.add(nums[tail]);
                        if (result.contains(item) == false) {
                            result.add(item);
                        } 
                        head ++;
                        tail --;
                    } else if (tempSum < target) {
                        head ++;
                    } else {
                        tail --;
                    }
                }
            }
        }
        return result;
    }
}