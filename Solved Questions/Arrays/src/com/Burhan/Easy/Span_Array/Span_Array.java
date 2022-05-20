package com.Burhan.Easy.Span_Array;

// Difference between Maximum and minimum element in an array.

public class Span_Array {
    public static void main(String[] args) {
        int[] arr = {6, 15, 30, 40, 4, 11, 9};

        span(arr);
        System.out.println(span(arr));
    }

    static int span(int[] array) {
        int n = array.length;
        int max = 0;
        int min = n-1;

        for (int i = 0; i < n; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            if (array[i] < array[min]) {
                min = i;
            }
        }
        int ans = array[max] - array[min];

        return ans;
    }
}
