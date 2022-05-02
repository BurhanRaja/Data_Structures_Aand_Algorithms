package com.Burhan;

import java.util.*;

public class Two_Sum_two {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1};
        int[] ans = twoSum(arr, -3);
        // int ans = binarySearch(arr, -3, 1, arr.length);
        // System.out.println(ans);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int sum = 0;
        
        while (start <= end) {
            sum = arr[start] + arr[end];

            if (sum == target) {
                return new int[]{start+1, end+1};
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        return new int[2];
    }

}
