# Find Best Time to Buy and Sell Stocks

## input
[7,1,5,3,6,4]

[7,6,5,4,3,1]

## Explanation
Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (i.e, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Return the maximum possible profit.

## Solution
we shall initialise maxProfit = 0 and minPrice = a max value
Iterate through the list update the minPrice if it's less than arr[i]
else if find the profit by min arr[i] - minprice then checking if it's greater than max profit

## code
```java
class Main {
    public static int maxProfit(int prices[]) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if ((prices[i] - minPrice) > maxPrice) {
                maxPrice = prices[i] - minPrice;
            }
        }
        return maxPrice;
    }
}
```