package com.Burhan;

import java.util.*;

public class Intersection_Array {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,8,4,9};

        int[] arr = intersection(nums1, nums2);
        System.out.println(Arrays.toString(arr));

    }

    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        if (nums1.length > nums2.length) {
            Arrays.sort(nums1);
            for (int i = 0; i < nums2.length; i++) {
                if (binarySearch(nums1, nums2[i], 0, nums1.length)) {
                    list.add(nums2[i]);
                }
            }
        }

        if (nums2.length > nums1.length) {
            for (int i = 0; i < nums1.length; i++) {
                Arrays.sort(nums2);
                if (binarySearch(nums2, nums1[i], 0, nums2.length)) {
                    list.add(nums1[i]);
                }
            }
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
