package com.Burhan;

public class Pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2*n; j++) {
                if (i==n-1) {
                    System.out.print("*");
                }
                else if (j==n-i || j==n+i) {
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
