package com.Burhan;

public class Peak_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 10, 5, 4};
        // int[] arr = {0, 2, 1, 0};
        // int[] arr = {0,10,5,2};
        int ans = peakNum(arr);
        System.out.println(ans);
    }

    static int peakNum(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            // Instead of target we are doing comparison with the numbers elements around the mid;

            if (arr[mid+1] > arr[mid]) {
                start = mid+1;
            }
            else if(arr[mid-1] > arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        } 
        return -1;
    }
}
