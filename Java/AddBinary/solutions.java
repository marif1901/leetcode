// Given two binary strings, return their sum (also a binary string).

// The input strings are both non-empty and contains only characters 1 or 0.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"

public class Solution {
    public String addBinary(String a, String b) {
    int carry = 0;
    String result = "";
    for(int i=a.length()-1, j=b.length()-1; i>=0||j>=0; i--,j--) {
        int ai= i>=0? a.charAt(i)-'0':0;
        int bj= j>=0? b.charAt(j)-'0':0;
        int val = (ai + bj + carry) %2;
        carry = (ai + bj + carry)/2;
        result = result + val;
    }

    if(carry == 1) {
        result += 1;
    }

    return new StringBuilder(result).reverse().toString();
    }
}