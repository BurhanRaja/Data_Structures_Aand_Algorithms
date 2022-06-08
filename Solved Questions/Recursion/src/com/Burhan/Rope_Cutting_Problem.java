package com.Burhan;


// Time Complexity = O(3^n)
public class Rope_Cutting_Problem {
    public static void main(String[] args) {
        // int n = 23;
        // int a = 11;
        // int b = 9;
        // int c = 12;
        int n = 5;
        int a = 2;
        int b = 5;
        int c = 1;

        int ans = ropeCut(n, a, b, c);
        System.out.println(ans);
    }

    static int ropeCut(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n<0) {
            return -1;
        }
        int res = Math.max(ropeCut(n-a, a, b, c), ropeCut(n-b, a, b, c));
        res = Math.max(res, ropeCut(n-c, a, b, c));

        if (res==-1) {
            return -1;
        }
        return res+1;
    }
}
