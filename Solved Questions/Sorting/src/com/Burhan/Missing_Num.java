package com.Burhan;

class Missing_Num {
    public static void main(String[] args) {
        int[] arr = {4, 0, 1, 2};
        // int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = cyclic_sort(arr);
        // cyclic_sort(arr);
        System.out.println(ans);

    }

    // static int cyclic_sort(int[] arr) {
    //     int i = 0;
    //     while (i < arr.length) {
    //         int index = arr[i];
    //         if (arr[i] < arr.length && arr[i] != arr[index]) {
    //             swap(arr, index, i);
    //         }
    //         else {
    //             i++;
    //         }
    //     }

    //     // System.out.println(Arrays.toString(arr));
    //     for (int j = 0; j < arr.length; j++) {
    //         if (arr[j] != j){
    //             return j;
    //         }
    //     }
    //     return arr.length;
    // }
    static int cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i]-1;
            if (index >= 0 && arr[i] != arr[index]) {
                swap(arr, index, i);
            }
            else {
                i++;
            }
        }

        // System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                return j+1;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}