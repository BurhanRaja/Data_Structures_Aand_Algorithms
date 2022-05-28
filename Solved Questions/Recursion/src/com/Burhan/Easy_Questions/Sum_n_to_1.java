package com.Burhan.Easy_Questions;

public class Sum_n_to_1 {
    public static void main(String[] args) {
        int n = 6;
        int ans = sumNum(n);
        System.out.println(ans);
    }

    static int sumNum(int n) {
        if (n <= 1) {
            return 1;
        }

        return n+sumNum(n-1);
    }
}
