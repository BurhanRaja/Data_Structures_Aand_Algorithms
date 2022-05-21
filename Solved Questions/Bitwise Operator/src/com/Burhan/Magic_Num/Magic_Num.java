package com.Burhan.Magic_Num;

public class Magic_Num {
    public static void main(String[] args) {
        int n = 6; // change this to get different results
        // 6 = 110 // 0*5^1 + 1*5^2 + 1*5^3
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n&1;
            ans += last*base;
            n = n>>1;
            base *= 5;
        }

        System.out.println(ans);
    }
}
