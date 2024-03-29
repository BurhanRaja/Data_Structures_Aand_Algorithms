package com.Burhan;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        int m = s1.length();
        int n = s2.length();

        memo = new int[m+1][n+1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(lcs2(s1, s2, m, n));

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Naive
    static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            return 1 + lcs(s1, s2, m-1, n-1);
        }
        else {
            return Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
        }
    }

    // Efficient
    static int[][] memo;
    static int lcs2(String s1, String s2, int m, int n) {
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        if (m == 0 || n == 0) {
            memo[m][n] = 0;
        }

        if (s1.charAt(m-1) == s2.charAt(n-1)) {
            memo[m][n] =  1 + lcs(s1, s2, m-1, n-1);
        }
        else {
            memo[m][n] = Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
        }

        return memo[m][n];
    }
}