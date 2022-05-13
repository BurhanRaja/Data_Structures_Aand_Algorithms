package com.Burhan.Easy;

import java.util.Arrays;

public class Insert_in_Array {
    public static void main(String[] args) {
        
        // Fixed and usorted array
        int[] arr = new int[5];

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        // arr = {5, 10, 20, _, _}

        // insert(array, no. of filled place in array, integer to insert, index to insert the given x)
        insert(arr, 3, 7, 1);
        System.out.println(Arrays.toString(arr));
        // arr = {5, 7, 10, 20, _}
        // insert(arr, 4, 3, 1);
        // System.out.println(Arrays.toString(arr));
        // arr = {5, 3, 7, 10, 20}
    
    }

    // This is only possible in fixed array
    static void insert(int[] any, int n, int x, int index) {
        int cap = 5;

        // If the filled places == full capacity of an array
        if (n == cap) {
            // print -1
            System.out.println(-1);
        }

        // n-1 = 2 i.e. 0, 1, 2
        // index is the index number where you have to insert the given number
        for (int i = n-1; i >= index; i--) {
            any[i+1] = any[i];
        }
        // x is the number to be added
        any[index] = x;
    }
}
