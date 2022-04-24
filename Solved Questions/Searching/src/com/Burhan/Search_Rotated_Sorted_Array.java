package com.Burhan;

public class Search_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        int ans = numRotated(arr, target);
        System.out.println(ans);
    }

    static int numRotated(int[] arr, int target) {
        int pivot = pivotNum(arr);

        if (arr[pivot] == target) {
            return pivot;
        }

        int firstHalf = binarySearch(arr, target, 0, pivot-1);

        if (firstHalf != -1) {
            return firstHalf;
        }
        else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }


    // {3, 4, 5, 6, 7, 0, 1, 2}
    static int pivotNum(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            // Take it the pivot as target and and middle element
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            // if the middle element of an array is less than previous of mid element.
            // Doing it for the second half array
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            // Taking second half of array and provind condition that if the mid element is less than start element than make end as mid-1 else make start as mid+1
            if (nums[mid] <= nums[start]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {;

        while (start <= end) { 
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
