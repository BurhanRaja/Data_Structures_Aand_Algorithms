package com.Burhan;

// import java.util.*;

public class Maximum_of_Subarray {
    public static void main(String[] args) {
        int[] arr = {10,8,5,12,15,7,6};
        int k = 3;
        maxSubarray(arr, k);
    }

    // O(n*(n-k+1))
    static void maxSubarray(int[] arr, int k) {
        for (int i = 0; i < arr.length ; i++) {
            int max = 0;
            if (k+i > arr.length) {
                break;
            }
            for (int j = i; j < k+i; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }

    // O()

}

