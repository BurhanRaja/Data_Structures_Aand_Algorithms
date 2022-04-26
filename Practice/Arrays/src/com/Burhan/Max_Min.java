package com.Burhan;

public class Max_Min {
    public static void main(String[] args) {
        long[] arr = {3, 2, 1, 56, 10000, 167};
        minMax(arr, arr.length);
    }

    static void minMax(long[] arr, long n) {
        long maxVal = 0;
        long minVal = arr[(int) (n-1)];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }

       System.out.println(maxVal+" "+minVal);
    }
}
