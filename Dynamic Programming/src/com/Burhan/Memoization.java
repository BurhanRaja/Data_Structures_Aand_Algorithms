package com.Burhan;

import java.util.Arrays;

// Top Down Approach 

public class Memoization {
    public static void main(String[] args) {
        int n = 6;
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println(fib(n));
    }

    static int[] memo;

    static int fib(int n) {
        if (memo[n] == -1) {
            int res;
            if (n==0 || n==1) {
                return n;
            }
            else {
                res = fib(n-1) + fib(n-2);
            }
            memo[n] = res;
        }
        return memo[n];
    }
}