package com.Burhan;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 30};
        int[] b = {1, 12, 18, 27};
        // int[] ans = mergeArr(a, b);
        int[] ans = mergeSortedArray(a, b);
        System.out.println(Arrays.toString(ans));
    }

    // O(m+n)
    static int[] mergeArr(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int m = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            m++;
        }
        for (int i = 0; i < b.length; i++) {
            c[m] = b[i];
            m++;
        }
        Arrays.sort(c);
        return c;
    } 

    static int[] mergeSortedArray(int[] a, int[] b) {
        int[] mergeArr = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                mergeArr[k] = a[i];
                i++;
            }
            else {
                mergeArr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            mergeArr[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            mergeArr[k] = b[j];
            j++;
            k++;
        }

        return mergeArr;
    }
}