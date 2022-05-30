package com.Burhan;

public class Pattern_10 {
    public static void main(String[] args) {
        pattern(5);
    }

    // Combining the patterns 11 and 12
    static void pattern(int n) {
        // Upper triangle i.e. rotated triangle by 180 degree
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
        
        // Lower triangle i.e. simple triangle
        for (int i = 0; i < 5; i++) {
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
