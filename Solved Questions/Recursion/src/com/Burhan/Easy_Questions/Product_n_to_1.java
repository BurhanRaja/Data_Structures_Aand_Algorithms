package com.Burhan.Easy_Questions;

public class Product_n_to_1 {
    public static void main(String[] args) {
        int n = 4;
        int ans = productNum(n);
        System.out.println(ans);
    }
    static int productNum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * productNum(n-1);
    }
}
