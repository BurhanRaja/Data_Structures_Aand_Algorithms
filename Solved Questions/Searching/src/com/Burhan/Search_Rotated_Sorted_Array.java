package com.Burhan;

public class Search_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3};
        int target = 1;
        // int ans = numRotated(arr, target);
        int ans = pivotNum(arr);
        System.out.println(ans);
    }

    static int numRotated(int[] nums, int target) {
        int pivot = pivotNum(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
        
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

    static int binarySearch(int[] arr, int target, int start, int end) {

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
