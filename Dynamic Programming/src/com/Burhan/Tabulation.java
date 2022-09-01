package com.Burhan;

// Bottom Up Approach

public class Tabulation {
    public static void main(String[] args) {
        int n = 6;
        int ans = fib(n);
        System.out.println(ans);
    }

    static int[] memo;

    static int fib(int n) {
        int[] f = new int[n+1];
        f[0] = 0; f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
