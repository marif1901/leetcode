// Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

// Example:

// Input: 13
// Output: 6 
// Explanation: Digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.


public class Solution {
    public int countDigitOne(int n) {
        return f(n);
    }
    private int f(int n)
    {
        if(n<=0) return 0;
        else if(n<=9) return 1;
        int temp=n,d=-1;
        while(temp!=0)
        {
            d++;
            temp/=10;
        }
        int p=(int)Math.pow(10,d);
        if(p==n) return 1+f(p-1);
        else if(n/p==1) return 1+n%p+f(p-1)+f(n%p);
        else return (n/p)*f(p-1)+f(n%p)+p;
    }
}