/*
    You are given an array prices, where prices[i] represents the price of a given stock on the -th day. You want to maximize your profit by choosing a single day to buy the stock and a different day in the future to sell it. Your goal is to determine the maximum profit that can be achieved from this transaction. If no profit can be made, return 0.

    Example 1:

    Input: prices = [7, 1, 5, 3, 6, 4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6). Profit = 6 - 1 = 5.

    Example 2:

    Input: prices = [4, 3, 2, 1, 0]
    Output: 0
    Explanation: No profit can be made as the prices are in descending order.
     */

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int x = buyAndSellStock(prices);
        System.out.println(x);
        int[] prices2 = {6, 4, 3, 2, 1};
        int y = buyAndSellStock(prices2);
        System.out.println(y);

    }

    private static int buyAndSellStock(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else { //means buyingPrice>selling price so I will buy
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
