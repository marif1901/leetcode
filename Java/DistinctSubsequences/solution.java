// Given a string S and a string T, count the number of distinct subsequences of S which equals T.

// A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

// Example 1:

// Input: S = "rabbbit", T = "rabbit"
// Output: 3
// Explanation:

// As shown below, there are 3 ways you can generate "rabbit" from S.
// (The caret symbol ^ means the chosen letters)

// rabbbit
// ^^^^ ^^
// rabbbit
// ^^ ^^^^
// rabbbit
// ^^^ ^^^
// Example 2:

// Input: S = "babgbag", T = "bag"
// Output: 5
// Explanation:

// As shown below, there are 5 ways you can generate "bag" from S.
// (The caret symbol ^ means the chosen letters)

// babgbag
// ^^ ^
// babgbag
// ^^    ^
// babgbag
// ^    ^^
// babgbag
//   ^  ^^
// babgbag
//     ^^^

//     

//distinct subsequences of String T in String S
public class Solution {
    public int numDistinct(String s, String t) {
        int len1=t.length();
        int len2=s.length();
        if(len2==0 && len1!=0) return 0;
        if(len2==0 && len1==0) return 1;
        int  dp[][]=new int[len1+1][len2+1];
        for(int i=0;i<=len2;i++)
            dp[0][i]=1;
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                if(t.charAt(i-1)==s.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
                else
                    dp[i][j]=dp[i][j-1];
                    
            }
        }
        return dp[len1][len2];
    }
}