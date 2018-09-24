// Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

// Note:

// All numbers will be positive integers.
// The solution set must not contain duplicate combinations.
// Example 1:

// Input: k = 3, n = 7
// Output: [[1,2,4]]
// Example 2:

// Input: k = 3, n = 9
// Output: [[1,2,6], [1,3,5], [2,3,4]]


public class Solution {
    List<List<Integer>> res = new ArrayList<>();
public List<List<Integer>> combinationSum3(int k, int n) {
    int[] can = {1,2,3,4,5,6,7,8,9};
    Arrays.sort(can);
    helper(can, 0, n, new ArrayList<Integer>(), k);
    return res;
}

private void helper(int[] can, int start, int target, List<Integer> each, int len) {
    if (each.size() >= len) {return;}
    for (int i = start; i < can.length; i++) {
        List<Integer> temp = new ArrayList<>(each);
        if (can[i] == target) {
            if (each.size() == len - 1) {
                temp.add(can[i]);
                res.add(temp);
            }
            break;
        } else if (can[i] < target) {
            temp.add(can[i]);
            helper(can, i+1, target-can[i], new ArrayList<>(temp),len);
        } else {break;}
    }
    return;
}
}