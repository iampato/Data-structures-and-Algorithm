package me.iampato.datatstructures.buysellstocks;

public class Main {
    // input: prices = [7,1,5,3,6,4]
    // Output = 5
    // Explanation: buy the stock on the second day at 1 and then sell at the 5th day at 6
    // profit = 6-1 =5

    // Thinking process
    // we shall initialise maxProfit = 0 and minPrice = a max value
    // Iterate through the list update the minPrice if it's less than arr[i]
    // else if find the profit by min arr[i] - minprice then checking if it's greater than max profit

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

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int res = maxProfit(prices);
        System.out.println(res);
    }
}
