package com.Burhan.Easy.Maximum_Number;

// Maximum in an array

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 65};

        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int end = arr.length - 1;
        int maxValue = 0;

        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[maxValue]) {
                maxValue = i;
            }
        }
       return arr[maxValue]; 
    }
}
