package com.Burhan;

import java.util.Arrays;

public class Arranging_Coins {
    public static void main(String[] args) {
        long n = 1082972973;
        int ans = arrangeCoin2(n);
        System.out.println(ans);
    }

    // Naive Solution
    static int arrangeCoin(int n) {
        int count = n;
        for (int i=0; i<n; i++) {
            int[] arr = new int[i+1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = count;
                if (count == 0) {
                    return arr.length-1;
                }
                count--;
                System.out.println(Arrays.toString(arr));
            }
        }
        return 1;
    }

    // Efficient
    static int arrangeCoin2(long n) {
        long count = 0;
        long s=n;

        for (int i = 1; i <= n; i++) {
            s = s-i;

            if (s >= 0) {
                count++;
            }
            else {
                break;
            }
        }
        return (int) count;
    }
}
