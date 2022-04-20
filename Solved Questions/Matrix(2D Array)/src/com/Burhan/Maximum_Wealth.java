package com.Burhan;

public class Maximum_Wealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,5},
            {7,3},
            {3,5}
        };
        
        System.out.println(MaxWealth(arr));
    }

    static int MaxWealth(int[][] accounts) {
        int n = accounts.length;
        int[] wealth = new int[n];
        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
                wealth[row] = sum;
            }
        }
        int maxWealth = wealth[0];
        for (int i = 0; i < wealth.length; i++) {
            maxWealth = Math.max(maxWealth, wealth[i]);
        }
        return maxWealth;
    }
}
