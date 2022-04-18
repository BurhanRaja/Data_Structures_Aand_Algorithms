package com.Burhan;

public class Stock_Buy_Sell {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 12};
        System.out.print(profit(array));
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
}
