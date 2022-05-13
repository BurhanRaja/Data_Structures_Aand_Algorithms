package com.Burhan.Easy;

import java.util.Arrays;

// Reversing the array

public class Reverse {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 23, 45, 65};

        // reverse(array)
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Naive Method
    // {{{{
    static int[] reverse(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
        return num;
    }

    static void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
    // }}}}


}
