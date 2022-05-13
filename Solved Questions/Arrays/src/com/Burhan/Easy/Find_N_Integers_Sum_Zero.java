package com.Burhan.Easy;

import java.util.*;

public class Find_N_Integers_Sum_Zero {
    public static void main(String[] args) {
        int n = 9;
        int[] ans = ZeroArr(n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ZeroArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 2*i-n+1;
        }
        return arr;
    }
}
