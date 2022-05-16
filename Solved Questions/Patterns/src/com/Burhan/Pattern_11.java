package com.Burhan;

class Pattern_11 {
    public static void main(String[] args) {
    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    // ***********

    pattern(5);

    }

    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            // For the first half triangle
            for (int j = 1; j <= n; j++) {
                if (j==n-i+1) {
                    System.out.print("*");
                }
                else if (i==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            // For next Half traingle
            if (i>=2) {
                for (int j = 1; j <= n-1; j++) {
                    if (j==i-1) {
                        System.out.print("*");
                    }
                    else if (i==n) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}