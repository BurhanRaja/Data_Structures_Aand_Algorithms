package com.Burhan;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, -1, 3, 7, 10};
        System.out.println(linearSearch(arr, 5));
    }

    static int linearSearch(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == target) {
                return i;
            }
            i++;
        }
        return -1;
    }
}