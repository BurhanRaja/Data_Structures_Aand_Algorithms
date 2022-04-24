package com.Burhan;

public class Rotated_Search_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 2, 9, 2, 2};
        int ans = pivotNum(arr);
        System.out.println(ans);
    }

    // Answer will be find as same as the search in simple rotated array 

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
            if (nums[mid] == nums[start] && nums[mid] == nums[start]) {
                if (nums[start] > nums[start+1]) {
                    return start;
                }
                start++;

                if(nums[end] < nums[end-1]) {
                    return end-1;
                }
                end--;
            }
        }
        return -1;
    }
}
