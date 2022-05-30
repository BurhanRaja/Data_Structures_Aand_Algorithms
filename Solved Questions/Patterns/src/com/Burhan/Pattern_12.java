package com.Burhan;

public class Pattern_12 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 1; j < 2*n; j++) {
                if (i%2==0 && j>=n-i && j<=n+i && j%2!=0) {
                    System.out.print("*");
                }
                else if (i%2!=0 && j>=n-i && j<=n+i && j%2==0) {
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
