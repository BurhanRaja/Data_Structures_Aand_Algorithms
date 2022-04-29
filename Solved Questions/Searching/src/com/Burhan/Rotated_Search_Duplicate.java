package com.Burhan;

public class Rotated_Search_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        int ans = numRotated(arr, 2);
        System.out.println(ans);
    }

    static int numRotated(int[] nums, int target) {
        int pivot = pivotNum(nums);

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

    // Answer will be find as same as the search in simple rotated array 

    static int pivotNum(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        while (start <= end) {
            int mid = start + (end-start)/2;


            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            // skip the duplicate
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

                // Checking wheteher the start and ends are pivots
                if (nums[start] > nums[start+1]) {
                    return start;
                }
                start++;

                if(nums[end] < nums[end-1]) {
                    return end-1;
                }
                end--;
            }
            // Checking if start < mid (sorted left side) or mid = start (after the pivot part) and mid > end (after the pivot part)
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid+1;
            }
            else {
                end = mid-1;
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
