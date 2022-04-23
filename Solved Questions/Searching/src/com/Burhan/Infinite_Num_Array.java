package com.Burhan;

public class Infinite_Num_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200, 210, 250, 270, 300};
        int target = 130;
        System.out.println(infiniteArray(arr, target));
    }

    static int infiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            start = end+1;
            end = 2*start+1;
        }
        
        return binarySearch(arr, target, start, end);
         
    }

    static int binarySearch(int[] arr, int target, int start, int end) {;

        while (start <= end) { // when condition hit start <= end and start = end + 1 we return it;
            int mid = start + (end - start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
