package com.Burhan;

import java.util.Arrays;

public class Rank_Transform {
    public static void main(String[] args) {
        // int[] arr = {40, 30, 20, 10};
        // int[] arr = {37,12,28,9,100,56,80,5,12};
        // int[] arr = {100, 100, 100};
        int[] arr = {2,-11,24,15,26,-31,-48,-49, 22,37,-36};
        // {-49, -48, -36, -31, -11, 2, 15, 22, 24, 26, 37}
        arrayRankTransform(arr);
    }

    static void arrayRankTransform(int[] arr) {
        
        int[] sortArr = new int[arr.length];
        int[] res = new int[arr.length];

        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = arr[i];
        }
        
        Arrays.sort(sortArr);

        int count = 1;
        for (int i = 0; i < sortArr.length; i++) {
            if (i < sortArr.length-1 && sortArr[i] == sortArr[i+1]) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (sortArr[i] == arr[j]) {
                    res[j] = count;
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(res));
    }

    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
