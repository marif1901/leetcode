// Given a string, find the length of the longest substring without repeating characters.

// Example 1:

// Input: "abcabcbb"
// Output: 3 
// Explanation: The answer is "abc", with the length of 3. 
// Example 2:

// Input: "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3. 
//              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

public class Solution {
    public int lengthOfLongestSubstring(String s) {
       if (s.length() == 0)
        return 0;

    int longest = 1;
    String sub = "" + s.charAt(0);

    for (int end = 1; end < s.length(); end++) {
        int index = sub.indexOf(s.charAt(end));
        if (index != -1) {
            longest = (sub.length() > longest) ? sub.length() : longest;
            sub = sub.substring(index + 1, sub.length());
        }
        sub += s.charAt(end);
    }
    longest = (sub.length() > longest) ? sub.length() : longest;
    return longest;
}
}

