package com.Burhan;

public class Pattern_15 {
    public static void main(String[] args) {
        pattern(4);
        
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2*n; j++) {
                if (j==n-i || j==n+i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 1; j < 2*n; j++) {
                if (j==n-i-1 || j==n+i-1) {
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
