// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Example 1:

// Input: "A man, a plan, a canal: Panama"
// Output: true
// Example 2:

// Input: "race a car"
// Output: false

public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        int k=0,h=s.length()-1;
        while(k<h)
        {
            if(!Character.isLetterOrDigit(s.charAt(k)))
                k++;
            if(!Character.isLetterOrDigit(s.charAt(h)))
                h--;
            if(Character.isLetterOrDigit(s.charAt(k)) && Character.isLetterOrDigit(s.charAt(h)))
            {
                if(Character.toLowerCase(s.charAt(k))!=Character.toLowerCase(s.charAt(h))) 
                    return false;
                else
                    k++;h--;
            }
        }
        return true;
    }
}
