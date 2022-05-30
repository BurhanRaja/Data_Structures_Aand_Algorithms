package com.Burhan;

// import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
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
