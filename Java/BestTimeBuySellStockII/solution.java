// Say you have an array for which the ith element is the price of a given stock on day i.

// Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

// Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

// Example 1:

// Input: [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//              Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.


public class Solution {
    public int maxProfit(int[] p) {
        if(p==null || p.length<=1) return 0;
        int n=p.length,i=0;
        stock s[]=new stock[n/2+1];//stores the indices of buy and sell day
        int count=0; 
        while(i<n-1) //Note i goes till n-2 as we compare the next with previous to get minimum
        {
            while(i<n-1 && p[i+1]<=p[i])
                i++;
            if(i==n-1) break;
            int buy=i++;
            while(i<n && p[i]>p[i-1])
                i++;
            int sell=i-1;
            s[count]=new stock(buy,sell);
            count++;
        }
        int result=0;
        for(i=0;i<count;i++)
        {
            result+=p[s[i].sell]-p[s[i].buy];
        }
        return result;
    }
}
class stock
{
    int buy;
    int sell;
    stock(int x,int y)
    {
        this.buy=x;
        this.sell=y;
    }
}