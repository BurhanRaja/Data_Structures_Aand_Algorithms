package com.Burhan;

public class Pattern_9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 1; j < 2*n; j++) {
                if (j==n) {
                    System.out.print("*");
                }
                else if (j >= n-i && j <= n+i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
