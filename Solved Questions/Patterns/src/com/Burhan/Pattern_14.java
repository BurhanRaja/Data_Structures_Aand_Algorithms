package com.Burhan;

public class Pattern_14 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = n-1; i >= 0; i--) {
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
