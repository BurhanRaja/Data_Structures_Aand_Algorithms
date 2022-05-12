package com.Burhan;

public class Pattern_9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i+1; k > 1 ; k--) {
                System.out.print("*");
            }
            for (int h = i-1; h >= 1; h--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
