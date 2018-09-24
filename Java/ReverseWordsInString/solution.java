// Given an input string, reverse the string word by word.

// Example:  

// Input: "the sky is blue",
// Output: "blue is sky the".
// Note:

// A word is defined as a sequence of non-space characters.
// Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
// You need to reduce multiple spaces between two words to a single space in the reversed string.

public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        if(s==null || s.length()==0) return "";
        String result="";
        int start=0;
        int i=0;
        for(;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c==' ')
            {
                result=s.substring(start,i)+result;
                while(i<s.length() && s.charAt(i)==' ')
                    i++;
                if(i!=s.length())
                    result=' '+result;
                start=i;
            }
        }
        result=s.substring(start,i)+result;
        return result;
        
    }
}