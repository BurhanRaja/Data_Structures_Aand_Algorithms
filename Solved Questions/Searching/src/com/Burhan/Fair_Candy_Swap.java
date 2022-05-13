package com.Burhan;

import java.util.Arrays;

class Fair_Candy_Swap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,2,5};
        int[] bobSizes = {2,4};
        int[] answer = swap_candy(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(answer));
    }

    static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
        }

        return false;
    }
    static int[] swap_candy(int[] aliceSizes, int[] bobSizes) {
        int totalAlice = 0, totalBob = 0;
        for(int i=0; i<aliceSizes.length; i++){
            totalAlice += aliceSizes[i];
        }
        for(int i=0; i<bobSizes.length; i++){
            totalBob += bobSizes[i];
        }
        int difference = (totalAlice - totalBob) / 2;

        Arrays.sort(aliceSizes);
        for(int i=0; i<bobSizes.length; i++){
            if(binarySearch(aliceSizes, difference+bobSizes[i])){
                return new int[]{difference+bobSizes[i], bobSizes[i]};
            }
        }
        return null;
    }
}