package com.Burhan;

public class Find_Min_RotatedSortedArray {
    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2};
        // int[] arr = {0,1,2,4,5,6,7};
        int[] arr = {3,4,5,1,2};
        int ans = findMin(arr);
        // findMin(arr);
        System.out.println(ans);
    }

    static int findMin(int[] nums) {
        int pivot = pivotNum(nums);
        
        if (pivot==-1) {
            return 0;
        }
        
        return pivot+1;
    }
    
    static int pivotNum(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start+(end-start)/2;
            
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid]<= arr[start]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
