// Say you have an array for which the ith element is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

// Note that you cannot sell a stock before you buy one.

// Example 1:

// Input: [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//              Not 7-1 = 6, as selling price needs to be larger than buying price.
// Example 2:

// Input: [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transaction is done, i.e. max profit = 0.

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1) return 0;
        //Assumig atleast two stock prices are given
        int max_diff=prices[1]-prices[0];
        int min_elem=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]-min_elem>max_diff)
                max_diff=prices[i]-min_elem;
            if(prices[i]<min_elem)
                min_elem=prices[i];
        }
        return (max_diff>0)?max_diff:0;
    }
}