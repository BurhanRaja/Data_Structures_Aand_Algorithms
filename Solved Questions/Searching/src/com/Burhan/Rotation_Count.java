package com.Burhan;

public class Rotation_Count {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        int ans = rotateCount(arr);
        System.out.println(ans);
    }

    static int rotateCount(int[] arr) {
        int pivotNumber = pivotNum(arr);

        return pivotNumber + 1;
    }

    static int pivotNum(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // {4, 5, {{6, 7}}, 0, 1, 2, 3}
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // {4, 5, 6, {{7, 0}}, 1, 2, 3}
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

                // Checking wheteher the start and ends are pivots
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Checking if start > mid or mid = start and mid > end
            else if (nums[start] > nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
