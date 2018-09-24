// Given two strings s and t , write a function to determine if t is an anagram of s.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false


public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int len=s.length();
        int [] a=new int [26];
        int [] b=new int [26];
        for(int i=0;i<len;i++)
        {
            a[s.charAt(i)-'a']++;
            b[t.charAt(i)-'a']++;
        }
        for (int j=0;j<26;j++)
            if(a[j]!=b[j]) return false;
        return true;
    }
}