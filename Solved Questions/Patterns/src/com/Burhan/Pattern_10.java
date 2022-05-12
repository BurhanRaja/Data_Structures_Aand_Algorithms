package com.Burhan;

public class Pattern_10 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i+1; k > 1; k--) {
                System.out.print("*");
            }
            for (int h = i-1; h >= 1; h--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = 1; l <= n; l++) {
            for (int m = 1; m <= n-l; m++) {
                System.out.print(" ");
            }
            for (int o = 1; o < l+1; o++) {
                System.out.print("*");
            }
            for (int p = 1; p <= l-1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
