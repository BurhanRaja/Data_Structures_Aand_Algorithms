package com.Burhan;

// Check whether an array is sorted or not

public class Sorted_Or_Not {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {34, 9, 40, 57, 12};
        // System.out.println(sortOrNot(arr));
        System.out.println(sorted(arr));
        // System.out.println(Arrays.toString(arr));
    }

    // Naive Method
    static boolean sortOrNot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Efficient
    static boolean sorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }
}
