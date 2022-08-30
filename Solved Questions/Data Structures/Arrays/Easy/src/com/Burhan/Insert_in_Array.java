package com.Burhan;

import java.util.Arrays;

public class Insert_in_Array {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;

        int[] ans = insertAtPos(arr, 10, 2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] insertAtFront(int[] arr, int x) {
        if (arr[arr.length-1] != 0) {
            return arr;
        }
        for (int i = arr.length-2; i >= 0 ; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = x;
        return arr;
    }

    static int[] insertAtPos(int[] arr, int x, int pos) {
        if (arr[arr.length-1] != 0) {
            return arr;
        }

        for (int i = arr.length-2; i >= pos-1; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = x;
        return arr;
    }
}