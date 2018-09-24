// Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Note:

// The solution set must not contain duplicate triplets.

// Example:

// Given array nums = [-1, 0, 1, 2, -1, -4],

// A solution set is:
// [
//   [-1, 0, 1],
//   [-1, -1, 2]


public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if(num.length <= 2 || num == null)
            return resultList;
        Arrays.sort(num);
        HashSet<ArrayList<Integer>> tracker = new HashSet<ArrayList<Integer>>();
        int len = num.length;
        for(int i = 0; i < len-2; i++){
            //left
            int j = i+1;
            //right
            int k = len-1;
            while(j < k){
                int sum = num[i] + num[j] + num[k];
                if(sum == 0){
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(num[i]);
                    temp.add(num[j]);
                    temp.add(num[k]);
                    if(tracker.add(temp)){
                        resultList.add(temp);
                    }
                    j++;
                    k--;
                    //HERE'S THE TRICK!
                    //We want to avoid summing up the same three elements again.
                    //So, we move the left and right pointers until they are different from previous result.
                    while(j < k && num[j] == num[j-1]){
                        j++;
                    }
                    while(j < k && num[k] == num[k+1]){
                        k--;
                    }
                } 
                else if(sum < 0)
                    j++;
                else if(sum > 0)
                    k--;
            }
        }
        return resultList;
    }
}