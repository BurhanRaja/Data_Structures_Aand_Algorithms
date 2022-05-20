package com.Burhan.Medium.Stock_Buy_Sell;

public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        // System.out.print(profit(array));
        System.out.print(max_profit(array));
    }

    static int profit(int[] price) {
        int n = price.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] > price[i-1]) {
                int current_price = price[i] - price[i-1];
                profit += current_price;
            }
        }
        return profit;
    }

    // Maximum number - minimum number i.e. buy price - last sell price
    // In above case 6 - 1 = 5;
    static int max_profit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int minprofit = prices[0];
        
        for (int i=0; i<n; i++) {
            minprofit = Math.min(minprofit, prices[i]);
            int profit = prices[i] - minprofit;
            maxprofit = Math.max(maxprofit, profit);
        }
        
        return maxprofit;
    }
}
