// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
// Note:

// All given inputs are in lowercase letters a-z.

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        String lcp=strs[0];
        for(int i=1; i<strs.length;i++)
        {
            StringBuilder sb =new StringBuilder();
            for(int j=0;j< Math.min(lcp.length(),strs[i].length());j++)
            {
                char c1=lcp.charAt(j);
                char c2=strs[i].charAt(j);
                if (c1==c2)
                    sb.append(c1);
                else 
                    break;
            }
            lcp=sb.toString();
        }
        return lcp;
    }
}