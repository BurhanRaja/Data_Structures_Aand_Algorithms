package com.Burhan.Find_Set_Bits;

public class Find_Set_bits {
    public static void main(String[] args) {
        int n = 45;
        int count = 0;
        // while (n > 0) {
        //     if ((n&1) == 1) {
        //         count++;
        //     }
        //     n = n>>1;
        // }
        // System.out.println(count);
    
        // Another way
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        System.out.println(count);
    }
}
