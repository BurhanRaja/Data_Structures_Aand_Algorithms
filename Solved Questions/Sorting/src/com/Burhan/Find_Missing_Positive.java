package com.Burhan;

public class Find_Missing_Positive {
    public static void main(String[] args) {
        // int[] arr = {7,8,9,11,12};
        // int[] arr = {1};
        // int[] arr = {1,2,0};
        int[] arr = {3,4,-1,1};
        int ans = missingPos(arr);
        System.out.println(ans);
    }

    static int missingPos(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[index]) {
                swap(arr, index, i);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
