/**
Problem: Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.


Example: 
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

Solution: Sliding window. Created two indexes one for start and end. Iterating the int array, find the smallest number in the array and next index existed/larger than the start index. Then, subtract them to get the max result. If the next...smaller than previous, update the following index to previous(start) and the end index will keep increasing.

*/

class Solution {
    public int maxProfit(int[] prices) {
        int ret=0, start=0, end=1;
        
        while(start<prices.length && end<prices.length) {
            if(prices[start] > prices[end]) {
                start = end;
                end++;
            } else {
                ret = Math.max(ret, prices[end]-prices[start]);
                end++;
            }
        }
        
        return ret;
    } 
} 
