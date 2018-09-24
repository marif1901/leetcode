// Implement pow(x, n), which calculates x raised to the power n (xn).

// Example 1:

// Input: 2.00000, 10
// Output: 1024.00000
// Example 2:

// Input: 2.10000, 3
// Output: 9.26100
// Example 3:

// Input: 2.00000, -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

public class Solution {
    public double myPow(double x, int n) {
        if (n==0) return 1;
        
        if(-n>0)
           { 
               double l=myPow(x,-n/2);
               if(n%2==0)
                return 1/(l*l);
            else
                return 1/(x*l*l);
           }
       else
           {
               double l=myPow(x,n/2);
               if(n%2==0)
                return (l*l);
            else
                return (x*l*l);
           }
    }
}