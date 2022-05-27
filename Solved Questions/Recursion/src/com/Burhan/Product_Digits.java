package com.Burhan;

public class Product_Digits {
    public static void main(String[] args) {
        int n = 2345;
        int ans = productDigits(n);
        System.out.println(ans);
    }

    static int productDigits(int n) {
        if (n <= 0) {
            return 1;
        }
        return (n%10) * productDigits(n /= 10);
    }
}
