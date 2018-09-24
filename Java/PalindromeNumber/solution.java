// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

// Example 1:

// Input: 121
// Output: true
// Example 2:

// Input: -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

public class Solution {
    public boolean isPalindrome(int i) {
        if (i<0) return false;
        int input = i; 
        int rev = 0;
        while (i > 0) {
            rev = rev * 10 + (i % 10);
            i /= 10;
        }
        if (rev == input)
            return true; 
        else 
            return false;
    }
}