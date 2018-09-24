// Count the number of prime numbers less than a non-negative number, n.

// Example:

// Input: 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.


public class Solution {
    public int countPrimes(int n) {
       if(n<=2 ) return 0;
       int [] a= new int [n+1];
       int count =0;
       for (int i=2;i<n;i++)
       {
           if(a[i]==0) 
            {
                count++;
                int j=2;
                while(i*j<n)
                {
                    a[i*j]=1;
                    j++;
                }
            }
       }
       return count;
    }
}