package com.Burhan;

public class Find_Duplicate_Num {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int ans = findDup(arr);
        System.out.println(ans);
    }

    static int findDup(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i]-1;
            if (arr[i] != arr[index]) {
                swap(arr, index, i);
            }
            else {
                i++;
            }
        }

        // System.out.println(Arrays.toString(arr));

        for (int j = 1; j <= arr.length; j++) {
            if (arr[j-1] != j) {
                return arr[j-1];
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
