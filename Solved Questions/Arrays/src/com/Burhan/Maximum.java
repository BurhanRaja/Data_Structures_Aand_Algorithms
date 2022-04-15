package com.Burhan;

// Maximum in an array

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 65};

        max(arr);
    }

    static void max(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int maxValue = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
       System.out.println(maxValue); 
    }
}
