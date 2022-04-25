package com.Burhan;

public class Rotated_Search_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 2, 9, 2, 2};
        int ans = pivotNum(arr);
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
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

                // Checking wheteher the start ans ends are pivots
                if (nums[start] > nums[start+1]) {
                    return start;
                }
                start++;

                if(nums[end] < nums[end-1]) {
                    return end-1;
                }
                end--;
            }
            // Checking if start > mid or mid = start and mid > end
            else if (nums[start] > nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
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
